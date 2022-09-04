package files;

import java.util.ArrayList;
import java.util.List;
import entidades.DetalleFactura;

public class TablaDFacturaVenta extends Archivo {

    private List<DetalleFactura> detallesv = new ArrayList<DetalleFactura>();

    public TablaDFacturaVenta(String ruta) {
        super(ruta, "detallesv", "txt");
    }

    public int size() {
        return detallesv.size();
    }

    public List<DetalleFactura> Seleccionar(String patron) {
        List<DetalleFactura> filtro = new ArrayList<DetalleFactura>();

        for (int i = 0; i < detallesv.size(); i++) {
            if (detallesv.get(i).getCodigo().contains(patron)) {
                filtro.add(detallesv.get(i));
            }
        }

        return filtro;
    }

    public DetalleFactura Seleccionar(DetalleFactura detalleFactura) {
        DetalleFactura detalleFacturaUbicada = null;

        for (int i = 0; i < detallesv.size(); i++) {
            if (detallesv.get(i).getCodigo().equals(detalleFactura.getCodigo())) {
                detalleFacturaUbicada = detallesv.get(i);
                break;
            }
        }

        return detalleFacturaUbicada;
    }

    public int Ubicar(DetalleFactura detalleFactura) {
        int posicion = -1;
        for (int i = 0; i < detallesv.size(); i++) {
            if (detallesv.get(i).getCodigo().equals(detalleFactura.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(DetalleFactura detalleFactura) {
        int posicion;

        posicion = Ubicar(detalleFactura);
        if (posicion == -1) {
            detallesv.add(detalleFactura);
            return new Mensaje("DetalleFactura insertado correctamente", "OK");
        } else {
            return new Mensaje("DetalleFactura ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(DetalleFactura detalleFactura) {
        int posicion;

        posicion = Ubicar(detalleFactura);
        if (posicion != -1) {
            detallesv.set(posicion, detalleFactura);
            return new Mensaje("DetalleFactura actualizada correctamente", "OK");
        } else {
            return new Mensaje("DetalleFactura no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(DetalleFactura detalleFactura) {
        int posicion;

        posicion = Ubicar(detalleFactura);
        if (posicion != -1) {
            detallesv.remove(posicion);

            return new Mensaje("DetalleFactura eliminada correctamente", "OK");

        } else {
            return new Mensaje("DetalleFactura no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (detallesv.size() > 0) {
            detallesv.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < detallesv.size(); i++) {
            cadena = cadena + detallesv.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        DetalleFactura detalleFactura;

//        List<Float> factores = new ArrayList<>();
        List<Float> pu = new ArrayList<>();
        List<String> nombre = new ArrayList<>();
        List<String> unidadmedida = new ArrayList<>();
        List<Float> cantidad = new ArrayList<>();

        if (cadena.length() > 0) {

            for (int i = 0; i < cadena.split("/").length; i++) {
                detalleFactura = new DetalleFactura();
                for (int j = 0; j < cadena.split("/")[i].split("%").length; j++) {

                    if (j == 0) {
                        detalleFactura.setCodigo(cadena.split("/")[i].split("%")[j]);
                    } else {
                        nombre.add(cadena.split("/")[i].split("%")[j].split("-")[0]);
                        cantidad.add(Float.parseFloat(cadena.split("/")[i].split("%")[j].split("-")[1]));
                        unidadmedida.add(cadena.split("/")[i].split("%")[j].split("-")[2]);
                        pu.add(Float.parseFloat(cadena.split("/")[i].split("%")[j].split("-")[3]));
                    }
                }
                detalleFactura.setNombre(nombre);
                detalleFactura.setCantidad(cantidad);
//                detalleFactura.setFactores(factores);
                detalleFactura.setPu(pu);
                detalleFactura.setUnidadmedida(unidadmedida);
                detallesv.add(detalleFactura);
            }
        }
    }
}

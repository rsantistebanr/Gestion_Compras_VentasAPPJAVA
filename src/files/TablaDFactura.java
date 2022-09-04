package files;

import java.util.ArrayList;
import java.util.List;
import entidades.DetalleFactura;

public class TablaDFactura extends Archivo {

    private List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();

    public TablaDFactura(String ruta) {
        super(ruta, "detalles", "txt");
    }

    public int size() {
        return detalles.size();
    }

    public List<DetalleFactura> Seleccionar(String patron) {
        List<DetalleFactura> filtro = new ArrayList<DetalleFactura>();

        for (int i = 0; i < detalles.size(); i++) {
            if (detalles.get(i).getCodigo().contains(patron)) {
                filtro.add(detalles.get(i));
            }
        }

        return filtro;
    }

    public DetalleFactura Seleccionar(DetalleFactura detalleFactura) {
        DetalleFactura detalleFacturaUbicada = null;

        for (int i = 0; i < detalles.size(); i++) {
            if (detalles.get(i).getCodigo().equals(detalleFactura.getCodigo())) {
                detalleFacturaUbicada = detalles.get(i);
                break;
            }
        }

        return detalleFacturaUbicada;
    }

    public int Ubicar(DetalleFactura detalleFactura) {
        int posicion = -1;
        for (int i = 0; i < detalles.size(); i++) {
            if (detalles.get(i).getCodigo().equals(detalleFactura.getCodigo())) {
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
            detalles.add(detalleFactura);
            return new Mensaje("DetalleFactura insertado correctamente", "OK");
        } else {
            return new Mensaje("DetalleFactura ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(DetalleFactura detalleFactura) {
        int posicion;

        posicion = Ubicar(detalleFactura);
        if (posicion != -1) {
            detalles.set(posicion, detalleFactura);
            return new Mensaje("DetalleFactura actualizada correctamente", "OK");
        } else {
            return new Mensaje("DetalleFactura no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(DetalleFactura detalleFactura) {
        int posicion;

        posicion = Ubicar(detalleFactura);
        if (posicion != -1) {
            detalles.remove(posicion);

            return new Mensaje("DetalleFactura eliminada correctamente", "OK");

        } else {
            return new Mensaje("DetalleFactura no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (detalles.size() > 0) {
            detalles.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < detalles.size(); i++) {
            cadena = cadena + detalles.get(i).aCadena() + "/";
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
                        unidadmedida.add(cadena.split("/")[i].split("%")[j].split("-")[2]);
                        cantidad.add(Float.parseFloat(cadena.split("/")[i].split("%")[j].split("-")[1]));
                        pu.add(Float.parseFloat(cadena.split("/")[i].split("%")[j].split("-")[3]));
                    }
                }
                detalleFactura.setNombre(nombre);
                detalleFactura.setCantidad(cantidad);
//                detalleFactura.setFactores(factores);
                detalleFactura.setPu(pu);
                detalleFactura.setUnidadmedida(unidadmedida);
                detalles.add(detalleFactura);
            }
        } else {
            System.out.println("No hay detalles registrados.");
        }
    }
}

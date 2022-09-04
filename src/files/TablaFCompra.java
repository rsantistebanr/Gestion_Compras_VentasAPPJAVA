package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Compras;
import javax.swing.JOptionPane;

public class TablaFCompra extends Archivo {

    private List<Compras> facturaCompra = new ArrayList<Compras>();

    public TablaFCompra(String ruta) {
        super(ruta, "facturaCompra", "txt");
    }

    public int size() {
        return facturaCompra.size();
    }

    public List<Compras> Seleccionar(String patron) {
        List<Compras> filtro = new ArrayList<Compras>();

        for (int i = 0; i < facturaCompra.size(); i++) {
            if (facturaCompra.get(i).getNombreProveedor().contains(patron)) {
                filtro.add(facturaCompra.get(i));
            }
        }

        return filtro;
    }

    public Compras Seleccionar(Compras factura) {
        Compras facturaUbicada = null;

        for (int i = 0; i < facturaCompra.size(); i++) {
            if (facturaCompra.get(i).getCodigo().equals(factura.getCodigo())) {
                facturaUbicada = facturaCompra.get(i);
                break;
            }
        }

        return facturaUbicada;
    }

    public int Ubicar(Compras factura) {
        int posicion = -1;
        for (int i = 0; i < facturaCompra.size(); i++) {
            if (facturaCompra.get(i).getCodigo().equals(factura.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(Compras factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion == -1) {
            facturaCompra.add(factura);
//            JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Compras insertado correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Compras ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(Compras factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion != -1) {
            facturaCompra.set(posicion, factura);
//            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Compras actualizada correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se Acutalizo el factura", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Compras no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(Compras factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion != -1) {
            facturaCompra.remove(posicion);

            return new Mensaje("Compras eliminada correctamente", "OK");

        } else {
            return new Mensaje("Compras no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (facturaCompra.size() > 0) {
            facturaCompra.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < facturaCompra.size(); i++) {
            cadena = cadena + facturaCompra.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Compras factura;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                factura = new Compras();

                factura.setCodigo(cadena.split("/")[i].split("-")[0]);
                factura.setCorrelativo(cadena.split("/")[i].split("-")[1]);
                factura.setNombreProveedor(cadena.split("/")[i].split("-")[2]);
                
                facturaCompra.add(factura);
            }
        } else {
            System.out.println("No hay facturaCompra registrados.");
        }
    }
}

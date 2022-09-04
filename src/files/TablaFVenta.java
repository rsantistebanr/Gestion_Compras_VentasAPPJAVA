package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Ventas;
import javax.swing.JOptionPane;

public class TablaFVenta extends Archivo {

    private List<Ventas> facturaVenta = new ArrayList<Ventas>();

    public TablaFVenta(String ruta) {
        super(ruta, "facturaVenta", "txt");
    }

    public int size() {
        return facturaVenta.size();
    }

    public List<Ventas> Seleccionar(String patron) {
        List<Ventas> filtro = new ArrayList<Ventas>();

        for (int i = 0; i < facturaVenta.size(); i++) {
            if (facturaVenta.get(i).getNombreCliente().contains(patron)) {
                filtro.add(facturaVenta.get(i));
            }
        }

        return filtro;
    }

    public Ventas Seleccionar(Ventas factura) {
        Ventas facturaUbicada = null;

        for (int i = 0; i < facturaVenta.size(); i++) {
            if (facturaVenta.get(i).getCodigo().equals(factura.getCodigo())) {
                facturaUbicada = facturaVenta.get(i);
                break;
            }
        }

        return facturaUbicada;
    }

    public int Ubicar(Ventas factura) {
        int posicion = -1;
        for (int i = 0; i < facturaVenta.size(); i++) {
            if (facturaVenta.get(i).getCodigo().equals(factura.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(Ventas factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion == -1) {
            facturaVenta.add(factura);
           JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Ventas insertado correctamente", "OK");
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Ventas ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(Ventas factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion != -1) {
            facturaVenta.set(posicion, factura);
            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Ventas actualizada correctamente", "OK");
        } else {
           JOptionPane.showMessageDialog(null, "No se Acutalizo el factura", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Ventas no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(Ventas factura) {
        int posicion;

        posicion = Ubicar(factura);
        if (posicion != -1) {
            facturaVenta.remove(posicion);

            return new Mensaje("Ventas eliminada correctamente", "OK");

        } else {
            return new Mensaje("Ventas no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (facturaVenta.size() > 0) {
            facturaVenta.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < facturaVenta.size(); i++) {
            cadena = cadena + facturaVenta.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Ventas factura;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                factura = new Ventas();

                factura.setCodigo(cadena.split("/")[i].split("-")[0]);
                factura.setCorrelativo(cadena.split("/")[i].split("-")[1]);
                factura.setNombreCliente(cadena.split("/")[i].split("-")[2]);
                
                facturaVenta.add(factura);
            }
        } else {
            System.out.println("No hay facturaVenta registrados.");
        }
    }
}

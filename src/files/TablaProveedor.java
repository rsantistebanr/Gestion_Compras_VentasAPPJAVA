package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Proveedor;
import javax.swing.JOptionPane;

public class TablaProveedor extends Archivo {

    private List<Proveedor> proveedores = new ArrayList<Proveedor>();

    public TablaProveedor(String ruta) {
        super(ruta, "proveedores", "txt");
    }

    public int size() {
        return proveedores.size();
    }

    public List<Proveedor> Seleccionar(String patron) {
        List<Proveedor> filtro = new ArrayList<Proveedor>();

        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getNombres().contains(patron)) {
                filtro.add(proveedores.get(i));
            }
        }

        return filtro;
    }

    public Proveedor Seleccionar(Proveedor proveedor) {
        Proveedor proveedorUbicada = null;

        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getCodigo().equals(proveedor.getCodigo())) {
                proveedorUbicada = proveedores.get(i);
                break;
            }
        }

        return proveedorUbicada;
    }

    public int Ubicar(Proveedor proveedor) {
        int posicion = -1;
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getCodigo().equals(proveedor.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(Proveedor proveedor) {
        int posicion;

        posicion = Ubicar(proveedor);
        if (posicion == -1) {
            proveedores.add(proveedor);
            JOptionPane.showMessageDialog(null, "Insertado correctamente", "[ok]", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Proveedor insertado correctamente", "OK");
        } else {
            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "[ERROR]", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Proveedor ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(Proveedor proveedor) {
        int posicion;

        posicion = Ubicar(proveedor);
        if (posicion != -1) {
            proveedores.set(posicion, proveedor);
            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "[OK]", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Proveedor actualizada correctamente", "OK");
        } else {
            JOptionPane.showMessageDialog(null, "No se Acutalizo", "[ERROR]", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Proveedor no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(Proveedor proveedor) {
        int posicion;

        posicion = Ubicar(proveedor);
        if (posicion != -1) {
            proveedores.remove(posicion);
            JOptionPane.showMessageDialog(null, "Eliminado correctamente", "[OK]", JOptionPane.INFORMATION_MESSAGE);

            return new Mensaje("Proveedor eliminada correctamente", "OK");

        } else {
            JOptionPane.showMessageDialog(null, "No se elimino", "[ERROR]", JOptionPane.INFORMATION_MESSAGE);

            return new Mensaje("No se elimino correctamente", "ERROR");
        }
    }

    public void Vaciar() {
        if (proveedores.size() > 0) {
            proveedores.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < proveedores.size(); i++) {
            cadena = cadena + proveedores.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Proveedor proveedor;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                proveedor = new Proveedor();

                proveedor.setCodigo(cadena.split("/")[i].split("-")[0]);
                proveedor.setNombres(cadena.split("/")[i].split("-")[1]);
                proveedor.setRuc(cadena.split("/")[i].split("-")[2]);
                proveedores.add(proveedor);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay proveedores registrados", "[ERROR]", JOptionPane.INFORMATION_MESSAGE);

            System.out.println("No hay proveedores registrados.");
        }
    }
}

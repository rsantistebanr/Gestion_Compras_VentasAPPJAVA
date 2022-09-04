package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;
import javax.swing.JOptionPane;

public class TablaCliente extends Archivo {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public TablaCliente(String ruta) {
        super(ruta, "clientes", "txt");
    }

    public int size() {
        return clientes.size();
    }

    public List<Cliente> Seleccionar(String patron) {
        List<Cliente> filtro = new ArrayList<>();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNombre().contains(patron)) {
                filtro.add(clientes.get(i));
            }
        }

        return filtro;
    }

    public Cliente Seleccionar(Cliente cliente) {
        Cliente clienteUbicado = null;

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCodigo().equals(cliente.getCodigo())) {
                clienteUbicado = clientes.get(i);
                System.out.println("Lo encontro");
                break;
            }
        }

        return clienteUbicado;
    }

    public int Ubicar(Cliente cliente) {
        int posicion = -1;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCodigo().equals(cliente.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(Cliente cliente) {
        int posicion;

        posicion = Ubicar(cliente);
        if (posicion == -1) {
            clientes.add(cliente);
//            JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Cliente insertado correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Cliente ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(Cliente cliente) {
        int posicion;

        posicion = Ubicar(cliente);
        if (posicion != -1) {
            clientes.set(posicion, cliente);
//            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Cliente actualizada correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se Acutalizo el cliente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Cliente no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(Cliente cliente) {
        int posicion;

        posicion = Ubicar(cliente);
        if (posicion != -1) {
            clientes.remove(posicion);

            return new Mensaje("Cliente eliminada correctamente", "OK");

        } else {
            return new Mensaje("Cliente no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (clientes.size() > 0) {
            clientes.clear();
        }
    }

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < clientes.size(); i++) {
            cadena = cadena + clientes.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Cliente cliente;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                cliente = new Cliente();

                cliente.setCodigo(cadena.split("/")[i].split("-")[0]);
                cliente.setDNI(cadena.split("/")[i].split("-")[1]);
                cliente.setNombre(cadena.split("/")[i].split("-")[2]);
                cliente.setDireccion(cadena.split("/")[i].split("-")[3]);
//            cliente.setNombres(cadena.split("/")[i].split("-")[3]);
//            cliente.setGenero(cadena.split("/")[i].split("-")[4]);

                clientes.add(cliente);
            }
        } else {
            System.out.println("No hay clientes registrados.");
        }
    }
}

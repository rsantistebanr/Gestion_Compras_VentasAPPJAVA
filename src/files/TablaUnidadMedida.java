package files;

import java.util.ArrayList;
import java.util.List;
import entidades.UnidadMedida;
import javax.swing.JOptionPane;

public class TablaUnidadMedida extends Archivo {

    private List<UnidadMedida> umedidas = new ArrayList<UnidadMedida>();

    public TablaUnidadMedida(String ruta) {
        super(ruta, "umedidas", "txt");
    }

    public int size() {
        return umedidas.size();
    }

    public List<UnidadMedida> Seleccionar(String patron) {
        List<UnidadMedida> filtro = new ArrayList<UnidadMedida>();

        for (int i = 0; i < umedidas.size(); i++) {
            if (umedidas.get(i).getTipoUnidadMedida().contains(patron)) {
                filtro.add(umedidas.get(i));
            }
        }

        return filtro;
    }

    public UnidadMedida Seleccionar(UnidadMedida tipounidad) {
        UnidadMedida tipounidadUbicada = null;

        for (int i = 0; i < umedidas.size(); i++) {
            if (umedidas.get(i).getCodigo().equals(tipounidad.getCodigo())) {
                tipounidadUbicada = umedidas.get(i);
                break;
            }
        }

        return tipounidadUbicada;
    }

    public int Ubicar(UnidadMedida tipounidad) {
        int posicion = -1;
        for (int i = 0; i < umedidas.size(); i++) {
            if (umedidas.get(i).getCodigo().equals(tipounidad.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Mensaje Insertar(UnidadMedida tipounidad) {
        int posicion;

        posicion = Ubicar(tipounidad);
        if (posicion == -1) {
            umedidas.add(tipounidad);
//            JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("UnidadMedida insertado correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("UnidadMedida ya se encuentra registrado", "ERROR");
        }
    }

    public Mensaje Actualizar(UnidadMedida tipounidad) {
        int posicion;

        posicion = Ubicar(tipounidad);
        if (posicion != -1) {
            umedidas.set(posicion, tipounidad);
//            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("UnidadMedida actualizada correctamente", "OK");
        } else {
//            JOptionPane.showMessageDialog(null, "No se Acutalizo el tipounidad", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("UnidadMedida no se encuentra registrada", "ERROR");
        }
    }

    public Mensaje Eliminar(UnidadMedida tipounidad) {
        int posicion;

        posicion = Ubicar(tipounidad);
        if (posicion != -1) {
            umedidas.remove(posicion);

            return new Mensaje("UnidadMedida eliminada correctamente", "OK");

        } else {
            return new Mensaje("UnidadMedida no se encuentra registrada", "ERROR");
        }
    }

    public void Vaciar() {
        if (umedidas.size() > 0) {
            umedidas.clear();
        }
    }
    
    public void show(){
        for(int i=0;i<umedidas.size();i++){
            System.out.println(umedidas.get(i));
        }
    }
            
            

    public void Guardar() {
        String cadena;

        cadena = "";
        for (int i = 0; i < umedidas.size(); i++) {
            cadena = cadena + umedidas.get(i).aCadena() + "/";
        }

        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        UnidadMedida tipounidad;

        if (cadena.length() > 0) {
            for (int i = 0; i < cadena.split("/").length; i++) {
                tipounidad = new UnidadMedida();

                tipounidad.setCodigo(cadena.split("/")[i].split("-")[0]);
                tipounidad.setUnidadMedida(cadena.split("/")[i].split("-")[1]);
                tipounidad.setTipoUnidadMedida(cadena.split("/")[i].split("-")[2]);
                umedidas.add(tipounidad);
            }
        } else {
            System.out.println("No hay umedidas registrados.");
        }
    }
}

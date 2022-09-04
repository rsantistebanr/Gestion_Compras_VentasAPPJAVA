package files;

import java.util.ArrayList;
import java.util.List;
import entidades.TipoUnidadMedida;
import javax.swing.JOptionPane;

public class TablaTipoUnidad extends Archivo {
    private List<TipoUnidadMedida> tipounidades = new ArrayList<TipoUnidadMedida>();
    
    public TablaTipoUnidad(String ruta) {
        super(ruta,"tipounidades","txt");
    }
    public int size(){
        return tipounidades.size();
    }
    
    public List<TipoUnidadMedida> Seleccionar(String patron) {
        List<TipoUnidadMedida> filtro = new ArrayList<TipoUnidadMedida>();
        
        for (int i = 0; i < tipounidades.size(); i++) {
            if(tipounidades.get(i).getNombre().contains(patron)) {
                filtro.add(tipounidades.get(i));
            }
        }
        
        return filtro;
    }
    
    public TipoUnidadMedida Seleccionar(TipoUnidadMedida tipoUnidad) {
        TipoUnidadMedida tipoUnidadUbicada = null;
        
        for (int i = 0; i < tipounidades.size(); i++) {
            if(tipounidades.get(i).getCodigo().equals(tipoUnidad.getCodigo())) {
                tipoUnidadUbicada = tipounidades.get(i);
                break;
            }
        }
        
        return tipoUnidadUbicada;
    }   
    
    public int Ubicar(TipoUnidadMedida tipoUnidad) {
        int posicion = -1;
        for (int i = 0; i < tipounidades.size(); i++) {
            if(tipounidades.get(i).getCodigo().equals(tipoUnidad.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    public Mensaje Insertar(TipoUnidadMedida tipoUnidad) {
        int posicion;
        
        posicion = Ubicar(tipoUnidad);
        if(posicion == -1) {
            tipounidades.add(tipoUnidad);
//            JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("TipoUnidadMedida insertado correctamente","OK");
        }
        else {
//            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("TipoUnidadMedida ya se encuentra registrado","ERROR");
        }
    }
    
    public Mensaje Actualizar(TipoUnidadMedida tipoUnidad) {
        int posicion;
        
        posicion = Ubicar(tipoUnidad);
        if(posicion != -1) {
            tipounidades.set(posicion, tipoUnidad);
//            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("TipoUnidadMedida actualizada correctamente","OK");
        }
        else {
//            JOptionPane.showMessageDialog(null, "No se Acutalizo el tipoUnidad", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("TipoUnidadMedida no se encuentra registrada","ERROR");
        }        
    }
    
    public Mensaje Eliminar(TipoUnidadMedida tipoUnidad) {
        int posicion;
        
        posicion = Ubicar(tipoUnidad);
        if(posicion != -1) {
            tipounidades.remove(posicion);
            
            return new Mensaje("TipoUnidadMedida eliminada correctamente","OK");
            
        }
        else {
            return new Mensaje("TipoUnidadMedida no se encuentra registrada","ERROR");
        }    
    }
    
    
    public void Vaciar(){
        if(tipounidades.size()>0){
            tipounidades.clear();
        }
    }
    
    public void show(){ //show = mostrar
        for(int i=0; i<tipounidades.size();i++){
            System.out.println(tipounidades.get(i));
        }
    }
    
    
    public void Guardar() {
        String cadena;
        
        cadena = "";
        for (int i = 0; i < tipounidades.size(); i++) {
            cadena = cadena + tipounidades.get(i).aCadena() + "/";
        }
        
        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        TipoUnidadMedida tipoUnidad;
        
        if(cadena.length() > 0){
                    for (int i = 0; i < cadena.split("/").length; i++) {
            tipoUnidad = new TipoUnidadMedida();
            
            tipoUnidad.setCodigo(cadena.split("/")[i].split("-")[0]);
            tipoUnidad.setNombre(cadena.split("/")[i].split("-")[1]);
//            tipoUnidad.setNombres(cadena.split("/")[i].split("-")[3]);
//            tipoUnidad.setGenero(cadena.split("/")[i].split("-")[4]);
            
            tipounidades.add(tipoUnidad);
        }
        }else{
            System.out.println("No hay tipounidades registrados.");
        }
    }
}
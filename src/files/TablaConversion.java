package files;

import java.util.ArrayList;
import java.util.List;
import entidades.Conversion;

public class TablaConversion extends Archivo {
    private List<Conversion> conversiones = new ArrayList<Conversion>();
    
    public TablaConversion(String ruta) {
        super(ruta,"conversiones","txt");
    }
    public int size(){
        return conversiones.size();
    }
    
    public List<Conversion> Seleccionar(String patron) {
        List<Conversion> filtro = new ArrayList<Conversion>();
        
        for (int i = 0; i < conversiones.size(); i++) {
            if(conversiones.get(i).getTipoUnidadMedida().contains(patron)) {
                filtro.add(conversiones.get(i));
            }
        }
        
        return filtro;
    }
    
    public Conversion Seleccionar(Conversion conversion) {
        Conversion conversionUbicada = null;
        
        for (int i = 0; i < conversiones.size(); i++) {
            if(conversiones.get(i).getCodigo().equals(conversion.getCodigo())) {
                conversionUbicada = conversiones.get(i);
                break;
            }
        }
        
        return conversionUbicada;
    }   
    
    public int Ubicar(Conversion conversion) {
        int posicion = -1;
        for (int i = 0; i < conversiones.size(); i++) {
            if(conversiones.get(i).getCodigo().equals(conversion.getCodigo())) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    
    public Mensaje Insertar(Conversion conversion) {
        int posicion;
        
        posicion = Ubicar(conversion);
        if(posicion == -1) {
            conversiones.add(conversion);
//            JOptionPane.showMessageDialog(null, "Insertado correctamente", "MENSAJE INSETAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Conversion insertado correctamente","OK");
        }
        else {
//            JOptionPane.showMessageDialog(null, "No se inserto correctamente", "MENSAJE INSERTAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Conversion ya se encuentra registrado","ERROR");
        }
    }
    
    public Mensaje Actualizar(Conversion conversion) {
        int posicion;
        
        posicion = Ubicar(conversion);
        if(posicion != -1) {
            conversiones.set(posicion, conversion);
//            JOptionPane.showMessageDialog(null, "Acutalizado correctamente", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Conversion actualizada correctamente","OK");
        }
        else {
//            JOptionPane.showMessageDialog(null, "No se Acutalizo el conversion", "MENSAJE ACTUALIZAR", JOptionPane.INFORMATION_MESSAGE);
            return new Mensaje("Conversion no se encuentra registrada","ERROR");
        }        
    }
    
    public Mensaje Eliminar(Conversion conversion) {
        int posicion;
        
        posicion = Ubicar(conversion);
        if(posicion != -1) {
            conversiones.remove(posicion);
            
            return new Mensaje("Conversion eliminada correctamente","OK");
            
        }
        else {
            return new Mensaje("Conversion no se encuentra registrada","ERROR");
        }    
    }
    
    
    public void Vaciar(){
        if(conversiones.size()>0){
            conversiones.clear();
        }
    }
    
    
    public void Guardar() {
        String cadena;
        
        cadena = "";
        for (int i = 0; i < conversiones.size(); i++) {
            cadena = cadena + conversiones.get(i).aCadena() + "/";
        }
        
        Escribir(cadena);
    }

    public void Consultar() {
        String cadena = Leer();
        Conversion conversion;
        
        if(cadena.length() > 0){
                    for (int i = 0; i < cadena.split("/").length; i++) {
            conversion = new Conversion();
            
            conversion.setCodigo(cadena.split("/")[i].split("-")[0]);
            conversion.setTipoUnidadMedida(cadena.split("/")[i].split("-")[1]);
            conversion.setDE(cadena.split("/")[i].split("-")[2]);
            conversion.setA(cadena.split("/")[i].split("-")[3]);
            conversion.setFactor(Float.parseFloat(cadena.split("/")[i].split("-")[4]));
            conversiones.add(conversion);
        }
        }else{
            System.out.println("No hay conversiones registrados.");
        }
    }
}
package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo {
    private String ruta;
    private String nombre;
    private String extension;

    public Archivo() {
    }

    public Archivo(String ruta, String nombre, String extension) {
        this.ruta = ruta;
        this.nombre = nombre;
        this.extension = extension;
    }
    
    public String Leer() {
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        String cadena = null;
        
        try {
//            f = new File(ruta + nombre + "." + extension);
//            fr = new FileReader(f);
//            br = new BufferedReader(fr);
//            
//            cadena = br.readLine();
            
            f = new File(ruta + nombre + "." + extension);
            if (f.length() == 0) {
                cadena = "";
            } else {
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                cadena = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null) {
                    br.close();
                }

                if(fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } 
        
        return cadena;
    }
    
    public void Escribir(String cadena) {
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            f = new File(ruta + nombre + "." + extension);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(cadena);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(bw != null) {
                    bw.close();
                }

                if(fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }        
    }        
}
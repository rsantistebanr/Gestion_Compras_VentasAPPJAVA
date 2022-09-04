package files;

import javax.swing.JOptionPane;

public class Mensaje {
    private String Descripcion;
    private String Tipo;

    public Mensaje() {
    }

    public Mensaje(String Descripcion, String Tipo) {
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }    

    @Override
    public String toString() {
        return ("[" + Tipo + "] - " + Descripcion);
    }
}
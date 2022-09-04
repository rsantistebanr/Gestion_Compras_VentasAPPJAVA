/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ROBERT
 */
public class TipoUnidadMedida {

    private String Codigo;
    private String Nombre;

    public TipoUnidadMedida(String Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
    }

    public TipoUnidadMedida() {
    }

    public TipoUnidadMedida(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (((TipoUnidadMedida) obj).getCodigo().equals(this.Codigo)) {
            return true;
        } else {
            return false;
        }

    }
    
    public String aCadena() {
        return this.Codigo + "-" + this.getNombre() ;
    }

    @Override
    public String toString() {
        return getCodigo() + " | " + Nombre;
    }
}

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
public class Proveedor {

    private String Nombres;
    private String Codigo;
    private String Ruc;

    public Proveedor(String Codigo, String Nombres, String Ruc) {
        this.Nombres = Nombres;
        this.Codigo = Codigo;
        this.Ruc = Ruc;
    }

    public Proveedor() {
    }

    public Proveedor( String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    @Override
    public boolean equals(Object obj) {
        if (((Proveedor) obj).getCodigo().equals(this.Codigo)) {
//            ((Proveedor) obj).setCodigo(this.getCodigo());

            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return Codigo + " | " + Nombres + " | " + Ruc;
    }

    public String aCadena() {
        return this.Codigo + "-" + this.getNombres() + "-" + this.Ruc;
    }

}

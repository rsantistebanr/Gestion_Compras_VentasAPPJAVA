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
public class UnidadMedida {
    private String Codigo;
    private String UnidadMedida;
    private String TipoUnidadMedida;
    
    public UnidadMedida() {
    }

    public UnidadMedida(String Codigo) {
        this.Codigo = Codigo;
    }

    public UnidadMedida(String Codigo, String UnidadMedida, String TipoUnidadMedida) {
        this.Codigo = Codigo;
        this.UnidadMedida = UnidadMedida;
        this.TipoUnidadMedida = TipoUnidadMedida;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public String getTipoUnidadMedida() {
        return TipoUnidadMedida;
    }

    public void setTipoUnidadMedida(String TipoUnidadMedida) {
        this.TipoUnidadMedida = TipoUnidadMedida;
    }

    @Override
    public boolean equals(Object obj) {
        if (((UnidadMedida) obj).getCodigo().equals(this.Codigo)) {
//            ((Proveedor) obj).setCodigo(this.getCodigo());
            return true;
        } else {
            return false;
        }
    }
    
    
    public String aCadena() {
        return this.Codigo + "-"+ this.getUnidadMedida() + "-" + this.getTipoUnidadMedida();
    }
    
    
    
    @Override
    public String toString() {
        return getCodigo() + " | "+UnidadMedida ;
    }
    
}

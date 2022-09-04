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
public class Conversion {
     private String DE;
    private String A;
    private String TipoUnidadMedida;
    private float Factor;
    private String Codigo;

    public Conversion() {
    }

    public Conversion(String Codigo) {
        this.Codigo = Codigo;
    }
    

    public Conversion(String Codigo,String tu,String DE, String A, float Factor) {
        this.DE = DE;
        this.A = A;
        this.Factor = Factor;
        this.TipoUnidadMedida = tu;
        this.Codigo = Codigo;
    }
    

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigoigo) {
        this.Codigo= Codigoigo;
    }
    
    public String getDE() {
        return DE;
    }

    public void setDE(String DE) {
        this.DE = DE;
    }

    public String getA() {
        return A;
    }

    public void setA(String A) {
        this.A = A;
    }

    public float getFactor() {
        return Factor;
    }

    public void setFactor(float Factor) {
        this.Factor = Factor;
    }

    public String getTipoUnidadMedida() {
        return TipoUnidadMedida;
    }

    public void setTipoUnidadMedida(String TipoUnidadMedida) {
        this.TipoUnidadMedida = TipoUnidadMedida;
    }
    
    public void convertir(){
    
    }
    @Override
    public boolean equals(Object obj) {
        if(((Conversion)obj).getCodigo().equals(this.Codigo))
            return true;
        else
            return false;
    }

    public String aCadena() {
        return this.getCodigo()+ "-" + this.getTipoUnidadMedida()+ "-"+ this.getDE() + "-" + this.getA()+"-"+this.getFactor();
    }
    @Override
    public String toString() {
        return this.TipoUnidadMedida + "| DE: " + DE + ", A: " + A ;
    }
    
}

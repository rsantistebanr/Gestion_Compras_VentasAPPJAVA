/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

public class DetalleFactura {

    private List<Float> factores;
    private List<Float> pu;
    private List<String> nombre;
    private List<String> unidadmedida;
    private List<Float> cantidad;

    private String codigo;

    public DetalleFactura(String codigo) {
        this.codigo = codigo;
        this.nombre = new ArrayList<>();
        this.factores = new ArrayList<>();
        this.pu = new ArrayList<>();
        this.unidadmedida = new ArrayList<>();
        this.cantidad = new ArrayList<>();

    }

    public DetalleFactura(List<Float> factores, List<Float> pu, List<String> nombre, List<String> unidadmedida, String codigo) {
        this.codigo = codigo;
        this.nombre = new ArrayList<>();
        this.factores = new ArrayList<>();
        this.pu = new ArrayList<>();
        this.unidadmedida = new ArrayList<>();
        this.cantidad = new ArrayList<>();
        this.factores = factores;
        this.pu = pu;
        this.nombre = nombre;
        this.unidadmedida = unidadmedida;
        this.codigo = codigo;
    }

    public DetalleFactura() {
    }

    public List<Float> getFactores() {
        return factores;
    }

    public void setFactores(List<Float> factores) {
        this.factores = factores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Float> getPu() {
        return pu;
    }

    public void setPu(List<Float> pu) {
        this.pu = pu;
    }

    public List<String> getNombre() {
        return nombre;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public List<String> getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(List<String> unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public List<Float> getCantidad() {
        return cantidad;
    }

    public void setCantidad(List<Float> cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public String aCadena() {
        String cadena = this.getCodigo();
        cadena += "%";
        for (int i = 0; i < nombre.size(); i++) {
            cadena += nombre.get(i);
            cadena += "-";
            cadena += cantidad.get(i);
            cadena += "-";
            cadena += unidadmedida.get(i);
            cadena += "-";
            cadena += pu.get(i);
            if(i != nombre.size()-1){
                cadena += "%";
            }
        }

        return cadena;
    }

}

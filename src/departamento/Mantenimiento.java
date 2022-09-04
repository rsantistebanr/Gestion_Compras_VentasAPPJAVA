package departamento;


import files.*;

import java.util.Scanner;


/**
 *
 * @author ROBERT
 */
public class Mantenimiento {

    Scanner entrada = new Scanner(System.in);
    
    /*------ listas de pero con txt -----*/
    TablaProveedor tp = new TablaProveedor("src\\BD\\");
    TablaCliente tc = new TablaCliente("src\\BD\\");
    TablaProducto tpr = new TablaProducto("src\\BD\\");
    TablaTipoUnidad ttu = new TablaTipoUnidad("src\\BD\\");
    TablaUnidadMedida tum = new TablaUnidadMedida("src\\BD\\");
    TablaConversion tco = new TablaConversion("src\\BD\\");
//
//        TablaProveedor tp = new TablaProveedor("src\\BD\\");
//    TablaCliente tc = new TablaCliente("D:\\txt_supermercado\\");
//    TablaProducto tpr = new TablaProducto("D:\\txt_supermercado\\");
//    TablaTipoUnidad ttu = new TablaTipoUnidad("D:\\txt_supermercado\\");
//    TablaUnidadMedida tum = new TablaUnidadMedida("D:\\txt_supermercado\\");
//    TablaConversion tco = new TablaConversion("D:\\txt_supermercado\\");


 /*--------------------------   Constructores -----------------------------*/
    public Mantenimiento() {

    }

    public TablaProveedor getTp() {
        return tp;
    }

    public void setTp(TablaProveedor tp) {
        this.tp = tp;
    }

    public TablaCliente getTc() {
        return tc;
    }

    public void setTc(TablaCliente tc) {
        this.tc = tc;
    }

    public TablaProducto getTpr() {
        return tpr;
    }

    public void setTpr(TablaProducto tpr) {
        this.tpr = tpr;
    }

    public TablaTipoUnidad getTtu() {
        return ttu;
    }

    public void setTtu(TablaTipoUnidad ttu) {
        this.ttu = ttu;
    }

    public TablaUnidadMedida getTum() {
        return tum;
    }

    public void setTum(TablaUnidadMedida tum) {
        this.tum = tum;
    }

    public TablaConversion getTco() {
        return tco;
    }

    public void setTco(TablaConversion tco) {
        this.tco = tco;
    }
    



    /*--------------------   METODO PARA GENERAR CODIGO  ---------------------*/
    public String generarCodigo(int n) {

        String codigo;
        codigo = Integer.toString(n);
        if (n < 10 || n >= 1) {
            codigo = "0" + Integer.toString(n);
        } else {
            codigo = Integer.toString(n);
        }

        return codigo;
    }

    public boolean validar(String cad) {
        int num;
        try {
            num = Integer.parseInt(cad);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}

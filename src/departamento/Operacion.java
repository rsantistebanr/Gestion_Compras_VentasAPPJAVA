package departamento;

import entidades.Conversion;
import entidades.Producto;
import entidades.UnidadMedida;
import files.TablaDFactura;
import files.TablaDFacturaVenta;
import files.TablaFCompra;
import files.TablaFVenta;
import java.util.List;
import java.util.Scanner;

public class Operacion {

    Mantenimiento oMantenimiento;

    TablaFCompra tfc = new TablaFCompra("src\\BD\\");
    TablaFVenta tfv = new TablaFVenta("src\\BD\\");
    TablaDFactura tdf = new TablaDFactura("src\\BD\\");
    TablaDFacturaVenta tdfV = new TablaDFacturaVenta("src\\BD\\");

    
//     TablaFCompra tfc = new TablaFCompra("D:\\txt_supermercado\\");
//    TablaFVenta tfv = new TablaFVenta("D:\\txt_supermercado\\");
//    TablaDFactura tdf = new TablaDFactura("D:\\txt_supermercado\\");
//    TablaDFacturaVenta tdfV = new TablaDFacturaVenta("D:\\txt_supermercado\\");
    
    
    Scanner entrada = new Scanner(System.in);

    List<Producto> productos;
    List<UnidadMedida> ums;
    List<Conversion> conversiones;

    public Operacion() {
        this.oMantenimiento = new Mantenimiento();
    }

    public Operacion(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }

    public Mantenimiento getoMantenimiento() {
        return oMantenimiento;
    }

    public void setoMantenimiento(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }

    public TablaFCompra getTfc() {
        return tfc;
    }

    public void setTfc(TablaFCompra tfc) {
        this.tfc = tfc;
    }

    public TablaFVenta getTfv() {
        return tfv;
    }

    public void setTfv(TablaFVenta tfv) {
        this.tfv = tfv;
    }

    public TablaDFactura getTdf() {
        return tdf;
    }

    public void setTdf(TablaDFactura tdf) {
        this.tdf = tdf;
    }

    public TablaDFacturaVenta getTdfV() {
        return tdfV;
    }

    public void setTdfV(TablaDFacturaVenta tdfV) {
        this.tdfV = tdfV;
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

    public float convertir(String nombre, String um) {
        List<Conversion> lconver = oMantenimiento.getTco().Seleccionar("");
        List<Producto> lprods = oMantenimiento.getTpr().Seleccionar("");
        float factor = 0;
        for (int i = 0; i < oMantenimiento.getTpr().size(); i++) {
            if (lprods.get(i).getNombre().equals(nombre)) {
                
                String umA = lprods.get(i).getUnidadMedida();
                if (!(um.equals(umA))) {

                    for (int j = 0; j < lconver.size(); j++) {
                        if (lconver.get(j).getDE().equals(um) && lconver.get(j).getA().equals(umA)) {
                            factor = lconver.get(j).getFactor();
                        }
                    }
                } else {
                    factor = 1;
                }
            }
        }
        return factor;
    }

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

    public String generarCorrelativo(int n) {

        String correlativo;
        correlativo = Integer.toString(n);
        if (n < 10 || n >= 1) {
            correlativo = "0000" + Integer.toString(n);
        } else {
            correlativo = "000" + Integer.toString(n);
        }

        return correlativo;
    }

}

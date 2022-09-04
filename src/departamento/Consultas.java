/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departamento;

import entidades.Producto;

import java.util.List;

/**
 *
 * @author ROBERT
 */
public class Consultas {
     private Mantenimiento oMantenimiento;

    public Consultas() {
    }

    public Consultas(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }

    public void mostrarResultados(Mantenimiento oMantenimiento) {
        List<Producto> productos = oMantenimiento.getTpr().Seleccionar("");

        System.out.printf("%12s |%12s |%12s |%12s |%12s | %12s %n", "producto ", "stock", " precio U.", "unidad ", "compras", "  ventas ");
        productos.forEach((Producto oP) -> {
            System.out.printf("%12s |%12f |%12f |%12s |%12f | %12f %n",oP.getNombre(), oP.getStock(),
                    oP.getPrecioUnitario() , oP.getUnidadMedida() ,oP.getcCompra() , oP.getcVenta());

        });
    }
}

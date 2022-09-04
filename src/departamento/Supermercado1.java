package departamento;


public class Supermercado1 {

    Mantenimiento oMantenimiento;
    Operacion oOperacion;
    Consultas oConsultas;


    public Supermercado1() {
        this.oMantenimiento = new Mantenimiento();
        this.oConsultas = new Consultas();
        this.oOperacion = new Operacion(oMantenimiento);
        this.oConsultas = new Consultas();

    }

    public Mantenimiento getoMantenimiento() {
        return oMantenimiento;
    }

    public void setoMantenimiento(Mantenimiento oMantenimiento) {
        this.oMantenimiento = oMantenimiento;
    }

    public Operacion getoOperacion() {
        return oOperacion;
    }

    public void setoOperacion(Operacion oOperacion) {
        this.oOperacion = oOperacion;
    }

    public Consultas getoConsultas() {
        return oConsultas;
    }

    public void setoConsultas(Consultas oConsultas) {
        this.oConsultas = oConsultas;
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

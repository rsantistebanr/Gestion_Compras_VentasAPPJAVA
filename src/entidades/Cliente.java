package entidades;

public class Cliente {
    private String Codigo;
    private String DNI;
    private String Nombre;
    private String Direccion;

    public Cliente() {
    }

    public Cliente(String cod) {
        this.Codigo = cod;
    }

    public Cliente(String Codigo, String DNI, String Nombre, String Direccion) {
        this.Codigo = Codigo;
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
    }


    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    

//    @Override
//    public boolean equals(Object obj) {
//        if(((Cliente)obj).getDNI().equals(this.getDNI()))
//            return true;
//        else
//            return false;
//    }    

    public String aCadena() {
        return this.Codigo + "-" + this.getDNI()+ "-"+ this.getNombre() + "-" + this.Direccion;
    }
    @Override
    public String toString() {
         return this.Codigo+ " | "+ this.getDNI()+" | " + Nombre + " | " + this.Direccion;
    }
}
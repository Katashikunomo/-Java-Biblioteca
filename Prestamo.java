//import java.lang.reflect.Constructor;

public class Prestamo {
    //Atributos
    public Publicacion p;
    public String fechaPrestamo;
    public String fechaEntrega;
    
    //COnstructor
    public Prestamo(){}

    public Prestamo(Publicacion p, String fechaPrestamo, String fechaEntrega){
        this.p = p;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega; 
    }

    //metods

    public String toString(){
        String est = "Publicacion :" + p +", Se Presta el dia: " + fechaPrestamo +", Se Entrega el dia: " + fechaEntrega;
        return est;
    }

}   

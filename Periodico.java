public class Periodico extends Publicacion {
    //Atributos
    public String nombre;
    public String director;
    public String localidad;

    
    //constrct
    public Periodico(){}
    
    public Periodico(int id, boolean estado, String nombre, String director, String localidad){
        super(id, estado);
        this.nombre = nombre;
        this.director = director;
        this.localidad = localidad;
    }

    //metods

    public String toString(){
        String papa = super.toString();
        String hijo = papa + ", Nombre: " +nombre +", Editor: " + director+ ", Volumen: " + localidad;
        return hijo;
    }
}

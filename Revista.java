public class Revista extends Publicacion{
    //Atributos
    public String nombre;
    public String editor;
    public int volumen;
    
    //constrct
    public Revista(){}
    
    public Revista(int id, boolean estado, String nombre, String editor, int volumen){
        super(id, estado);
        this.nombre = nombre;
        this.editor = editor;
        this.volumen = volumen;
    }

    //metods

    public String toString(){
        String papa = super.toString();
        String hijo = papa + ", Nombre: " +nombre +", Editor: " + editor+ ", Volumen: " + volumen;
        return hijo;
    }
}

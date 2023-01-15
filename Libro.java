public class Libro extends Publicacion{
    //Atreibuutos
    public String titulo;
    public String autor;
    public String genero;

    //cosntrctor

    public Libro(){}

    public Libro(int id, boolean estado,String titulo, String autor, String genero){
        super(id, estado);
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    //metods

    public String toString(){
        String papa = super.toString();
        String hijo = papa + ", Titulo: " + titulo + ", Autor: " + autor + ", Genero: " + genero;

        return hijo;
    }
}

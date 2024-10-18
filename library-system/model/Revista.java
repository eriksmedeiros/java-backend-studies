package model;
public class Revista implements Material {

    String titulo;
    String editora;
    int numeroPaginas;


    public Revista(String titulo, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public Revista() {}

    @Override
    public void exibirDetalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Editora: " + getEditora());
        System.out.println("Numero de paginas: " + getNumeroPaginas());
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    
}
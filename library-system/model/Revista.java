package model;

public class Revista extends Livro {
    private String editora;

    public Revista(String titulo, String autor, int anoDeLancamento, String edicao, int numPaginas, String editora) {
        super(titulo, autor, anoDeLancamento, edicao, numPaginas);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void exibeDetalhes(){
        super.exibeDetalhes();
        System.out.println("Editora: " + editora);
    }
}
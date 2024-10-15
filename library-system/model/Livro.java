package model;
public class Livro extends Material{
    private String autor;
    private int anoDeLancamento;
    private String edicao;
    private int numPaginas;

    public Livro(String titulo, String autor, int anoDeLancamento, String edicao, int numPaginas) {
        super(titulo);
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.edicao = edicao;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLançamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void exibeDetalhes(){
        super.exibeDetalhes();
        System.out.println("Autor: " + autor);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Edição: " + edicao);
        System.out.println("Número de páginas: " + numPaginas);
    }
}
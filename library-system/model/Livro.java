package model;
public class Livro implements Material{
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String edicao;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.anoLancamento = 0;
        this.edicao = "";
    }

    public Livro(String titulo, String autor, int anoLancamento, String edicao, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Edição: " + edicao);
    }
}
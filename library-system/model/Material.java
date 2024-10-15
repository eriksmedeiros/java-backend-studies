package model;
public class Material {
    private String titulo;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibeDetalhes(){
        System.out.println("Título: " + titulo);
    }
}
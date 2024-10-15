package utils;

import DAO.BibliotecaDAO;
import model.Livro;
import model.Material;
import model.Revista;

public class BibliotecaFunctions {
    private BibliotecaDAO biblioteca;

    public BibliotecaFunctions() {
        this.biblioteca = BibliotecaDAO.getInstance();
    }

    public void pesquisarMaterial(String titulo){
        Material mtr = null;
        for (Material mt : biblioteca.getArrayMateriais()){
            if(mt.getTitulo().equalsIgnoreCase(titulo)){
                mtr = mt;
                break;
            }
        }
        if (mtr == null){
            System.out.println("Não encontrado");
        } else{
            mtr.exibeDetalhes();
        }
    }

    public void exibirListaMateriais(){
        for (Material mt : biblioteca.getArrayMateriais()){
            if (mt != null){
                mt.exibeDetalhes();
            }
        }
    }

    public void cadastrarMaterial(String titulo, String autor, int anoDeLancamento, String edicao, int numPaginas){
        Livro l = new Livro(titulo, autor, anoDeLancamento, edicao, numPaginas);
        biblioteca.getArrayMateriais().add(l);
        System.out.println("Material cadastrado com sucesso!");
    }

    public void cadastrarMaterial(String titulo, String autor, int anoDeLancamento, String edicao, int numPaginas, String editora){
        Revista r = new Revista(titulo, autor, anoDeLancamento, edicao, numPaginas, editora);
        biblioteca.getArrayMateriais().add(r);
        System.out.println("Material cadastrado com sucesso!");
    }

    public void removerMaterial(String titulo){
        Material materialARemover = null;
        for (Material mt : biblioteca.getArrayMateriais()) {
            if (mt.getTitulo().equalsIgnoreCase(titulo)) {
                materialARemover = mt;
                break;
            }
        }
        if (materialARemover != null) {
            biblioteca.getArrayMateriais().remove(materialARemover);
            System.out.println("Material removido com sucesso!");
        }
    }

}
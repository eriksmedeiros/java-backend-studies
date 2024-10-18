package utils;

import DAO.BibliotecaDAO;
import model.*;

public abstract class BibliotecaFunctions {

    private static BibliotecaDAO banco = BibliotecaDAO.getIntance();

    public static void pesquisarMaterial(String nome) {

        Material material = buscaPorNome(nome);

        if (material == null) {
            System.out.println("\n########################################");
            System.out.println("Material não localizado");
            System.out.println("########################################\n");
            return;
        }
        if (material instanceof Livro) {
            System.out.println("\n########################################");
            System.out.println("Livro localizado");
            ((Livro) material).exibirDetalhes();
        }

        if (material instanceof Revista) {
            System.out.println("\n########################################");
            System.out.println("Revista localizada");
            ((Revista) material).exibirDetalhes();

        }

    }

    public static void exibirListaMateriais() {
        for (Material material : banco.getArrayMateriais()) {
            System.out.println("\n########################################");
            if (material instanceof Livro) {
                System.out.println("Livro:");
            }
            if (material instanceof Revista) {
                System.out.println("Revista:");
            }
            material.exibirDetalhes();
            ;
        }
    }

    public static void cadastarMaterial(String titulo, String editora, int numeroPaginas) {
        Revista rt = new Revista(titulo, editora, numeroPaginas);
        banco.getArrayMateriais().add(rt);
    }

    public static void cadastarMaterial(String titulo, String autor, int anoLancamento, String edicao) {
        Livro lt = new Livro(titulo, autor, anoLancamento, edicao);
        banco.getArrayMateriais().add(lt);
    }

    public static void removerMaterial(String titulo) {
        Material mt = buscaPorNome(titulo);

        if (mt == null) {
            System.out.println("\nElemento não localizado");
            return;
        } else {
            banco.getArrayMateriais().remove(mt);
        }
    }
    
    private static Material buscaPorNome(String titulo) {

        for (Material mt : banco.getArrayMateriais()) {
            if (mt instanceof Livro) {
                if (((Livro) mt).getTitulo().equals(titulo)) {
                    return mt;
                }
            }

            if (mt instanceof Revista) {
                if (((Revista) mt).getTitulo().equals(titulo)) {
                    return mt;
                }
            }
        }

        return null;
    }

}
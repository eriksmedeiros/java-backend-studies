package DAO;

import model.Material;

import java.util.ArrayList;

public class BibliotecaDAO {

    private ArrayList<Material> materiais;
    private static BibliotecaDAO banco;

    private BibliotecaDAO() {
        materiais = new ArrayList<>();
    }

    public static BibliotecaDAO getInstance() {
        if (banco == null) {
            banco = new BibliotecaDAO();
        }
        return banco;
    }

    public ArrayList<Material> getArrayMateriais() {
        return materiais;
    }
}

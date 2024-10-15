import utils.*;

public class Main {

    public static void main(String[] args) {
        BibliotecaFunctions biblioteca = new BibliotecaFunctions();

        // Cadastro de livros
        biblioteca.cadastrarMaterial("Algebra Linear", "Gustavo Antunes", 2017, "4ª ed", 300);
        biblioteca.cadastrarMaterial("Quimica Fundamental", "Pedro Paulo de Arantes", 2001, "1ª ed", 400);
        biblioteca.cadastrarMaterial("Linguagem Java - Easy version", "Gustavo Guanabara", 2020, "2ª ed", 500);
        biblioteca.cadastrarMaterial("Estrutura basica de dados", "Willian Frederico", 1998, "2ª ed", 350);
        biblioteca.cadastrarMaterial("Fundamentos da educação contemporanea", "Paulo Freire", 1975, "8ª ed", 600);

        // Cadastro de revistas
        biblioteca.cadastrarMaterial("Epoca", "Globo", 2020, "1ª ed", 45, "Editora Globo");
        biblioteca.cadastrarMaterial("Galineu", "Abreu", 2021, "2ª ed", 39, "Editora Abril");
        biblioteca.cadastrarMaterial("Mundo Curioso", "Abril", 2021, "1ª ed", 20, "Editora Abril");
        biblioteca.cadastrarMaterial("SuperInteressante", "Abril", 2021, "3ª ed", 41, "Editora Abril");
        biblioteca.cadastrarMaterial("Cientifica", "UFCR", 2021, "1ª ed", 41, "Editora UFCR");

//        // Lista todas aos Materiais (livros e revistas)
//        biblioteca.exibirListaMateriais();
//
        // Pesquisar material - (Achar)
//        biblioteca.pesquisarMaterial("Linguagem Java - Easy version");
//
//        // Pesquisar material - (Não achar)
//        biblioteca.pesquisarMaterial("Nada para pesquisar");
//
//        // Remove um material
//        biblioteca.removerMaterial("Linguagem Java - Easy version");
//
//        // Pesquisar material - (Não achar por ter sido deletado)
//        biblioteca.pesquisarMaterial("Linguagem Java - Easy version");
    }
}

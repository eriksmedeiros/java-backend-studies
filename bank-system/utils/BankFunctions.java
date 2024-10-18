package utils;

import DAO.BancoDAO;
import model.conta.Corrente;
import model.conta.Poupanca;
import model.pessoa.Pessoa;
import model.pessoa.PessoaFisica;

//Complete essa classe
public class BankFunctions {

    private static BancoDAO banco = BancoDAO.getIntance();

    public static void cadastrarClientePF(String nome, String cpf, String dataNascimento)
    {
        Pessoa p = buscarPessoa(cpf);
        if (p == null) {
            Corrente cc = new Corrente(0.0);
            Poupanca cp = new Poupanca(0.0);
            Pessoa pf = new PessoaFisica(nome, cc, cp, cpf, dataNascimento);
            banco.getArrayPessoas().add(pf);
            System.out.println("Cliente cadastrado com sucesso...");
        } else {
            System.out.println("Cadastrado não realizado!!!");
            System.out.println("Cliente já cadastrado");
        }
    }

    public static void removerClientePF(String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        } else {
            banco.getArrayPessoas().remove(p);
            System.out.println("Cliente removido com sucesso...");
        }
    }

    public static void depositarCC(double valor, String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não cadastrada.");
            return;
        }

        ((PessoaFisica)p).getContaCorrente().depositar(valor);
    }

    public static void sacarCC(double valor, String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        }
        ((PessoaFisica)p).getContaCorrente().sacar(valor);
    }

    public static void depositarCP(double valor, String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        }
        ((PessoaFisica)p).getContaPoupanca().depositar(valor);
    }

    public static void sacarCP(double valor, String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        }
        ((PessoaFisica)p).getContaPoupanca().sacar(valor);
    }

    public static void verSaldoCC(String cpf)
    {
        Pessoa p = buscarPessoa(cpf);
        
        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("O saldo atual é R$ " + ((PessoaFisica)p).getContaCorrente().verSaldo());
    }

    public static void verSaldoCP(String cpf)
    {
        Pessoa p = buscarPessoa(cpf);

        if (p == null){
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("O saldo atual é R$ " + ((PessoaFisica)p).getContaPoupanca().verSaldo());
    }

    public static Pessoa buscarPessoa(String cpf){

        for (Pessoa p : banco.getArrayPessoas())
        {
            if(p instanceof PessoaFisica){
                if (((PessoaFisica)p).getCpf().equalsIgnoreCase(cpf)){
                    return p;
                }
            }
        }
        return null;
    }
}
    /*

    ATRIBUTOS
    banco: BancoDAO (Use a instância do BancoDAO)
     
    MÉTODOS
    cadastrarClientePF(String nome, String cpf, String dataNascimento)
    removerClientePF(String cpf)
    depositarCC(double valor, String cpf)
    sacarCC(double valor, String cpf)
    depositarCP(double valor, String cpf)
    sacarCP(double valor, String cpf)
    verSaldoCC(String cpf)
    verSaldoCP(String cpf)
    buscarPessoa(String cpf) - retorna a pessoa buscada
     */
     

    



    
    

    

    

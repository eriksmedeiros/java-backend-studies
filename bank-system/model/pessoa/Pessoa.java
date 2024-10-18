package model.pessoa;
import model.conta.*;

//Complete essa classe
public abstract class Pessoa{
    String nome;
    Corrente contaCorrente;
    Poupanca contaPoupanca;

    public Pessoa() {
        this.nome = "";
        this.contaCorrente = null;
        this.contaPoupanca = null;
    }
   
    public Pessoa(String nome, Corrente contaCorrente, Poupanca contaPoupanca) {
        this.nome = nome;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Corrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Corrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Poupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(Poupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
    
    /*
      ATRIBUTOS
      nome: String
      contaCorrente: Corrente
      contaPoupanca: Poupanca
     
      MÉTODOS
      Construtor com todos os argumentos
      Construtor sem argumentos
      gets e sets
     */
    


   
    


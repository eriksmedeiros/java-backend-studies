package model.pessoa;

import model.conta.Corrente;
import model.conta.Poupanca;

//Complete essa classe
public class PessoaFisica extends Pessoa {
      String cpf;
      String dataNascimento;

      public PessoaFisica() {
            super("", null, null);
            this.cpf = "";
            this.dataNascimento = "";
      }

      public PessoaFisica(String nome, Corrente contaCorrente, Poupanca contaPoupanca, String cpf,
                  String dataNascimento) {
            super(nome, contaCorrente, contaPoupanca);
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
      }

      public String getCpf() {
            return cpf;
      }

      public void setCpf(String cpf) {
            this.cpf = cpf;
      }

      public String getDataNascimento() {
            return dataNascimento;
      }

      public void setDataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
      }

} // herdando Pessoa {}

/*
      ATRIBUTOS
      cpf: String
      dataNascimento: String
     
      MÉTODOS
      Construtor com todos os argumentos
      Construtor sem argumentos
      gets e sets
*/


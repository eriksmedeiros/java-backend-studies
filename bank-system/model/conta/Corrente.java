package model.conta;

//Complete essa classe
public class Corrente implements Conta {

    double saldo;

    public Corrente(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo = valor;
            System.out.println("Depósito de R$ " + valor + " realizado na Conta Corrente.");
        } else {
            System.out.println("Deposito não realizado... Valor inválido.");
        }
    }

    public void sacar(double valor){
        double valorFinal = valor * taxa;
        if (this.saldo >= valorFinal) {
            this.saldo -= valorFinal;
            System.out.println("Saque de R$ " + valor + " realizado Conta Corrente.");
        } else {
            System.out.println("Saque não realizado... Valor inválido.");
        }
    }

    public double verSaldo(){
        return saldo;
    }


/*

Implementar a interface Conta
      
    ATRIBUTO
      saldo
      
    MÉTODOS
      get/set
      
Conteúdo básico dos métodos da interface 
        
    depositar
        if (valor > 0) {
            this.saldo = valor;
            System.out.println("Deposito realizado com sucesso...");
        } else {
            System.out.println("Deposito não realizado...");
        }

        
        
    sacar
        double valorFinal = valor * taxa;
        if (this.saldo >= valorFinal) {
            this.saldo -= valorFinal;
            System.out.println("Saque realizado com sucesso...");
        } else {
            System.out.println("Saque não realizado...");
        }
     
*/

}

package model.conta;


//Complete essa classe
public class Poupanca implements Conta {
    
    double saldo;

    public Poupanca(double saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo = valor * taxa;
            System.out.println("Saque de R$ " + valor + " realizado Conta Poupança.");
        } else {
            System.out.println("Deposito não realizado... Valor inválido.");
        }
    }

    public void sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado Conta Poupança.");
        } else {
            System.out.println("Saque não realizado... Valor inválido.");
        }
    }

    public double verSaldo(){
        return saldo;
    }
}

/*
Implementar a interface Conta
      
      ATRIBUTO
      saldo
      
      MÉTODOS
      Metodos get/set
      
Conteúdo básico dos métodos da interface 
        
    depositar
        if (valor > 0) {
            this.saldo = valor * taxa;
            System.out.println("Deposito realizado com sucesso...");
        } else {
            System.out.println("Deposito não realizado...");
        }

        
    sacar
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso...");
        } else {
            System.out.println("Saque não realizado...");
        }
  
*/

    


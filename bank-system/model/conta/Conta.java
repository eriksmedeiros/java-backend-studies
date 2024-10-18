package model.conta;

//Complete essa classe
interface Conta {
    
    double taxa = 1.25;

    void depositar(double valor);
    void sacar(double valor);
    double verSaldo();

    /*
        ATRIBUTO
        double taxa = 1.25
        
        METODOS
        depositar(double valor)
        sacar(double valor)
        verSaldo()
      
     */
}
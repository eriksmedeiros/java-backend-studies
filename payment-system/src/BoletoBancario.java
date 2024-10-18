package src;

public class BoletoBancario extends Pagamento {

    public BoletoBancario(double valor){
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Boleto Bancário. Valor: " + valor);
    }
}

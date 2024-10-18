package src;
public class PayPal extends Pagamento implements IAutenticavel {
    
    public PayPal(double valor){
        super(valor);
    }

    @Override
    public boolean autenticar() {
        if (valor <= 1000.00) {
            return true;
        }

        return false;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Boleto Bancário. Valor: " + valor);
    }
}

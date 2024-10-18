package src;
public class CartaoCredito extends Pagamento implements IAutenticavel {

    public CartaoCredito(double valor){
        super(valor);
    }

    @Override
    public boolean autenticar() {
        if (valor <= 500.00) {
            return true;
        }

        return false;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via Cartão de Crédito. Valor: " + valor);
    }

}

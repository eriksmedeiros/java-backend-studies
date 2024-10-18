package src;

public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();

        Pagamento cartao = new CartaoCredito(450.00);
        Pagamento paypal = new PayPal(900.00);
        Pagamento boleto = new BoletoBancario(1200.00);

        loja.realizarPagamento(cartao);
        loja.realizarPagamento(paypal);
        loja.realizarPagamento(boleto);
    }
}
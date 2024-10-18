package src;
public class Loja {
    public void realizarPagamento(Pagamento pag){
        if (pag instanceof IAutenticavel){
            IAutenticavel metodo = (IAutenticavel) pag;
            if (metodo.autenticar()){
                pag.processarPagamento();
                System.out.println("Pagamento realizado com sucesso!");
            } else{
                System.out.println("Falha na autenticação do pagamento.");
            }
        } else {
            pag.processarPagamento();
            System.out.println("Pagamento realizado sem autenticação.");
        }
    }
}

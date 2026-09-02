package aula.polimorfismoCheckout;

public class PagamentoBoleto implements FormaPagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Gerando boleto bancário....");
        System.out.printf("Boleto de %.2f gerado | cód. de barras: Bb4328nbancodobrasildsak34d5wa", valor);
        System.out.printf("Pagamento de R$ %.2f aprovando", valor);
        System.out.println("Pagamento em boleto aprovado!");
    }
}

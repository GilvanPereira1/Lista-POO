package exercicio_313;

public class InvoiceTest {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice("7","Roteador", 2, 90.90);
		System.out.println("N�mero: "+invoice.getNumero()+"\nDescri��o: "+invoice.getDescricao()+"\nQuantidade: "+invoice.getQuantidade()+"\nValor por item: "+ invoice.getPreco());
		invoice.getInvoiceAmount(invoice.getQuantidade(), invoice.getPreco());
	}

}

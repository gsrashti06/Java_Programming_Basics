
public class InvoiceTest {
	public static void main(String args[]) {
		Invoice invoice1=new Invoice("AB557","Helmet",15,799.00);
		Invoice invoice2=new Invoice("AD445","Dishwash",10,15999.00);
		System.out.printf("Invoice 1 : %s\t%s\t%d\t$%2f\n",
				invoice1.getPartNumber(),invoice1.getPartDescription(),invoice1.getQuantity(),
		invoice1.getPrice());
		
	}

}

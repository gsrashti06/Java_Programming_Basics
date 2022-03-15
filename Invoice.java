//14
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	public Invoice(String partnum,String partdes,int quanty,double prc) {
		if(partnum!=null) {
			partNumber=partnum;
		}
		else {
			partNumber="0";
		}
		if(partdes!=null) {
			partDescription=partdes;
		}
		else {
			partDescription="0";
		}
		if(quanty>0) {
			quantity=quanty;
		}
		else {
			quantity=0;
		}
		if(price>0.0) {
			price=prc;
		}
		else {
			price=0;
		}
	}
	public void setPartNumber(String partnum) {
		if(partnum!=null) {
			partNumber=partnum;
		}
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setQuantity(int quanty) {
		if(quanty>0) 
			quantity=quanty;
		else
			quantity=0;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPrice(double prc) {
		if(prc>0.0)
			price=prc;
		else
			price=0.0;
	}
	public double getPrice() {
		return price;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public double getInvoiceAmount() {
		return (double) quantity*price;
	}

}

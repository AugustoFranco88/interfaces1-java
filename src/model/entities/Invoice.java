package model.entities;

public class Invoice {
	
	private Double basiePayment;
	private Double tax;
	
	public Invoice() {
		
	}

	public Invoice(Double basiePayment, Double tax) {
		this.basiePayment = basiePayment;
		this.tax = tax;
	}

	public Double getBasiePayment() {
		return basiePayment;
	}

	public void setBasiePayment(Double basiePayment) {
		this.basiePayment = basiePayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasiePayment() + getTax();
	}

}

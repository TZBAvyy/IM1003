
public class InvoiceItem {
	
	private String id,desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String id,String desc,int qty,double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	public double getTotal() {
		return this.unitPrice*this.qty;
	}
	
	public String toString() {
		return String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%.2f]",this.id,this.desc,this.qty,this.unitPrice);
	}
	
}

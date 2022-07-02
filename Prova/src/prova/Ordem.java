package prova;

public class Ordem  {
	protected int order_no;
	protected float purch_amt;
	protected String order_date;
	protected int sales_id;
	protected int cust_id;
	public Ordem() {
	}

	public Ordem(int id) {
		this.id = id;
	}

	public Ordem(int order_no, float purch_amt, String order_date,int sales_id,int cust_id) {
		this(purch_amt, order_date,sales_id,cust_id);
		this.order_no = order_no;
	}
	
	public Ordem(int order_no, float purch_amt, String order_date,int sales_id,int cust_id) {
		this.order_no = order_no;
		this.purch_amt = purch_amt;
		this.order_date = order_date;
		this.sales_id = sales_id;
		this.cust_id = cust_id;
	}
}

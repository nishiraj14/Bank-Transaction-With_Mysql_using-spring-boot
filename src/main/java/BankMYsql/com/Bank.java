package BankMYsql.com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private float amt;
	private float tran;
	private float bal;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
	}

	public float getTran() {
		return tran;
	}

	public void setTran(float tran) {
		this.tran = tran;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}	

	

	//user defined fun
	public float Total()
	{
		String msg="";		
	
		if(amt>=10000)
		{
			
			msg="You can access your account";
			bal=amt-tran;		//withdraw		
		}
		else if(amt<10000)
		{
			msg="Please deposit account";
			bal=amt+tran;		//deposit		
		}
		return bal;
	}

}

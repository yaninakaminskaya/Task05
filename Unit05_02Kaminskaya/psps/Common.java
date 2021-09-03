package psps;

import java.util.ArrayList;
import java.util.List;

public class Common {
	private List<Customer> cstmr = new ArrayList<Customer>();

	public Common() {
	}

	public List<Customer> getCstmr() {
		return cstmr;
	}

	public void setCstmr(List<Customer> cstmr) {
		this.cstmr = cstmr;
	}

	public void add(Customer b) {
		cstmr.add(b);
	}

	public void setCustomer(int i, Customer b1) {
		this.cstmr.set(i, b1);
	}

	public Customer getCustomer(int i) {
		return cstmr.get(i);
	}

	public int size() {
		return cstmr.size();
	}

}

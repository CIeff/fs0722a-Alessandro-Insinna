package esercizio.giovedi;

public class Customer {

	long id;
	String name;
	int tier;
	
	public Customer(long id, String name, int tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getTier() {
		return tier;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}


}

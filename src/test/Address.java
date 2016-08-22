package test;

public class Address {

	private String adress;

	private String city;

	public Address(String adress, String city) {
		super();
		this.adress = adress;
		this.city = city;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}

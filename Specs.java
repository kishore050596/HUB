package collection;

public class Specs {
	
	 int price;
	String location;
	 boolean ispowerglass;
	 
	public Specs(int price, String location, boolean ispowerglass) {
	
		this.price = price;
		this.location = location;
		this.ispowerglass = ispowerglass;
	}
	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public boolean isIspowerglass() {
		return ispowerglass;
	}


	public void setIspowerglass(boolean ispowerglass) {
		this.ispowerglass = ispowerglass;
	}


	public String toString() {
		return "Specs [price=" + price + ", location=" + location + ", ispowerglass=" + ispowerglass + "]";
	}
	
	 
	 

}

package collection;

public class Shirt {
	private String brand;
	private int price;
	private String colour;
	private  boolean ischecked;
	
public Shirt(String brand, int price, String colour, boolean ischecked) 
	{
		
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.ischecked = ischecked;
	}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public boolean isIschecked() {
	return ischecked;
}

public void setIschecked(boolean ischecked) {
	this.ischecked = ischecked;
}
public String toString() 
	{
	  return "Brand = "+brand+" "+"Price = "+price+" "+"Colour = "+colour+" "+"IS CHECKED = "+ischecked;	
	}
	
	
	

}

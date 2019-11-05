
public class Items {
	protected String Name;
	protected int Quantity, Rating;
	public Items(String name, int quantity, int rating) {
		this.Name = name;
		this.Quantity = quantity;
		this.Rating = rating;
	}
	
	public String getName(){
		return this.Name;
	}
	public int getQuantity(){
		return this.Quantity;
	}
	public int getRating(){
		return this.Rating;
	}
	public int getBasePrice(){
		return this.Rating*10000;
	}
	public int getTotalPrice(){
		int basePrice = this.getBasePrice();
		return this.Quantity*basePrice;
	}
}

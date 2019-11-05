
public class Coffee extends Items{
	private String Size, Type;
	public Coffee(String name, int quantity, int rating, String size, String type) {
		super(name, quantity, rating);
		this.Size = size;
		this.Type=type;
	}

	public String getSize(){
		return this.Size;
	}
	public String getType(){
		return this.Type;
	}
	public int getSizePrice(){
		if(Size=="Small") return 1*5000;
		else if(Size=="Medium") return 2*5000;
		else return 3*5000;
	}
	
	@Override
	public int getTotalPrice(){
		int sizePrice = this.getSizePrice();
		int basePrice = super.getBasePrice();
		return super.Quantity*(basePrice+sizePrice);
	}
}
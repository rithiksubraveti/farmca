package ie.cct.farmca;

public class Animals {
	private String type;
	private float weight;
	private float price;
	
	
	public Animals() {
		super();
	}
	public Animals(String type, float weight, float price) {
		this.type = type;
		this.weight = weight;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	

}

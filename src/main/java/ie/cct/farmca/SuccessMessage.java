package ie.cct.farmca;

public class SuccessMessage {
	private String message;
	private float value;
	private float mass;
	


	

	
	public SuccessMessage(String message, float value) {
		super();
		this.message = message;
		this.value = value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public SuccessMessage(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}

}

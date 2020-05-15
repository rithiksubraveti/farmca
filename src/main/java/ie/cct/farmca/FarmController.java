package ie.cct.farmca;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Tells spring that it is a Controller */
public class FarmController {
	
	private ArrayList<Animals> animalslist;

	@GetMapping("welcome-message")
	public String welcome() {
		return "Welcome To The Farm";
	}

	public FarmController() {
		animalslist = new ArrayList<Animals>();
	}

	@PostMapping("add-animal") //end point 1
	public SuccessMessage add(@RequestBody Animals a) {
		animalslist.add(a);
		return new SuccessMessage("Animal" + " "+ a.getType() +" " +"of weight" +a.getWeight()+ " "+ "and price"+a.getPrice()+" "+ "added successfully.");
	}

	@GetMapping("average-weight") //end point 2
	public String averageweight() {
		float weight = 0.0f;
		for (Animals a : animalslist) {
			weight += a.getWeight();
		}
		weight = weight / animalslist.size();
		return "The average weight  of the animals in the farm is "+weight;
		}
	
	@GetMapping("canbe-sold")  //end point 3
	
public float canbesold() {
		int value =0;
		int cows = 0;
		int pigs = 0;
		int chickens = 0;
		
		for(Animals a: animalslist) {
			if(a.getType().equals("cow") && (Float)a.getWeight() >= 300.0f) {
				cows++;
			} else if(a.getType().equals("pig") && (Float)a.getWeight()>=100.0f) {
				pigs++;
			} else if (a.getType().equals("chicken") && (Float)a.getWeight()>=0.5f) {
				chickens++;
			}
			
		}
		return cows + pigs + chickens;
		
	}
	
		@GetMapping("farm-value") /*end point 4*/
		public SuccessMessage farmvalue() {
			int count = 0;
			String type = null;
			float weight =0.0f;
			float price =0.0f;
			for(Animals animals: animalslist) {
				if(((animals.getWeight()>=300.0f)&&(animals.getType().equals("Cow")))|| ((animals.getWeight()>=100.0f)&&(animals.getType().equals("Pig")))
						|| ((animals.getWeight()>=0.5f)&&(animals.getType().equals("Chicken"))))
				{
					price += animals.getPrice();
				}
			}
			return new SuccessMessage("The current value of the farm is "+price);
			
		
		
	}
	@GetMapping("calculator-sum") /* end point 5*/
	public float calculatorSum(@RequestParam(required = true) Float value1,@RequestParam(required = true) Float value2) {
		float totalprice;
		totalprice= value1+value2;	
		return  totalprice;
	}
	
	
}

	
	
	


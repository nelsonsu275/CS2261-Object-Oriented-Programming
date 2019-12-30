
public class Smartphone extends Machine {
	private static double Mprice = 200;
	private static double Mweight = 0.3;
	
	public void setPrice(double price) {
		if(price >= 220 && price <= 350) {
			this.price = price;
		}
		else {
			this.price = Mprice;
		}
	}
	
	public void setWeight(double weight) {
		if(weight >= 0.25 && weight <= 0.5) {
			this.weight = weight;
		}
		else {
			this.weight = Mweight;
		}
	}
	

}

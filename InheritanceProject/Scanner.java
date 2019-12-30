
public class Scanner extends Machine {
	
	private static double Mprice = 80;
	private static double Mweight = 10;
	
	public void setPrice(double price) {
		if(price >= 60 && price <= 300) {
			this.price = price;
		}
		else {
			this.price = Mprice;
		}
	}
	public void setWeight(double weight) {
		if(weight >= 2 && weight <= 25) {
			this.weight = weight;
		}
		else {
			this.weight = Mweight;
		}
	}

}


public class Printer extends Machine {
	
	private static double Mprice = 90;
	private static double Mweight = 25;
	
	public void setPrice(double price) {
		if(price >= 40 && price <= 200) {
			this.price = price;
		}
		else {
			this.price = Mprice;
		}
	}
	
	public void setWeight(double weight) {
		if(weight > 0 && weight < 50) {
			this.weight = weight;
		}
		else {
			this.weight = Mweight;
		}
	}

}

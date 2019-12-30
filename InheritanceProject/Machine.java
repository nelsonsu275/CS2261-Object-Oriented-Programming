
public abstract class Machine {

	private String name;
	private String description;
	protected double price;
	protected double weight;
	
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
		
	public double getPrice() 
	{
		return price;
	}
	
	public abstract void setPrice(double price);
	
	public double getWeight() 
	{
		return weight;
	}
	
	public abstract void setWeight(double weight);
	

}


public class MachineTest {
	public static void main(String[] args) {
		Machine[] M = new Machine[10];
		
		M[0] = new Printer();
		M[0].setName("Printer A");
		M[0].setDescription("This is a laser printer");
		M[0].setPrice(199);
		M[0].setWeight(30);
			
		M[1] = new Printer();
		M[1].setName("Printer B");
		M[1].setDescription("This is an inkjet printer");
		M[1].setPrice(40);
		M[1].setWeight(1.5);
			
		M[2] = new Printer();
		M[2].setName("Printer C");
		M[2].setDescription("This is a slow inkjet printer");
		M[2].setPrice(70);
		M[2].setWeight(6);	
		
		M[3] = new Printer();
		M[3].setName("Printer D");
		M[3].setDescription("This is a fast inkjet printer");
		M[3].setPrice(50);
		M[3].setWeight(7);	
		
	    M[4] = new Scanner();
        M[4].setName("Scanner A");
        M[4].setDescription("This is a black and white scanner");
        M[4].setPrice(70);
        M[4].setWeight(4);
       
        M[5] = new Scanner();
        M[5].setName("Scanner B");
        M[5].setDescription("This is a color scanner");
        M[5].setPrice(80);
        M[5].setWeight(20);
        
        M[6] = new Scanner();
        M[6].setName("Scanner C");
        M[6].setDescription("This scanner is both color and black/white");
        M[6].setPrice(250);
        M[6].setWeight(20);
        
        M[7] = new Smartphone();
        M[7].setName("Smartphone A");
        M[7].setDescription("This smartphone has Marshmellow operating system");
        M[7].setPrice(230);
        M[7].setWeight(0.4);
        
        M[8] = new Smartphone();
        M[8].setName("SmartPhone B");
        M[8].setDescription("This smartphone has KitKat operating system");
        M[8].setPrice(240);
        M[8].setWeight(.3);  

        M[9] = new Smartphone();
        M[9].setName("Smartphone C");
        M[9].setDescription("This smartphone has Jelly Bean operating system");
        M[9].setPrice(235);
        M[9].setWeight(.45);
                
        for(int i = 0; i < M.length; ++i) {
        	System.out.println("Machine: " + (i + 1));
        	System.out.println("Name: " + M[i].getName());
        	System.out.println("Description: " + M[i].getDescription());
        	System.out.println("Price: " + M[i].getPrice());
        	System.out.println("Weight: " + M[i].getWeight());       	
            System.out.println();
        }
	}

}

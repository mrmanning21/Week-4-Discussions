public class Box2 {

		//Declaring my instance variable.
		int size = 0;
		
	//Creating printBox method.
	public void printBox() {

		//Setting my x,y column/row loops and printing stars that space.
		for(int x = 0; x < size; x++) {

		for(int y = 0; y < size; y++) 

		System.out.print("*");
		System.out.println();
	}
}

	//Input overload.
	public void printBox(char c) {    
		  
		for (int x = 0; x < size; x++) {
	    
		for (int y = 0; y < size; y++)
	    
		System.out.print(c);
	    System.out.println();
	 }
}
	
	
	//Bringing back in the main method to invoke printBox and size.
	public static void main(String[] args) {

		//object creation.
		Box2 starBox = new Box2();

		//Size listed using dot operator.
		starBox.size = 5;

		starBox.printBox();
		
		System.out.println("It's time to invoke the overload: ");
	     
		//print this overload method.
		starBox.printBox('c');
	}

}

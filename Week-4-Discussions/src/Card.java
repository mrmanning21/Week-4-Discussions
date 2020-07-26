import java.util.Random; //Importing the randomizer.

	//Making the class for Card.
	public class Card {

       private int ranks, suits;
       
       //Setting up a constructor for randomizing the cards.
       public Card () {
    	   
    	   Random rand = new Random();
    	   
    	   //Declare values and generate.
    	   suits = rand.nextInt (4)+1;
    	   ranks = rand.nextInt (13)+1;
    	   
    	   }

       //Constructor parameters.
       public Card (int suits, int ranks) {
    	   
    	   if (suits > 0 && suits < 5 && ranks > 0 && ranks < 14) {
    		   
    		   //Validation of the values.
    		   this.suits = suits; 
    		   this.ranks = ranks;
    	   }
    	   
    	   else {
    		   this.suits = 1;
    		   this.ranks = 1; 
    	   }
    	   
    }
       

	//Return value for the card rankings.
       public int rankVal () {
    	   return ranks;
       }
       
       public int suitVal () {   
    	   return suits;
       }
       
       //When values are valid, the next two commands update them.
       public void setSuits (int suits) {
    	   if (suits > 0 && suits < 5)  
    		   this.suits = suits;
       }
       
       
       public void setRanks (int ranks) {
    	   
    	   if (ranks > 0 && ranks < 15)
    		   this.ranks = ranks;
       }
       
       public String getRankings() {
    	   
    	   	if (ranks == 1)
    	   		return "Ace";
    	   
    	   	else if (ranks >= 2 && ranks <= 10)
    	   		return (ranks+"");
    	   
    	   	else if (ranks == 11)
    	   		return "Jack";
    		
    		else if (ranks == 12)
    			return "Queen";
    					
    		else 
    			return "King";
    	  
       }
       
       //Implementing the toString method.
       public String toString() {
    	   
    	   	String st = getRankings();
    	  
    	   	if (suits == 1)
    	   		st += " of Diamonds.";
    	
    		else if (suits == 2)
    			st += " of Hearts.";
    		
    		else if (suits == 3)
    			st += " of Clubs.";
    			
    		else if (suits == 4)
    			st += " of Spades.";
    					
    		return st;
    			
       }	
	
       public static void main(String[] args) {

	             System.out.println("5 Random cards: ");

	             //Generation of the random cards.
	             for (int x=0; x < 5; x++)

	             {
	                    Card crd = new Card();
	                    System.out.println(crd);
	             }	
	       }
	}
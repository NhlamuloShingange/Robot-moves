package sourcing;

import java.util.HashSet;
import java.util.Scanner;


public class robot {
	// TODO Auto-generated method stub
	public static void main(String[] args) {
	    int x = 0;
	    int y = 0;
	    int total = 0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Please enter coordinates :");
	    String str = input.nextLine();
	    str = str.toUpperCase();
	    
	    HashSet<String> set = new HashSet<String>();
	    
	    String [] arrOfStr = str.split(",");
	    
	    for(String coodinate : arrOfStr)
	    {
            char dir = coodinate.charAt(0);
            String count = coodinate.substring(1);
            int max = Integer.parseInt(count);
            
            if(dir == 'N')
            {
            	try
            	{
        	        for(int i = 0; i < max; i++)
        	        {
        	        	y = y + 1;
        	        	set.add("[" + x + "][" + y + "]");			        	
        	        }
            	}
            	catch(NumberFormatException e)
            	{
            		System.out.println("Invalid coordinates!!");
            	}
            }
	    
            if(dir == 'E')
            {
    	        for(int i = 0; i < max; i++)
    	        {
    	        	x = x + 1;
    	        	set.add("[" + x + "][" + y + "]");		        	
    	        }
            }
	    
            if(dir == 'S')
            {
    	        for(int i = 0; i < max; i++)
    	        {
    	        	y = y - 1;
    	        	set.add("[" + x + "][" + y + "]");			        	
    	        }
            }
	    
            if(dir == 'W')
            {
    	        for(int i = 0; i < max; i++)
    	        {
    	        	x = x - 1;
    	        	set.add("[" + x + "][" + y + "]"); 	        	
    	        } 
            }
            
            else
            {
            	System.out.println(dir + " is not a valid coordinate!");
            }
            
        }
	    
        System.out.println("Coordinates : " + set);
        System.out.println("Total : " + set.size());	    		        

	}	
}

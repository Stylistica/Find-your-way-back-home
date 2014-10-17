

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class WayBackHome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> routes = new ArrayList<String>();
		ArrayList<String> directions = new ArrayList<String>();
		ArrayList<String> places = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
 
    	System.out.println("Enter the number of directions to destination:");
    	int size = in.nextInt();
    	System.out.println("Enter the directions to destination:\n");
    	for(int i=0;i<=size;i++){
    		routes.add(in.nextLine());
    	}
    	routes.remove(0);
    
		for (String route : routes) {
			directions.add(route.substring(0, route.indexOf(" ")));
			places.add(route.substring(route.indexOf(" ")));
		}
		
	Collections.reverse(places);
	
	
	directions.remove("Begin");
	for (int i = 0; i < directions.size(); i++) {
		if(directions.get(i).equals("Left"))
		{
			
			directions.set(i, "Right");
			
		}
		else if(directions.get(i).equals("Right"))
		{
		directions.set(i, "Left");
			
		}
	}

	Collections.reverse(directions);
	directions.add(0,"Begin");
	
	System.out.println("\nFollow the below route to find your way back home:");
	System.out.println("\n");
	for (int i = 0; i < directions.size(); i++) {
		System.out.println((i+1)+"."+directions.get(i)+places.get(i));
	}
	
}
}

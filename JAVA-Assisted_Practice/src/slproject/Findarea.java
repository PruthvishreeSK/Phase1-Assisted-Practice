package slproject;

import java.util.ArrayList;
import java.util.Scanner;

class Parentclass {
	
	public float area;
	
	public void displayarea(float area)
	{
		System.out.println("Area of the given shape is: "+area);
	}

}

class Squarearea extends Parentclass {
	
	Squarearea()
	{
		System.out.println("Square");
	}
	
	float calculatearea(float l)
	{
		return (l*l);
	}
}

class Rectanglearea extends Parentclass {

	
	Rectanglearea()
	{
		System.out.println("Rectangle");
	}
	
	float calculatearea(float l, float b)
	{
		return (l*b);
	}
}

public class Findarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Squarearea obj1 = new Squarearea(); 
		
		//obj1.displayarea(obj1.calculatearea(5.0f));
		
		Rectanglearea obj2 = new Rectanglearea(); 
		
		//obj2.displayarea(obj2.calculatearea(5.0f, 4.0f));
		
		ArrayList<Parentclass> objlist = new ArrayList<>();
		
		objlist.add(obj1);
		objlist.add(obj2);
		
		System.out.println(objlist);
		
		
		
		/*catch(Exception e)
		{
			e.printStackTrace();
		}

		finally
		{
			System.out.println("Project ends here");
		}
		8/
		/*Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Select the shape you want to calculate the area from below list"
					+ "\n\t Input S for Square"
					+ " \n\t Input R for Rectangle"
					+ "\n\t Input E to Exit");
			
			char input = sc.next().charAt(0);
			
			switch(Character.toUpperCase(input))
			{
				
			case 'S' : System.out.println("Enter length of the sqaure: ");
						float l = sc.nextFloat();
						obj1.displayarea(obj1.calculatearea(l));
						break;
						
			case 'R' : System.out.println("Enter length and breadth of the rectangle: ");
						float len = sc.nextFloat();	
						float b = sc.nextFloat();
						obj2.displayarea(obj2.calculatearea(len, b));
						break;
						
			case 'E' : System.exit(0);
			
			default : System.out.println("Wrong input!");
			
			}
			
		}while(true);
		
*/
	}

	}


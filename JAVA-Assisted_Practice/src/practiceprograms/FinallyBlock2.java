package practiceprograms;

//With exception

public class FinallyBlock2 {

	public static void main(String args[]){  
		try{
		int number=5/0;  
		System.out.println(number);  
		  }  
		catch(NullPointerException e)
		  {
			System.out.println(e);
		  }  
		finally
		  {
	System.out.println("finally block is always executed\n");
		  }  
		System.out.println("then rest of the code...");  
		  } 

	
}

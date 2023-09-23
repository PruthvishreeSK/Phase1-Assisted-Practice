package practiceprograms;


//class definition

public class Constructor {

		// default constructor
		
		public Constructor()
		{
			System.out.println("This is default Constructor");
		}
		
		// parameterized constructor with 1 value
		
		public Constructor(int a)
		{
			System.out.println("This is parametrized constructor ");
			System.out.println(" The value of variable a is :" + a);
		}
		
		// parameterized constructor with 2 values
		
		public Constructor(int a, int b)
		{
			System.out.println("This is parametrized constructor ");
			System.out.println(" The value of variable a is :" + a);
			System.out.println(" The value of variable a is :" + b);
		}

		public static void main(String[] args) {
			
			// Object creation
			
			Constructor obj = new Constructor();
			Constructor obj2 = new Constructor(10); 
			Constructor obj3 = new Constructor(10,20); 	
	}

}

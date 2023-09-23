package practiceprograms;

		
class DefAccessSpecifier
{ 
	void display() 
	{ 
		System.out.println("You are using default access specifier"); 
	} 
} 

class AccessSpecifiers1 extends DefAccessSpecifier{

	public static void main(String[] args) {
				//default
		System.out.println("Dafault Access Specifier");
		DefAccessSpecifier obj = new DefAccessSpecifier(); 		  
		obj.display(); 

	}
		
}


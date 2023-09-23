package anotherpackage;

import practiceprograms.*;

public class AccessSpecifiers3 extends ProAccessSpecifier {

	public static void main(String[] args) {
		ProAccessSpecifier obj = new ProAccessSpecifier ();   
	       obj.display();  //error-- The method display() from the type ProAccessSpecifier is not visible
	}

}


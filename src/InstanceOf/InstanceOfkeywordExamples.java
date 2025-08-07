package InstanceOf;

class parent {
}

class child extends parent {
}

public class InstanceOfkeywordExamples {
	public static void main(String[] args) {
		parent p= new child();
		
		child ch=new child();
		
		if(p instanceof parent) {
			System.out.println("object is instance of parent");
		}
		else {
			System.out.println("object is not instance of parent");
		}
		
		if(ch instanceof child) {
			System.out.println("ch object is instance of child");
		}
		else {
			System.out.println("ch object is not instance of child");
		}
	}
}

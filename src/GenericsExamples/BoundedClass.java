package GenericsExamples;

class Bound <T extends A>{
	
	private T objReference;
	
	public Bound(T objReference) {
		this.objReference=objReference;
	}
	
	public void doRunTest() {
		this.objReference.displayClass();
	}
}

class A{
	public void displayClass() {
		System.out.println("execution insie class A");
	}
}

class B extends A{
	public void displayClass() {
		System.out.println("execution inside class B");
	}
}

class C extends A{
	public void displayClass() {
		System.out.println("execution inside class C");
	}
}

public class BoundedClass {
	public static void main(String[] args) {
		 Bound<A> bound= new Bound<A>(new A());
		 bound.doRunTest();
		 
		 Bound<B> boundb=new Bound<B>(new B());
		 boundb.doRunTest();
		 
		 Bound<C> boundc=new Bound<C>(new C());
		 boundc.doRunTest();
		 
		// Bound<String> boundString=new Bound<String>(new String("sagar dahibhate"));
		 
	}
}

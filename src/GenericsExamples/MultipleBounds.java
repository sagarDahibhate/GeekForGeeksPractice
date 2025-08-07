package GenericsExamples;

/*
 * ava Generics supports multiple bounds also, i.e., 
 * In this case, A can be an interface or class. If A is class, then B and C
 *  should be interfaces. We can’t have more than one class in multiple bounds.
 * */

class Bounds<T extends AA & BB> {
	private T objectRef;

	Bounds(T objectRef) {
		this.objectRef = objectRef;
	}

	public void doRunTest() {
		this.objectRef.displayClass();
	}
}

interface BB {
	public void displayClass();

}

class AA implements BB {

	public void displayClass() {
		System.out.println("execution inside AA class");
	}

}

class CC extends AA {

	public void displayClass() {
		System.out.println("execution inside CC class");
	}

}


public class MultipleBounds {
 public static void main(String[] args) {
   Bounds<AA> boundsaa=new Bounds<AA>(new AA());
   boundsaa.doRunTest();
   
   Bounds<AA> boundscc=new Bounds<AA>(new CC());
   boundscc.doRunTest();
   
   
 }
}

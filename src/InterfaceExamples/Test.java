package InterfaceExamples;

interface interf {
	public static final int a = 10;

	public abstract void m1();
}

public class Test implements interf {

	public static void main(String[] args) {
		int ab=interf.a;
		System.out.println(ab);
	}
	
	@Override
	public void m1() {
		
	}
}

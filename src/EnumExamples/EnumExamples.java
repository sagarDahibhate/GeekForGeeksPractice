package EnumExamples;

public class EnumExamples {
	/* internally above enum Color is converted to
	class Color
	{
	     public static final Color RED = new Color();
	     public static final Color BLUE = new Color();
	     public static final Color GREEN = new Color();
	}*/
	
	enum Color{
		RED,
		BLUE,
		GREEN;
	}
	
	public static void main(String[] args) {
      Color color=Color.RED;
      System.out.println(color);
	}
}

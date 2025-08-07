package EnumExamples;

enum Color {
	RED, BLUE, GREEN, WHITE, BLACK;
	
	private Color() {
		System.out.println("constructor is called for "+this.toString());
	}
	
	public void colorInfo() {
		System.out.println("universal color informations");
	}
}

public class ColorEnum {
	public static void main(String[] args) {
		Color color = Color.valueOf("RED");
		System.out.println(color);

		//Color[] arr = Color.values();
		//for (Color color2 : arr) {
			//System.out.println(color2 + "at index" + color2.ordinal());
		//}
	}
	
	
}

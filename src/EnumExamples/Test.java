package EnumExamples;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

}

public class Test {

	Day day;

	Test(Day day) {
		this.day = day;
	}

	public void dayIsLike() {

		switch (day) {
		case SUNDAY:
			System.out.println("sundays are good");
			break;
		case MONDAY:
			System.out.println("MONDAY are bad");
			break;
		case TUESDAY:
			System.out.println("TUESDAY are bad");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY are bad");
			break;
		case THURSDAY:
			System.out.println("THURSDAY are bad");
			break;
			
		case FRIDAY:
			System.out.println("FRIDAY are bad");
			break;
			
		case SATURDAY:
			System.out.println("SATURDAY are bad");
			break;

		default:
			System.out.println("wrong choice");
			break;
			
			
			
		}

	}

	public static void main(String[] args) {
		Day day=Day.valueOf("SUNDAY");
		Test test=new Test(day);
		test.dayIsLike();
		
	}
}

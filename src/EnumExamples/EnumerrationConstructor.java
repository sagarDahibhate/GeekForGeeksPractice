package EnumExamples;
enum TrafficSignals {
	RED("STOP"), GREEN("GO"), YELLOW("WAIT");

	public String action;

	private TrafficSignals(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}
}

public class EnumerrationConstructor {
	public static void main(String[] args) {
		TrafficSignals[] tsArray = TrafficSignals.values();

		for (TrafficSignals ts : tsArray) {
			System.out.println(ts.ordinal()+"  "+ts.name()+" "+ts.getAction());
		}

	}
}

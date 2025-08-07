package EnumExamples;
enum TrafficSignal {
	RED("Stop"), GREEN("go"), YELLOW("wait");

	String action;

	TrafficSignal(String action) {
		this.action = action;
	}

	public String getAction() {
		return this.action;
	}
}

public class EnumConstructorExample {
	public static void main(String[] args) {

		TrafficSignal[] arrts = TrafficSignal.values();

		for (TrafficSignal trafficSignal : arrts) {
			System.out.println(
					"Signal name :" + trafficSignal.name() + "      action of signal :" + trafficSignal.getAction());

		}

	}
}

package OptionalClassExamples;

import java.util.Optional;

public class OptionalExamples {

	public static Optional<String> getName(){
		return Optional.ofNullable("sagar");
	}
	public static void main(String[] args) {
		String name = "This is sagar";

		Optional<String> optional = Optional.ofNullable(name);

		System.out.println(optional.isPresent());

		// System.out.println(optional.get());

		System.out.println(optional.orElse("name is not present now "));
		
		Optional<String> name2 = getName();
		System.out.println(name2.orElse("prajwal"));
		
	}
}

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	int rollNo;
	int marks;
	String name;

	Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	int getRollNo() {
		return this.rollNo;
	}	
	
	String getName() {
		return name;
	}
	
	int getMarks() {
		return marks;
	}
}

public class StreamExample2 {
	public static void main(String[] args) {
		// int arr[] = {30,20,10};
//		
//		OptionalInt max = Arrays.stream(arr).max();
//		double asDouble = Arrays.stream(arr).average().getAsDouble();

//		int asInt = max.getAsInt();
//		System.out.println(asInt);

		//Stream.iterate(1, n -> n + 1).filter(n -> n.toString().contains("5")).limit(10).forEach(System.out::println);
		
		
    Student[] arr= {
    	new Student(1, "Bhakti", 80),
    	new Student(2, "sagar", 80),
    	new Student(3, "Mansi", 70)
    };		
		

    double asDouble = Arrays.stream(arr)
    .mapToInt(n->n.getMarks())
    .average()
    .getAsDouble();
    
    System.out.println(asDouble);
    
//    Map<Integer, String> collect = Arrays.stream(arr)
//    .collect(Collectors.toMap(Student::getRollNo, Student::getName));

     Arrays.stream(arr).collect(Collectors.groupingBy(Student::getRollNo));  
    
     
     // Creates a list using asList()
     List<Integer> l 
     = Arrays.asList(
         5, 10, 20, 30, 8, 7);
     
     // Taking the list as a source
     // Applying stream
     // filtering out the even numbers
     // filtering out the numbers > 10
     // Printing the list
     l.stream()
     .filter(x -> x % 2 == 0)
     .filter(x-> x>10)
     .forEach(System.out::println);
     
     
	}
}

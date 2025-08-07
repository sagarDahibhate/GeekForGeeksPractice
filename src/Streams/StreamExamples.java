package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(35);

		Stream<Integer> stream = list2.stream();
//		stream.forEach(i -> System.out.println(i));
//		stream.close();
		List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(collect);
		
		String [] names= {"sagar","bhakti", "mansi"};
		 Stream<String> stringStream = Stream.of(names);
		 stringStream.forEach(s-> System.out.println(s.toString()));
		
		 
		 
		 IntStream stream2 = Arrays.stream(new int [] {1,2,3});
		 stream2.forEach(i-> System.out.println(i));
		 
		 
		 String [] nameof = {"Aman","sagar","Abhisheikh"};
		 Stream<String> streamobj = Stream.of(nameof);
		 List<String> collect2 = streamobj.filter(s->s.startsWith("A")).collect(Collectors.toList());
		 
		 collect2.forEach(s-> System.out.println(s));
		 
		 
		 Integer [] arr= {1,3,5,7,8};
		 Stream<Integer> numStream = Stream.of(arr);
		 
		List<Integer> collect3 = numStream.map(n-> n*n).collect(Collectors.toList());
		collect3.forEach(n-> System.out.println(n));
		
		
		 
		 
		 
		 
		
	}
}

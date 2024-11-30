package selenium_by_Y;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streeams {

	public static void main(String[] arg) {

		// count the number of names start with "A"

		ArrayList<String> names = new ArrayList<>();

		names.add("ABHIJEET");

		names.add("Don");

		names.add("Alekhya");

		names.add("antom");

		names.add("Ram");

		int count = 0;

		for (String actual : names) {

			if (actual.startsWith("A")) {

				count++;
			}

		}

	//	System.out.println(count);


		stream_test();
	}

	static void stream_test() {

		ArrayList<String> names = new ArrayList<>();

		names.add("ABHIJEET");

		names.add("Don");

		names.add("Alekhya");

		names.add("antom");

		names.add("Ram");
		names.add("home");

		//java streams

	long a=	names.stream().filter(s->s.startsWith("A")).count();

	//System.out.println(a);

	// instead of collection we can directly store value in stream

	   Stream.of("Abhijeet", "Don", "Alekhya", "Antom", "Ram").filter(d->d.startsWith("A"));

	   //print all the name of array list

	 //  names.stream().filter(z->z.length()>=4).forEach(z->System.out.println(z));


	  // names.stream().filter(z->z.length()>=4).limit(9).forEach(z->System.out.println(z));


	   // print name which is ends with "a" change to that name is uppercase and also see map()

	 //  Stream.of("Abhijeet", "Don", "Alekhya", "Antom", "Rama").filter(d->d.endsWith("a")).map(d->d.toUpperCase()).forEach(d->System.out.println(d));

	   // sorted
	   List<String> k =  Arrays.asList("Azbhijeet", "Don", "Alekhya", "Antom", "Rama");

	   k.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(s-> System.out.println(s));


	   // stream convert back to list

	List<String> ls=  Stream.of("Abhijeet", "Don", "Alekhya", "Antom", "Rama").filter(d->d.endsWith("a")).map(d->d.toUpperCase())
	   .collect(Collectors.toList());

	System.out.println(ls.get(1));

	   // integer

	List<Integer> values = Arrays.asList(1,2,4,3,5,2,6,7,8,8,9);
	// unique number
	//values.stream().distinct().forEach(s->System.out.println(s));

	values.stream().sorted().distinct().forEach(s->System.out.println(s));

	// stream to back

	List<Integer> n= values.stream().sorted().distinct().collect(Collectors.toList());

	   System.out.println("after ="+n.get(3));










	}

}

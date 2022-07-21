import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EvenNumberGenerated {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		System.out.println("Enter the number of elements to generate");
		int elements=scanner.nextInt();
		Random random=new Random();
		for(int i=0;i<elements;i++) {
			list.add(random.nextInt(20));
	     }
		System.out.println("Generated elements are");
		for(int generatedElements:list){
			System.out.println(generatedElements);
		}
		System.out.println("Even numbers are");
	    list.stream().filter(j -> j % 2 == 0).forEach(System.out::println);
	    scanner.close();		
}
}
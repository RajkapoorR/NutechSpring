import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingList {
public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
List<Integer> list = new ArrayList<> ();
System.out.println("Enter the number of elements to add");
int element=scanner.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<element;i++) {
list.add(scanner.nextInt());
}
Collections.sort(list);
System.out.println("Sorted list : "+list);
scanner.close();
}
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Student implements Comparable<Student>{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student student) {
		if(age==student.age)
			return 0;
		else if(age>student.age)
			return 1;
		else 
			return -1;
}}
public class SortDemo {
   public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Student> list=new ArrayList<> ();
		System.out.println("No. of students to compare");
		int n=scanner.nextInt();
		System.out.println("Enter the Student name and age :");
		for(int i=0;i<n;i++) {
		list.add(new Student(scanner.next(),scanner.nextInt()));}
		System.out.println("Student's list :"+list);
		Collections.sort(list);
		System.out.println("Sort by age");
		System.out.println("Name"+"\t"+"Age");
		for(Student student:list) {
	        System.out.println(student.name+"\t"+student.age);
      scanner.close();
}
}}
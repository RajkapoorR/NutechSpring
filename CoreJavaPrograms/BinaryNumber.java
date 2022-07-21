import java.util.Scanner;

public class BinaryNumber {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int temp=num;
	    System.out.println(" ");
	    int remainder;
		String bin_num="";
	    while(temp>0) {
		remainder=temp%2;
		bin_num=remainder+""+bin_num;
		temp=temp/2;}
	    System.out.println("Binarynumber is: "+bin_num);
	    scanner.close();

}
}
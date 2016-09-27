package quiz2;
import java.util.Scanner;
public class Fee {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your first year tuition fee: $");
		double total=0;
		double FirstYearFee=input.nextDouble();
		System.out.print("Enter the percentage increases each year: ");
		double Rate=input.nextDouble();
		for (int i=0; i<4;i++){
			total=total+FirstYearFee*Math.pow((1+Rate/100), i);
		}
		double total100=total*100;
		total100=Math.rint(total100);
		total=total100/100;
		
		System.out.println("The total tuition fee is $"+total);
		
	}
}

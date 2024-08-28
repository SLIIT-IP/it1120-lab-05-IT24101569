import java.util.Scanner;
public class IT24101569lab5Q1{
	public static void main(String[]arg){
		Scanner number=new Scanner(System.in);
			
		System.out.print("Enter the first integer: ");
		int firstnumber = number.nextInt();

		System.out.print("Enter the secound integer: ");
		int secondnumber = number.nextInt();

		System.out.print("Enter the third number: ");
		int thirdnumber = number.nextInt();
	
		System.out.println();
		System.out.println("User entered numbers are : "+firstnumber+" "+secondnumber+" "+thirdnumber);
		
		int smallestnumber = firstnumber;
		if (secondnumber<smallestnumber)
		{
			smallestnumber=secondnumber;
		}
		if(thirdnumber<smallestnumber)
		{
			smallestnumber=thirdnumber;
		}

		System.out.println("The Smallest number is :"+smallestnumber);


		int Largestnumber = firstnumber;
		if (secondnumber>Largestnumber)
		{
			Largestnumber=secondnumber;
		}
		if(thirdnumber>Largestnumber)
		{
			Largestnumber=thirdnumber;
		}

		System.out.println("The Largest number is :"+Largestnumber);
	}
}				














		
		


		
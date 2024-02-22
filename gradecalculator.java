import java.util.Scanner;
public class gradecalculator {

	public static void main(String[] args) {
		int M;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks obtained in each subject out of 100");
		System.out.println("Marks in English out of 100: ");
		@SuppressWarnings("unused")
		int English = sc.nextInt();
		System.out.println("Marks in Maths out of 100: ");
		@SuppressWarnings("unused")
		int Maths= sc.nextInt();
		System.out.println("Marks in Science out of 100: ");
		@SuppressWarnings("unused")
		int Science =sc.nextInt();
		System.out.println("Marks in Social Science out of 100: ");
		@SuppressWarnings("unused")
		int Socialscience =sc.nextInt();
		System.out.println("Marks in Hindi out of 100 : ");
		@SuppressWarnings("unused")
		int Hindi =sc.nextInt();
		 M = (English+Maths+Science+Socialscience+Hindi);
		 @SuppressWarnings("unused")
		float percentage= M*100/500;
		System.out.println("Total marks obtained in exam is "+ M + " Percentage obtained is "+ percentage);
		//System.out.println("Percentage: "+((M/500)*100));
		//int a = sc.nextInt();
		if(percentage>=91) {
			System.out.println("And the Grade obtained is A+ Grade");
		}
		else if ( percentage>80 && percentage<=90) {
			System.out.println("And the Grade obtained is A Grade");
		}
		else if ( percentage>70 && percentage<= 80) {
			System.out.println("And the Grade obtained is B+ Grade");
		}
		else if (percentage>60 && percentage<= 70) {
			System.out.println("And the Grade obtained is B Grade ");
		}
		else if ( percentage>50 && percentage<=60) {
			System.out.println("And the Grade obtained is C+ Grade");
		}
		else if (percentage>40 && percentage<=50) {
			System.out.println("And the Grade obtained is C Grade");
		}
		else if (percentage>=35 && percentage<=40) {
			System.out.println("And the Grade obtained is D+ Grade");
		}
		else  {
			System.out.println("And the Grade obtained is E Grade");
		}
	}
}

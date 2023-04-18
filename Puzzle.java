import java.util.Scanner;

public class Puzzle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Guessing Game!");
	    int myNum=(int)(Math.random()*100);
	    int n=0;
		do {
	
		System.out.print("Guess the number:-");
		 n=sc.nextInt();
		
		 
		if(n>myNum) {
			System.out.println("Your number is too large");
		}
		else if(n<myNum) {
			System.out.println("Your number is too small");
		}else if(n==myNum) {
			System.out.println("Hurrayy CORRECT ANSWER!!!");
			break;
		}
		}while(n>= 0);
		System.out.println("My number was:"+myNum);
		
		
	}
 
}
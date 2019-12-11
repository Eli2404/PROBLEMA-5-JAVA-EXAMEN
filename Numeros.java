package Problema3;
import java.util.Scanner;
public class Numeros {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, a=21, b=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite un numero");
		num1 = sc.nextInt();	
		
		System.out.println("Digite un numero");
		num2 = sc.nextInt();	
	
		if(num1>a || num2>a) {
			System.out.println(b);
		}
		
		if(num1<=a || num1>num2) {
			System.out.print("El numero que mas se acerca es: "+num1);
		}
		else {
				System.out.println("El numero que mas se acerca es: "+num2);
			}	
	}
}

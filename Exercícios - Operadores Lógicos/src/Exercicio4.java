import java.util.Scanner;
public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int a,b,c,r,s;
		double r1,s1,d;
		
		Scanner le = new Scanner (System.in);
		
		System.out.println("Digite o valor de A: ");
		a = le.nextInt();
		System.out.println("Digite o valor de B: ");
		b = le.nextInt();
		System.out.println("Digite o valor de C: ");
		c = le.nextInt();
		
		r = a+b;
		r1 = Math.pow(r,2);
		s = b+c;
		s1 = Math.pow(s,2);
		d = (s1 + r1)/2;
		
		System.out.println("O seu resultado é: " + d);
		
		le.close();		
	}
	
}

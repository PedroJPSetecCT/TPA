import java.util.Scanner;
public class Multiplo10 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int n,resto;
		System.out.println("digite um n�mero inteiro");
		n=ler.nextInt();
		resto=n%10;
		if(resto==0) {
			System.out.println("o n�mero � multiplo de 10");
		}
		else {
			System.out.println("o n�mero n�o � multiplo de 10");
		}
		ler.close();
	}
}

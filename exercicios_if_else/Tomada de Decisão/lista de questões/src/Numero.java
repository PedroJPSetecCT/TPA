import java.util.Scanner;
public class Numero {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	int n,resto;
	System.out.println("digite o n�mero inteiro");
	n=ler.nextInt();
	resto=n%2;
	if(resto==0) {
		System.out.println("seu n�mero � par");
	}
	else {
		System.out.println("seu n�emro � impar");
	}
	ler.close();
	}
	
}

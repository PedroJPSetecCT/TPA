import java.util.Scanner;
public class Algoritmo5 {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	double a,b,c;
	System.out.println("Digite o primeiro Valor");
	a=ler.nextDouble();
	System.out.println("Digite o segundo Valor");
	b=ler.nextDouble();
	System.out.println("Digite o terceiro Valor");
	c=ler.nextDouble();
	
	if (a>b+c && b>a+c && c>a+b) {
		System.out.println("Eses n�meros n�o formam um tri�ngulo");
	}else if (a==b && b==c){
		System.out.println("Esses valores formam um tri�ngulo Equil�tero");
	}else if (a!=b && b!=c && c!=a){
		System.out.println("Esses valores formam um tri�ngulo Escaleno");
	}else if (a==b && b!=c || a==c && c!=b || c==b && b!=a) {
		System.out.println("Esses valores formam um tri�ngulo is�sceles");
	}
	
	ler.close();
	}
}

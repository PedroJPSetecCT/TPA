import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
	int nasc,resto;
	Scanner ler=new Scanner(System.in);
	System.out.println("digite o ano de seu nascimento");
	nasc=ler.nextInt();
	resto=nasc%4;
	if(resto==0) {
		System.out.println("Voc� nasceu num ano bissexto");
	}
	else {
		System.out.println("Voc� n�o nasceu num ano bissexto");
	}
	ler.close();
	}
}

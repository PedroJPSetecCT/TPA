import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
	Scanner ler=new Scanner(System.in);
	
	int eleicao,nascimento,idade;
	System.out.println("Digite o ano da proxima elei��o:");
	eleicao=ler.nextInt();
	System.out.println("Digite seu ano de nascimento:");
	nascimento=ler.nextInt();
	idade = eleicao-nascimento;
	
	if(idade<16) {
	System.out.println("Voc� n�o poder� votar nessa elei��o");
	}
	else {
		System.out.println("Voc� poder� votar nessa elei��o");
	}
	ler.close();
}
}

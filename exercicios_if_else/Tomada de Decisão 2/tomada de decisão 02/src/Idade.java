import java.util.*;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nasc,anoAtual,idade;
		System.out.println("Digite o ano do seu nascimento");
		nasc=ler.nextInt();
		System.out.println("Digite o ano atual");
		anoAtual=ler.nextInt();
		idade=anoAtual-nasc;
		if(idade<10) {
			System.out.println("Voc� � uma crian�a, pois tem "+idade+" anos de idade");
		}else if(idade<18){
			System.out.println("Voc� � um/a adolescente, pois tem "+idade+" anos de idade");
		}else if(idade<60) {
			System.out.println("Voc� � um/a adulto/a, pois tem "+idade+" anos de idade");
		}else {
			System.out.println("Voc� � um/a idoso/a, pois tem "+idade+" anos de idade");
		}
		ler.close();
	}
}

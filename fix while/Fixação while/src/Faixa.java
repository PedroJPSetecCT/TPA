import java.util.*;
public class Faixa {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int id=0, i=1,maior=0,menor=0; 
		double porc=1, porc1, porc2, porc3, porc4, porc5,  id15=0,id30=0, id45=0, id60=0, id61=0;
		
		while (i<16) {
			System.out.println("digite a idade da pessoa numero "+i);
			id=ler.nextInt();
			if (id<=15) {
				id15=id15+1;
			} else if(id<=30) {
				id30=id30+1;
			} else if(id<=45) {
				id45=id45+1;
			} else if (id<=60) {
				id60=id60+1;
			} else {
				id61=id61+1;
			}
			if(menor==0) {
				menor = id;
			}
			if(id>maior) {
				maior = id;
			}
			if(id<menor) {
				menor = id;
			}
			i++;
		} 
		porc1=(100/15)*id15;
		porc2=(100/15)*id30;
		porc3=(100/15)*id45;
		porc4=(100/15)*id60;
		porc5=(100/15)*id61;
		
		System.out.println("1�Faixa Et�ria "+id15+" pessoas, 2�Faixa Et�ria "+id30+" pessoas, 3�Faixa Et�ria "+id45+" pessoas, 4�Faixa Et�ria "+id60+" pessoas, 5�Faixa Et�ria "+id61+"pessoas");
		
		System.out.println("1�Faixa Et�ria "+porc1+"%, 2�Faixa Et�ria "+porc2+"%, 3�Faixa Et�ria "+porc3+"%, 4�Faixa Et�ria "+porc4+"%, 5�Faixa Et�ria "+porc5+"%");
		
		System.out.println("O mais velho possui "+maior+" anos e o mais novo possui "+menor+" anos");

		ler.close();
	}
}

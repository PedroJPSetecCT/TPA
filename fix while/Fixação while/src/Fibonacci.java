import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        int i=1,seq1=1,seq2=1,seq3,n;
        
        System.out.println("digite at� que termo voc� deseja ver a sequencia de fibonacci");
        n =ler.nextInt();
        while(i<=n){
            while(i<3){
                System.out.println("o termo numero "+i+" � 1");
                i++;
            }
            seq3 = seq2+seq1;
            System.out.println("o termo numero "+i+" � "+seq3);
            seq2 = seq1;
            seq1 = seq3;
            i++;
         }
    ler.close();
    }
}


import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class vetorXV {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        
        int a[] = new int[10];
        
        
        for (int i = 0; i < 10; i++) {
            a[i] = ler.nextInt();
        } 
        //usado para mostrar sequencia vetores com "[]"
        System.out.println(Arrays.toString(a));
        // Aqui ele vai clonar os valores do vetor A
        int b[]= a.clone();
        //Aqui com est� fun��o o vetor B ficar� em ordem crescente
        Arrays.sort(b);
            
            System.out.println(Arrays.toString(b));
        //Aqui clonamos B para o C em ordem crescente
        int c[]= b.clone();
        
        /* Aqui o c que vale j inicia em zero e b em 9, ent�o o c at� que o incremento chegue a zero ele recebe a
         posic�o da ultima at� a primeira posi��o de b que seria �ndice 0, 
         para isso j++ e i-- porque assim c vai mudando de posi��o crescentemente 
         j� b decrescente e c vai recebendo da �ltima at� a primeira posi��o de b*/
        
        for(int i=9, j=0; i >=0;i--, j++){
            c[j] = b[i];
        }
        
        
        //Imprime vetor c
        System.out.println(Arrays.toString(c));
        
        
        
        
    }
}

import java.util.Scanner;
public class XII {
    public static void main(String[]args){
         int a[] = new int[10];
        
        Scanner scanner = new Scanner(System.in);
        
        // Ler os elementos do vetor 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i+1) + ": ");
            a[i] = scanner.nextInt();
        }
        
        // Verificar se o vetor é um palindromo
        boolean palindromo = true;
        int i = 0;
        int j = 9;
        
        /*contangem crescente e decrescente caso os números do 
        incremento e decremento não for igual um ao outro não é palíndromo */
        while (i < j) {
            if (a[i] != a[j]) {
                palindromo = false;
                break;
            }
            
            i++;
            j--;
        }
        
        // Imprimir o resultado da verificaÃ§Ã£o
        if (palindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }
        
        
    }
}
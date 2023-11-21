
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
        
        // Verificar se o vetor � um palindromo
        boolean palindromo = true;
        int i = 0;
        int j = 9;
        
        /*contangem crescente e decrescente caso os n�meros do 
        incremento e decremento n�o for igual um ao outro n�o � pal�ndromo */
        while (i < j) {
            if (a[i] != a[j]) {
                palindromo = false;
                break;
            }
            
            i++;
            j--;
        }
        
        // Imprimir o resultado da verificação
        if (palindromo) {
            System.out.println("O vetor � um pal�ndromo.");
        } else {
            System.out.println("O vetor n�o � um pal�ndromo.");
        }
        
        
    }
}
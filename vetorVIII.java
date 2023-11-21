
import java.util.Scanner;
public class vetorVIII {
    public static void main(String[]args){
    Scanner ler = new Scanner(System.in);
    int a[] = new int[10];
    int b[] = new int[10];
    int i;
    
    System.out.println("Digite valores");
    
    for(i = 0; i < a.length; i++){
        
        a[i] = ler.nextInt();
    }
        b[9] = a[9];
        
        for(i = 8; i >= 0; i--){
            
            b[i] = b[i + 1] + a[i];
        }
        
        System.out.println("Vetor B");
        
        for(i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        
    }
}
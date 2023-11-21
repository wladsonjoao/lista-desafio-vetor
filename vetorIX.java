
import java.util.Random;
import java.util.Arrays;

public class vetorIX {
    public static void main(String[]args){
        int TAM = 10;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int i;
        int c[] = new int[TAM];
        int ic = 0;
        int xa;
        int xb;
        int j = 0;
        
        // Método classe usada para gerar números Aleatorios
        Random random = new Random();
            
            //Preenchimento dos Vetores
            
            for(i = 0; i < TAM; i++){
                
                a[i] = random.nextInt(11);
                b[i] = random.nextInt(11);
            }
        /*Imprime os Vetores e toSting serve para colocar os 
        blocos nos números */
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
        for(i = 0; i< TAM; i++){
            xa = a[i];
            
            
            while(j<TAM){
                
                xb = b[j];
            if(xa==xb){
                
                c[ic] = xb;
            
            ic++;
                break;
            }
                j++;
                
            }
        }
        /* Método classe para criar uma cópia de um array 
        com um determinado tamanho */
        c = Arrays.copyOf(c, ic);
        System.out.println(Arrays.toString(c));
        
    }
    
}
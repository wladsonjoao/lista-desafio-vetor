
import java.util.Random;
import java.util.Arrays;
public class vetorX {
    public static void main(String[]args){
        int TAM = 10;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int i,j,xa,xb;
        
        
        int c[] = new int[TAM];
        boolean siiiu;
        
        //Método para gerar números aleatórios
        Random random = new Random();
            
            //Preenchimento dos Vetores
            
            for(i = 0; i < TAM; i++){
                
                a[i] = random.nextInt(11);
                b[i] = random.nextInt(11);
            }
        //Imprime os Vetores A e B
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
        siiiu = false;
        for(i = 0; i<TAM; i++){
            xa = a[i];
            
        
        
        for(j = 0; j<TAM; j++){
            if(xa == b[j]){
                siiiu = true;
                
                
            }
        
            if(!siiiu){
                c[i] = xa;
            }
        }
        
        }
        System.out.println(Arrays.toString(c));
    }
}

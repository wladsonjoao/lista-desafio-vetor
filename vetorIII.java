
import java.util.Scanner;
public class vetorIII {
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        int j=2;
        boolean primo = true;
        
        System.out.println("Vetor A");
        
        
        for(i = 0; i<a.length; i++){
            
            while(j<a.length){
              //Teste condicional 
            if(a[i] % j==0 ){
              // Variavel primo recebe falso
                primo = false;
                break;
                
            }
                j++;
            }
            
            System.out.print(a[i]);
            
            if(primo && a[i]>1){
                System.out.println("primo");
            }else{
                System.out.println("não primo");
            }
        }
    }
}
        
    
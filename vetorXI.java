
import java.util.Scanner;
public class vetorXI {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int i;
        
        //Ler Elemento vetor A
        for(i = 0; i<10; i++){
            System.out.println("Digite o elemento"+(i+1)+":");
            a[i] = ler.nextInt();
        }
        
        System.out.println("Digite o elemento que deseja buscar:");
        int ebuscado = ler.nextInt();
        
        //Pesquisar o Elemento no vetor A
        
        boolean encontrado = false;
        for(i = 0; i < 10; i++){
            if(a[i]==ebuscado){
                encontrado = true;
                break;
            }
        }
            
            // imprimir elemento
            if(encontrado=true){
                System.out.println("O elemento selecionado foi encontrado : " + ebuscado);
                
            }else{
                System.out.println("Elemento não encontrado");
            }
        
            
        
        
        
        
        
        
        
        
        
    }
}
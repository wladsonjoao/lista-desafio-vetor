
import java.util.Scanner;
public class vetorI{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int par = 0;
        int impar = 0;
        int i;
        
        System.out.println("Digite o n�mero do vetor");
        
        //Aqui vai entrar os dados at� i tamanho do vetor A
        for(i = 0; i<a.length; i++){
            
            a[i] = ler.nextInt();
        }
        
        
        for(i = 0; i<a.length; i++){
          //Aqui ser� teste condicional para saber quais n�meros vetor B recebe
            if(a[i] % 2 == 0){
              //Aqui o indice posi��o que est� como par recebe o n�mero par se teste der como verdadeiro
                b[par] = a[i];
                par++;
            }else{
              //Aqui o indice posi��o que est� como impar recebe o n�mero impar se teste de par der como falso
                b[b.length-1-impar] = a[i];
                impar++;
            }
            
        }
        
        System.out.println("Vetor B com elementos pares e impares");
        //Imprime Vetor B
        for(i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
        
    }
}
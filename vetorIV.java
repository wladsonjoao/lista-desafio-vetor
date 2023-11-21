

public class vetorIV {
    
    public static void main(String[] args) {
        int a[] = new int[] {1, 4, 7, 3, 9, 2, 5, 6, 8, 0};
        int i,j;
        
        //Imprime vetor
        for(i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        //j até o último índice de a será feito um teste condicional
        for(j = 0; j < a.length; j++){
          //Se teste der como verdadeiro, imprimirá na tela os números pares
            if(j % 2 == 0 ){
                System.out.println(j + "é par");
            }
            
        }

    }
    
}
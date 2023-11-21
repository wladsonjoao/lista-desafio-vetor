

public class vetorV {
    
    public static void main(String[] args) {
        int a[] = new int[] {1, 4, 7, 3, 9, 2, 5, 6, 8, 0};
        int i;
        
        //Armazenar valores do vetor na variavel elementos
        for(i = 0; i < a.length; i++){
          int elemento = a[i];
            System.out.println("Elemento" + elemento + ":");
            System.out.print("Divisores:");
        
            
       int j = 1;
       //Encontrar e imprimir os divisores de elemento
       while(j<=elemento){
        
          //Se teste condicional der verdadeiro no caso resto divisão igual a zero  
            if(elemento % j==0){
              //Imprime divisor
                System.out.println(j + " ");
            }
            j++;
            }
        }

    }
    
}
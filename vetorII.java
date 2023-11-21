

public class vetorII {
 public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10}; // Vetor A com 5 elementos
         int elemento,resultado;
        
        for (int i = 0; i < a.length; i++) {
          //Aqui elemento recebe os índices de a até o últio índice
          elemento = a[i];
          //Imprime elemento
            System.out.println("Tabuada do elemento " + elemento + ":");
            
            //Criação do multiplicador
            int m=1;
            
            /*Enquanto multiplicador menor ou igual que 10, resultado 
              recebe a conta de(elemento *  m ) e m a cada teste ganha mais 1 de valor até chegar no 10 */
            while(m<=10){
              //Calculo
            int r = elemento * m;
            
            //Imprime o elemento + o multiplicador e o resultado da multiplicação
            System.out.println( elemento + "x" + m + "=" + r);
            m++;
            }
        }

            // Pular uma linha para separar as tabuadas
            System.out.println();
    }
}
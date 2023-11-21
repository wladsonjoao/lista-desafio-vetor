

public class vetorVI {
    
    public static void main(String[] args) {
        int a[] = new int[11];
        int i;
        
        for(i = 0; i < a.length; i++){
            /* aqui é uma função para calcular a potencia, 
            dentro do parenteses vai a base e o expoente */
            a[i] = (int)Math.pow(2,i);
            
            System.out.println(a[i]);
        }
    }
    
}
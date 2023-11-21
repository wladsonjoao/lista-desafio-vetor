

public class vetorXIII {
    public static void main(String[]args){
        int a[] = {3, 8, 2, 7, 5, 6, 1, 4, 9, 0};
        int b[] = new int[10];
        
        // Preencher o vetor B de acordo com as regras
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }
        
        // Imprimir os vetores A e B
        System.out.println("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nVetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
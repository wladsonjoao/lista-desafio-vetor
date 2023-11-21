

public class vetorXIV {
    public static void main(String[]args){
        int a[] = {2, 8, 5, 7, 3, 6, 9, 4, 1, 0};
        int b[]= {5, 3, 8, 2, 7, 1, 0, 9, 6, 4};
        int c[]= new int[10];
        
        // Preencher o vetor C de acordo com as regras
        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }
        
        // Imprimir os vetores A, B e C
        System.out.println("Vetor A: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nVetor B: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nVetor C: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
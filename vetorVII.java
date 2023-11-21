

public class vetorVII {
    
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int b[] = new int[15];
        int f = 1;
        int n;
        
        
        for(int i = 0; i < a.length; i++){
            f *= 1;
            n = a[i];
            
            while(n > 1){
                f *= n;
                n--;
                
            }
            
            b[i] = f;
            
            System.out.println(b[i]);
            
        }
    }
    
}
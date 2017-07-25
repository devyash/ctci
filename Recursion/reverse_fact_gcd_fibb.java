
package recursion;
/**
 *
 * @author rushabhpatel
 */
public class reverse_fact_gcd_fibb {

   public static void main(String[] args) {      
        System.out.println(fact(5)); 
        int[] arr = {20, 10, 30, 40, 50};
        reverse1(arr);
        System.out.println(gcd(54,24));
        System.out.println("Fibonacci Series");
        for (int i = 0; i < 9; i++) {
            System.out.println(fibb(i));
       }
    }
    static int fact(int n){
        if(n == 1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    static void reverse1(int[] n){
        if(n.length == 0){
            return;     
        }
        int[ ] b = new int[n.length-1];
        for (int i = 0; i < n.length-1; i++) {
             b[i] = n[i+1];
        }
        reverse1(b);
        System.out.println(n[0] + " ");
    }
    static int gcd(int x, int y){
        int tmp = x;
        if(x<y){
            x = y;
            y = tmp;
        }
        if(y==0)
            return x;
        return gcd(y, (x%y));
    }

    static int fibb(int n){
        if(n <= 1){
            return n;
        }
        else{
            return (fibb(n-1) + fibb(n-2));
        }
    }
}

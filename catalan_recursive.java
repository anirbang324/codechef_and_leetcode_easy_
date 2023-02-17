// link : https://www.geeksforgeeks.org/program-nth-catalan-number/

public class catalan_recursive{

// recursive function to find nth catalan
    static int catalan(int n){
        int res = 0;
        if(n<=1){
            return 1;
        }
        for(int i=0;i<n;i++){
            res+= catalan(i)*catalan(n-i-1);
        }
        return res;
    }

    public static void main(String[] args) {
        
        for(int i=0;i<10;i++){
            System.out.println(catalan(i)+" ");
        }
    }
}
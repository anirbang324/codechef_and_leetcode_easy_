// question : https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

public class subset_of_array_iterative {
    public static boolean isboolean(int arr1[], int arr2[], int m, int n){

        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(arr2[i] == arr1[j])
                break;

            if(j==m)
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        int m = arr1.length;
        int n = arr2.length;
        if(isboolean(arr1,arr2,m,n)){
            System.out.println("array 2 is subset of array1");
        }
        else{
            System.out.println("array 2 is not a subset of array1");
        }
    }
}

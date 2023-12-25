
//https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty=Medium&sortBy=submissions
static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
            int end = 0;
            int sum = 0;
            ArrayList<Integer> al = new ArrayList<>();
            int i = 0;
            
            while(end<n){
                sum += arr[end];
                
                while(sum > s && i <= end){
                    sum -= arr[i];
                    i++;
                }
                if(sum == s && i <= end){
                    al.add(i+1);
                    al.add(end+1);
                    return al;
                }
                end++;
            }
            al.add(-1);
            return al;
        }
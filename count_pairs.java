// problem link: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class count_pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] nums = {1,2,2,1};
		int k=1;
		System.out.print(countKDifference(nums,k));
 
	}
	public static int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]+k)) res+=hm.get(nums[i]+k);
            if(hm.containsKey(nums[i]-k)) res+=hm.get(nums[i]-k);
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        return res;
    }
}
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] a, int n, int s) 
    {
         ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0; i<n ; i++){
        //         int sum=0;
        //         int pos1=i;
        //         int pos2=0;
        //     for(int j=i; j<n; j++){
        //         sum+=a[j];
        //         if(sum==s){
        //             pos2=j;
        //             arr.add((pos1+1));
        //             arr.add((pos2+1));
        //             return arr;
        //         }
        //     }
        // }
        int pos1=0,pos2=0;
        int sum=a[0];
        if(s==0){
        ans.add(-1);
        return ans ;
        }
        if(sum==s){
            ans.add(1);
            ans.add(1);
            return ans;
        }
        
        while(pos2<n-1){
            //if we can able to add next element to sum then     
            if(sum + a[pos2+1] <= s){
                sum += a[pos2+1];
                pos2++;
            }
            //if can't then this
            else{
                sum-=a[pos1];
                pos1++;
            }
            if(sum==s){
                ans.add(pos1+1);
                ans.add(pos2+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans ;
    }
}

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends


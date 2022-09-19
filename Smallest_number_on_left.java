//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
       List<Integer> ans = new ArrayList<>();
       Stack<Integer> s = new Stack<>();
       //for(int i=a.length-1; i>=0; i++) for next greatest or smallest element
       for(int i=0; i<a.length; i++){
          //check if stack is empty or not and its top element is greater than or equal to a[i]
         //if true then pop that element
                                  //s.peek()<=a[i] for previous greate element
           while(!s.isEmpty() && s.peek()>=a[i]){
               s.pop();
           }
         //if not any element is found 
           if(s.isEmpty()){
               ans.add(-1);
           }
         //if above all conditions are false then by default top element is smallest
           else{
               ans.add(s.peek());
           }
         
           s.push(a[i]);
       }
       return ans;     
        }
    }



class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




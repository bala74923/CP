package Codeforces_Global_Round_22;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();sc.nextLine();
        while(test-->0){
            // return solution method
           evenNumberAddicts();
        }
    }
    static void prefixSum(){
        int total = sc.nextInt(),k = sc.nextInt(),done = k-1;
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int last = Integer.MAX_VALUE;
        for(int i=k-1;i>0;i--){
            int curr = arr[i]-arr[i-1];
            if(last<curr){
                System.out.println("No");return ;
            }
            last= curr;
        }
        long possible = (total-done)*(long)last;//last
        System.out.println(arr[0]<=possible?"Yes":"No");
    }
    static void glory(){
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        // 0 -> index, 1-> element
        int zeros =  0,ones = 0;
        for(int i=0;i<n;i++) {
            arr[i][0] = sc.nextInt();
            if(arr[i][0]==1) ones++;
            else zeros++;
        }
        for(int j=0;j<n;j++) arr[j][1]= sc.nextInt();

        int min= Math.min(zeros,ones);
        Arrays.sort(arr,(a,b)->{
            if(a[0]!=b[0]) return a[0]-b[0];
            return b[1]-a[1];
        });
        //System.out.println(Arrays.deepToString(arr));
        int zeroIndex = 0,oneIndex = zeros;
        int start = Integer.MAX_VALUE;
        long sum = 0;
        while(zeroIndex<min){
            start = Math.min(start,
                    Math.min(arr[oneIndex][1],arr[zeroIndex][1]));
            sum+= arr[zeroIndex++][1]*2;
            sum+= arr[oneIndex++][1]*2;
        }
        while(zeroIndex<zeros)
            sum+= arr[zeroIndex++][1];
        while(oneIndex<n)
            sum+= arr[oneIndex++][1];
        if(ones==zeros) sum-= start;
        System.out.println(sum);
    }
    static void evenNumberAddicts(){// should be upsolved
        int n = sc.nextInt();
        int oddCount=0;
        while(n-->0){
            oddCount+=(sc.nextInt()&1);
        }
        long val = (long)Math.ceil(oddCount/2.0);
        //System.out.println(val);
        System.out.println(val%2==0?"Alice":"Bob");
    }
}


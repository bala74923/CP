package div3_828;

import java.util.Scanner;

public class Even_ODD_Increments {
    static Scanner sc;
    static int mod = (int)1e9+7;
    static String yes= "YES";
    static String no = "NO";
    static int int_max = Integer.MAX_VALUE, int_min = Integer.MIN_VALUE;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();sc.nextLine();
        for(int i=1;i<=test;i++)
            solution(i);
    }
    static void solution(int caseNo){
        int N = sc.nextInt(), Q = sc.nextInt();sc.nextLine();
        int[] arr = getIntegerArray(N);
        long oddCount = 0, evenCount = 0, odd = 0, even = 0;
        for(int n: arr){
            if(n%2==1){
                oddCount++;
                odd+=n;
            }else{
                evenCount++;
                even+=n;
            }
        }
       for(int q=0;q<Q;q++){
            //System.out.printf("oddsum = %d oddcount=%d evensum=%d evencount=%d\n",odd,oddCount,even,evenCount);
            int type= sc.nextInt(), add = sc.nextInt();
           //System.out.println(" test case input taken"+q);
            if(type==0){ //even
                even+= (evenCount*add);
                long res = even+ odd;
                System.out.println(res);
                if(isOdd(add)){ // even + odd = odd
                    odd+= even;
                    oddCount+=evenCount;
                    even =0;
                    evenCount =0;
                }
            }else{ // odd
                odd+= oddCount*add;
                long res = odd + even;
                System.out.println(res);
                if(isOdd(add)){
                    even+= odd;
                    evenCount+=oddCount;
                    odd =0;
                    oddCount =0;
                }
            }
           //System.out.printf("last oddsum = %d oddcount=%d evensum=%d evencount=%d\n",odd,oddCount,even,evenCount);
          // System.out.println("done index="+q);
        }
    }

    static int[] getIntegerArray(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static char[] getCharacterArray(int n){
        String s = sc.next();
        return s.toCharArray();
    }
    static boolean isOdd(long n){
        return (n&1)==1;
    }
    static boolean isEven(long n){
        return (n&1)==0;
    }
}

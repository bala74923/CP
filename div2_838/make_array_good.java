package div2_838;

import java.util.*;

public class make_array_good {
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
        int N = sc.nextInt();
        int[] arr= getIntegerArray(N);
        int min= 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<N;i++) {
            if(arr[min]>arr[i])
                min = i;
            pq.add(new int[]{arr[i],i});
        }

        int[] sub = new int[N];
        sub[min] = pq.poll()[0];
        int index =0,value = sub[min];
        while(!pq.isEmpty()){

            int[] front = pq.poll();
            int curr =value;
            int time = front[0]/curr;
            if(front[0]%curr!=0) time++;
//            while(front[0]>curr) {
//                curr += value;
//                //System.out.println("in statement");
//            }
            curr*=time;
            sub[front[1]] = curr;
            value = curr;
        }
        //System.out.println("case"+caseNo+"=>"+ Arrays.toString(sub));

        List<int[]> list  = new ArrayList<>();
        for(int i=0;i<N;i++){
            int diff = sub[i]-arr[i];
            if(diff!=0)
                list.add(new int[]{i+1,diff});
        }
        System.out.println(list.size());
        for(int[] li: list)
            System.out.println(li[0]+" "+li[1]);
        //google kickstart -> System.out.printf("Case #%d: ",caseNo);
    }
    static int upperBound(int[] arr ,int target){
        int lo = 0,hi = arr.length-1;
        int res = -1;
        while(lo<=hi){
            int mid = lo+((hi-lo)/2);
            if(arr[mid]<target){
                lo = mid+1;
            }else {
                res = mid;
                hi = mid-1;
            }
        }
        return res;
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
    static boolean isOdd(int n){
        return (n&1)==1;
    }
    static boolean isEven(int n){
        return (n&1)==0;
    }
    static long fact(int n){
        return n*fact(n-1);
    }
    static long gcd(long a,long b){ // a is big
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
}
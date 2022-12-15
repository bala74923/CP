package div3_828;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Number_Replacements {
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
        //System.out.printf("Case #%d: ",caseNo);
        int N = sc.nextInt();
        int[] arr = getIntegerArray(N);
        char[] alpha = getCharacterArray(N);

        Map<Integer,Character> map = new HashMap<>();

        boolean flag = true;
        for(int i=0;i<N && flag;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],alpha[i]);
            }else{
                if(map.get(arr[i])!=alpha[i]) {
                    //System.out.printf("val = %d arr[i] =%c stored = %c\n",i,alpha[i],map.get(arr[i]));
                    flag = false;
                }
            }
        }
        System.out.println(flag?yes:no);
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

}

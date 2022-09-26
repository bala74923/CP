package div2_823;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        sc = new Scanner(System.in);
        int test = sc.nextInt();sc.nextLine();
        while(test-->0){
            minNotation();
        }
    }
    static void minNotation(){ //upsolved
        char[] s = sc.next().toCharArray();
        Stack<Integer> st = new Stack<>();
        int[] count = new int[10];
        for(char c: s){
            int curr = c-'0';
            while(!st.isEmpty() && st.peek()>curr){
                count[Math.min(st.pop()+1,9)]++;
            }
            st.push(curr);
        }
        while(!st.isEmpty()){
            count[st.pop()]++;
        }
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<=9;i++){
            while(count[i]!=0){
                sb.append(i);
                count[i]--;
            }
        }
        System.out.println(sb);
    }
    static void planet(){
        int n = sc.nextInt(),c = sc.nextInt();
        int[] map = new int[101];
        while(n-->0) map[sc.nextInt()]++;
        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+= Math.min(map[i],c);
        }
        System.out.println(sum);
    }
}


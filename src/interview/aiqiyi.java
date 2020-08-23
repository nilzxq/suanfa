package interview;


import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-08-23 15:22
 */
public class aiqiyi {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int count=0;
//        int temp;
//        for(int i=1;i<=n;i++){
//            temp=i;
//            while(temp%5==0){
//                count++;
//                temp/=5;
//            }
//        }
//        System.out.println(count);
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //boolean b=road(str);
        boolean b=helper4(str);
        String s=b==true?"True":"False";
        System.out.println(s);
    }

    public static boolean road(String r){
        HashSet<String> set = new HashSet<>();
        //横纵坐标
        int x=0,y=0;
        set.add(x+" "+y);
        //东西南北 N S y E W x
        char[] arr=r.toCharArray();
        for(char c:arr){
            switch (c){
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x++;
                    break;
                case 'E':
                    x--;
                    break;
            }
            if(set.contains(x+" "+y)){
                return true;
            }else{
                set.add(x+" "+y);
            }

        }
        return false;
    }


    public static boolean helper3(String k){
        char[] arr=k.toCharArray();
        if(k==null){
            return true;
        }
        HashSet<Character> set = new HashSet<>();
        for(char c:arr){
            if(c=='('||c=='{'||c=='['){
                set.add(c);
            }else if(c==')'){
                if(set.contains('(')){
                    set.remove('(');
                }else{
                    return false;
                }
            }else if(c=='}'){
                if(set.contains('{')){
                    set.remove('{');

                }else{
                    return false;
                }
            }else if(c==']'){
                if(set.contains('[')){
                    set.remove('[');
                }else{
                    return false;
                }
            }

        }
        if(set.isEmpty()){
            return true;
        }
       return false;
    }

    public static boolean helper4(String k){
        //栈
        char[] arr=k.toCharArray();
        if(k==null){
            return true;
        }
        Stack<Character> res = new Stack<>();
        for(char c:arr){
            if(c=='('||c=='{'||c=='['){
                res.add(c);
            }else if(c==')') {
                if (res.peek() != '(') {
                    return false;
                }else if(res.peek()=='('){
                    res.pop();
                }
            }else if(c=='}') {
                if (res.peek() != '{') {
                    return false;
                }else if(res.peek()=='{'){
                    res.pop();
                }
            }else if(c==']') {
                if (res.peek() != '[') {
                    return false;
                }else if(res.peek()=='['){
                    res.pop();
                }
            }
        }
        if(res.isEmpty()){
            return true;
        }
        return false;
    }
}

package interview.xiaomi;


import java.util.Scanner;
import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-09-15 19:40
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            System.out.println(helper(str));
            }
        }


    public static boolean helper(String str){
        char[] arr=str.toCharArray();
        if(str.equals("")||str.isEmpty()){
            return true;
        }
        Stack<Character> res=new Stack();
        for(char c:arr){
            if (c == '(' || c == '{' || c =='[') {
                res.add(c);
            }else if(c==')'){
                if(res.peek()!='('){
                    return false;
                }else if(res.peek()=='('){
                    res.pop();
                }
            }else if(c=='}'){
                if (res.peek() !='{') {
                    return false;
                }else if(res.peek()=='{'){
                    res.pop();
                }
            }else if(c==']'){
                if(res.peek()!='['){
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

    public boolean helper1(String str){
        if(str.equals("")){
            return true;
        }
        Stack<Character> res=new Stack();
        char[] arr=str.toCharArray();
        for(char c:arr){
            if(res.size()==0){
                res.push(c);
            }else if(helper2(res.peek(),c)){
                res.pop();
            }else{
                res.push(c);
            }
        }
        return res.size()==0;
    }

    public boolean helper2(char c1,char c2){
        return (c1=='('&&c2==')')||(c1=='{'&&c2=='}')||(c1=='['&&c2==']');
    }
}

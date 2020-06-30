package leetcode.stack;

import java.text.BreakIterator;

/**
 * 栈实例括号匹配
 * @Author nilzxq
 * @Date 2020-06-30 10:18
 */
public class BracketChecker {
    private String input;
    //构造器
    public BracketChecker(String in){
        input=in;
    }
    public void check(){
        int stackSize=input.length();
        StackX theStack=new StackX(stackSize);
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!theStack.isEmpty()){
                        char chx=theStack.pop();
                        if((ch=='}'&&chx!='{')||
                                (ch==']'&&chx!='[')
                                ||(ch==')'&&chx!='(')){
                            System.out.println("Error: "+ch+" at "+i);
                        }
                    }else{
                        System.out.println("Error: "+ch+" at "+i);
                        break;
                    }
                default:
                    break;
            }
        }
        if(!theStack.isEmpty()){
            System.out.println("Error:missing right delimiter");
        }
    }
}

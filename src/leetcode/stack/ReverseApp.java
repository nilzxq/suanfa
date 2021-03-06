package leetcode.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author nilzxq
 * @Date 2020-06-30 9:42
 */
public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input,output;
        while(true){
            System.out.print("Enter a string:");
            System.out.flush();
            input=getString();
            //read a string from kbd
            if(input.equals("")){
                break;
            }
            Reverser theReverser=new Reverser(input);
            output=theReverser.doRev();
            System.out.println("Reversed: "+output);
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
}

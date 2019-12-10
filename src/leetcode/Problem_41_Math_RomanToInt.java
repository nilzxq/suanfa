package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** 
* @author nilzxq
* @version 2019年12月10日 下午9:03:19 
*类说明 
*/
public class Problem_41_Math_RomanToInt {

	public static int romanToInt(String str) {
		Map<Character,Integer> map=new HashMap<>();
		map.put('I',1);
		map.put ( 'V', 5);
        map.put ( 'X', 10);
        map.put ( 'L', 50);
        map.put ( 'C', 100);
        map.put ( 'D', 500);
        map.put ( 'M', 1000);
        int sum=0;
        for (int i=0;i<str.length ();i++){
            if ((i<str.length ()-1)&&map.get ( str.charAt ( i ))<map.get ( str.charAt ( i+1 ) ))      {
                   sum=sum-map.get (str.charAt(i));
            }else {
                  sum =sum+map.get ( str.charAt (i));
            }
 
        }
        return sum;

	}
	
	//hashmap换成switch 更快
	
	public static  int romanToInt2(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    
    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
	public static void main(String[] args) {
		while(true) {
		Scanner sc  = new Scanner ( System.in );
        String str = sc.next ();
        System.out.println(romanToInt(str));
		}
	}
}

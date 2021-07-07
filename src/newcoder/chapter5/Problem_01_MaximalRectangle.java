package newcoder.chapter5;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2021-07-07 10:50
 */
public class Problem_01_MaximalRectangle {
    public static int maxRecSize(int[][] map){
        if(map==null||map.length==0||map[0].length==0){
            return 0;
        }
        int maxArea=0;
        int[] height=new int[map[0].length];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){
                height[j]=map[i][j]==0?0:height[j]+1;
            }
            maxArea=Math.max(maxArea,maxRecFromBottom(height));
        }
        return maxArea;
    }

    //借助单调栈，求解每个位置能够扩展的最大矩阵
    //单调栈：每次弹出操作，需要结算栈顶元素
    public static int maxRecFromBottom(int[] height){
        if(height==null||height.length==0){
            return 0;
        }
        int maxArea=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<height.length;i++){
            //找到当前位置离它最近的小于它的值,且栈中存的是位置，不是具体的对应位置的值
            while(!stack.isEmpty()&&height[i]<=height[stack.peek()]){
                int j=stack.pop();
                int k=stack.isEmpty()?-1:stack.peek();
                int curArea=(i-k-1)*height[j];
                maxArea=Math.max(maxArea,curArea);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int j=stack.pop();
            int k=stack.isEmpty()?-1:stack.peek();
            int curArea=(height.length-k-1)*height[j];
            maxArea=Math.max(curArea,maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] map = { { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 0 }, };
        System.out.println(maxRecSize(map));
    }
}

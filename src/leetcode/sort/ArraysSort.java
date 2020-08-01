package leetcode.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author nilzxq
 * @Date 2020-08-01 9:03
 * Java学习中会遇到对数组进行升序或者降序排序的问题，
 * 其实Java语言提供给我们Array.sort(int [] arr)对数组进行升序排列，代码如下：
 */
public class ArraysSort {
    public static void main(String[] args) {
        /**
         * 1.Arrays.sort()
         */
        int[] a={9,8,7,2,3,4,1,0,6,5};
//        Arrays.sort(a);
//        for(int arr:a){
//            System.out.print(arr+" ");
//        }
        Integer[] a1={9,8,7,2,3,4,1,0,6,5};
        arraysSort1(a1);
        System.out.println();
        arraysSort2(a1);

    }

    /**
     * 2.利用Collections.reverseOrder()方法
     * @param arr
     */
    public static void arraysSort1(Integer[] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    /**
     * 3.实现comparator接口的复写compare()方法，代码如下
     */
    public static void arraysSort2(Integer[] arr){
        /**
         * 定义一个自定义类MyComparator的对象
         */
        Comparator cmp=new MyComparator();
        Arrays.sort(arr,cmp);
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            /*
            如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值。
            这样颠倒一下，就可以实现降序排序了，反之即可自定义升序排序了
             */
            return o2-o1;
        }
    }

}

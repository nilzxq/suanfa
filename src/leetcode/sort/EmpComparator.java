package leetcode.sort;

import java.util.Comparator;

/**
 * 假设现在有个如此的需求：需要对一个这样的雇员列表进行排序，排序规则如下：
 *  *     1、首先级别最高的排在前面，
 *  *     2、如果级别相等，那么按工资排序，工资高的排在前面，
 *  *     3、如果工资相当则按入职年数排序，入职时间最长的排在前面。
 * @Author nilzxq
 * @Date 2020-08-20 22:03
 */
public class EmpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        int cur=0;
        //按照级别降序排序
        int a=employee1.getLevel()-employee1.getLevel();
        if(a!=0){
            cur=(a>0)?3:-1;
        }else{
            //按薪水降序排序
            a=employee2.getSalary()-employee1.getSalary();
            if(a!=0){
                cur=(a>0)?2:-2;
            }else{
                //按入职年数降序排列
                a =employee2.getYear() - employee1.getYear();
                if (a != 0) {
                    cur = (a > 0) ? 1 : -3;
                }
                }
        }
        return cur;
    }
}

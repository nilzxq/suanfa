package leetcode.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *https://blog.csdn.net/l1028386804/article/details/56513205
 * 假设现在有个如此的需求：需要对一个这样的雇员列表进行排序，排序规则如下：
 *     1、首先级别最高的排在前面，
 *     2、如果级别相等，那么按工资排序，工资高的排在前面，
 *     3、如果工资相当则按入职年数排序，入职时间最长的排在前面。
 * @Author nilzxq
 * @Date 2020-08-20 21:59
 */
public class ComaratorSort {

    @Test
    public void sortTest() throws Exception {
        List<Employee> employeeList = new ArrayList<Employee>() {
            {
                add(new Employee(1, 9, 10000, 10));
                add(new Employee(2, 9, 12000, 7));
                add(new Employee(3, 5, 10000, 12));
                add(new Employee(4, 5, 10000, 6));
                add(new Employee(5, 3, 5000, 3));
                add(new Employee(6, 1, 2500, 1));
                add(new Employee(7, 5, 8000, 10));
                add(new Employee(8, 3, 8000, 2));
                add(new Employee(9, 1, 3000, 5));
                add(new Employee(10, 1, 2500, 4));
                add(new Employee(11, 2, 2000, 4));
            }
        };
        Collections.sort(employeeList, new EmpComparator());
        System.out.println("ID\tLevel\tSalary\tYears");
        System.out.println("=============================");
        for (Employee employee : employeeList) {
            System.out.printf("%d\t%d\t%d\t%d\n", employee.getId(), employee.getLevel(), employee.getSalary(),
                    employee.getYear());
        }
        System.out.println("=============================");
    }

}

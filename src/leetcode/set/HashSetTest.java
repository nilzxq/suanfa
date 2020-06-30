package leetcode.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-06-30 17:32
 */
public class HashSetTest {
    public static void main(String[] agrs){
        //创建HashSet集合：
        Set<String> hashSet = new HashSet<String>();
        System.out.println("HashSet初始容量大小："+hashSet.size());

        //元素添加：
        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("nilzxq");
        hashSet.add(",");
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("!");
        System.out.println("HashSet容量大小："+hashSet.size());

        //迭代器遍历：
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        //增强for循环
        for(String str:hashSet){
            if("nilzxq".equals(str)){
                System.out.println("你就是我想要的元素:"+str);
            }
            System.out.println(str);
        }

        //元素删除：
        hashSet.remove("nilzxq");
        System.out.println("HashSet元素大小：" + hashSet.size());
        hashSet.clear();
        System.out.println("HashSet元素大小：" + hashSet.size());

        //集合判断：
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet是否为空：" + isEmpty);
        boolean isContains = hashSet.contains("hello");
        System.out.println("HashSet是否为空：" + isContains);

        //hashCode() 和 equals()测试：
        hashCodeAndEquals();
    }

    public static void hashCodeAndEquals(){
        //第一个 Set集合：
        Set<String> set1 = new HashSet<String>();
        String str1 = new String("nilzxq");
        String str2 = new String("nilzxq");
        set1.add(str1);
        set1.add(str2);
        System.out.println("长度："+set1.size()+",内容为："+set1);

        //第二个 Set集合：
        Set<App> set2 = new HashSet<App>();
        App app1 = new App();
        app1.setName("nilzxq");

        App app2 = new App();
        app2.setName("nilzxq");

        set2.add(app1);
        set2.add(app2);
        System.out.println("长度："+set2.size()+",内容为："+set2);

        //第三个 Set集合：
        Set<App> set3 = new HashSet<App>();
        App app3 = new App();
        app3.setName("nilzxq");
        set3.add(app3);
        set3.add(app3);
        System.out.println("长度："+set3.size()+",内容为："+set3);
    }

}

package leetcode.set;

import java.util.TreeSet;

/**
 * @Author nilzxq
 * @Date 2020-06-30 17:40
 */
public class App{

    private String name;

    private Integer age;

    public App(){}

    public App(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args ){
        System.out.println( "Hello World!" );
    }
}


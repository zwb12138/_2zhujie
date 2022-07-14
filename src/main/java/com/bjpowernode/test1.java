package com.bjpowernode;


import com.bjpowernode.domain.Student;
import com.bjpowernode.domain.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
        public static void main(String[] args) {
                String Config="applicationContext.xml";
                ApplicationContext ac=new ClassPathXmlApplicationContext(Config);
                //@演示基于注解的注入（@Value注解可以直接写在属性上面，也可以写在set方法上面）
                Student student1= (Student) ac.getBean("student1");
                System.out.println(student1);
                //@演示基于注解的注入（对象的属性有引用数据类型）
                Teacher teacher1= (Teacher) ac.getBean("teacher1");
                System.out.println(teacher1);
                //@演示注解和xml的方式混用
                System.out.println(teacher1);
                //演示基于注解之resource
                System.out.println(teacher1);

        }

}

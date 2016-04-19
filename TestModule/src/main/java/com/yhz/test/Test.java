package com.yhz.test;

import com.yhz.springlearn.interf.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by yuhaozhe on 2016/4/12.
 */
public class Test {



    public static void main(String[] args){

//        ApplicationContext ctx=new ClassPathXmlApplicationContext("com.yhz.springlearn.config.xml");
        ApplicationContext ctx=new FileSystemXmlApplicationContext("E:\\Project\\TestModule\\src\\main\\java\\com\\yhz\\springlearn\\xml\\config.xml");

//        Performer performer=(Performer)ctx.getBean("poeticDuke");
        Performer performer=(Performer)ctx.getBean("kenny2");
        performer.perform();

    }




}

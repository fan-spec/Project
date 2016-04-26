package com.yhz.test;

import com.yhz.springlearn.interf.MindReader;
import com.yhz.springlearn.interf.Performer;
import com.yhz.springlearn.interf.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by yuhaozhe on 2016/4/12.
 */
public class Test {



    public static void main(String[] args){

//        ApplicationContext ctx=new ClassPathXmlApplicationContext("com.yhz.springlearn.config.xml");
        ApplicationContext ctx=new FileSystemXmlApplicationContext("E:\\Project\\TestModule\\src\\main\\resources\\config.xml");

//        Performer performer=(Performer)ctx.getBean("poeticDuke");
        Performer performer=(Performer)ctx.getBean("kenny");
        performer.perform();

        Thinker thinker= (Thinker) ctx.getBean("volunteer");
        MindReader mindReader= (MindReader) ctx.getBean("magician");
        thinker.thinkOfSomething("I'm hungry, shall we go for a lunch?");
        System.out.println("===========\n"+mindReader.getThoughts());

    }




}

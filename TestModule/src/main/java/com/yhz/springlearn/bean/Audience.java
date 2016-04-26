package com.yhz.springlearn.bean;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by yuhaozhe on 2016/4/26.
 */
public class Audience {

    public void takeSeats(){
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphone");
    }

    public void applaud(){
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){

        try{
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning off their cellphone");
            long start=System.currentTimeMillis();

            joinPoint.proceed();

            long end=System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took "+(end-start));
        }catch(Throwable t){
            System.out.println("Boo! We want our money back!");
        }

    }


}

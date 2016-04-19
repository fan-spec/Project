package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Poem;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class Sonnet29 implements Poem {
    private static String[] LINES={
            "When, in disgrace with fortune and men's eyes,",
            "I all alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries",
            "And look upon myself and curse my fate"};

    public Sonnet29(){}

    public void recite() {
        for(String str:LINES){
            System.out.println(str);
        }
    }
}

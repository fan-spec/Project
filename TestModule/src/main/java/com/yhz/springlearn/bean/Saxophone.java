package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Instrument;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class Saxophone implements Instrument {

    public Saxophone(){}

    public void play(){
        System.out.println("TOOT TOOT TOOT");
    }

}

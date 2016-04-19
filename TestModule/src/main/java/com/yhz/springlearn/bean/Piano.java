package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Instrument;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class Piano implements Instrument {

    public Piano(){}

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}

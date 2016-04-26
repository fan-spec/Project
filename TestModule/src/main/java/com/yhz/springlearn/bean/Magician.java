package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.MindReader;

/**
 * Created by yuhaozhe on 2016/4/26.
 */
public class Magician implements MindReader {
    private String thoughts;

    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts=thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}

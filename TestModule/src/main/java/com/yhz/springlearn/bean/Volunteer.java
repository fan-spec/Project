package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Thinker;

/**
 * Created by yuhaozhe on 2016/4/26.
 */
public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts=thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}

package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Poem;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem=poem;
    }

    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem=poem;
    }

    @Override
    public void perform() {
        super.perform();
        System.out.println("While reciting....");
        poem.recite();
    }
}

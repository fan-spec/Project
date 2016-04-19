package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Instrument;
import com.yhz.springlearn.interf.Performer;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist(){}

    public void perform(){
        System.out.println("Playing "+song+" : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}

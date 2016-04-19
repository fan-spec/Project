package com.yhz.springlearn.bean;

import com.yhz.springlearn.interf.Instrument;
import com.yhz.springlearn.interf.Performer;

import java.util.Collection;

/**
 * Created by yuhaozhe on 2016/4/19.
 */
public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    public OneManBand(){}

    public void perform() {
        for(Instrument instrument:instruments){
            instrument.play();
        }
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}

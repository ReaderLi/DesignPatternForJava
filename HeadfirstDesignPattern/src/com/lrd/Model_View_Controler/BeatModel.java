package com.lrd.Model_View_Controler;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface,MetaEventListener {

    //产生真实的节拍
    Sequencer sequencer;
    ArrayList<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Sequence sequence;
    Track track;

    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {

        sequencer.start();
        setBPM(90);

    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();

    }

    @Override
    public void setBPM(int bmp) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {

    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }
}

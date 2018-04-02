package com.wint.music;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer!");
        } catch (MidiUnavailableException e) {
            System.err.println("Midi unavailable!\nException message: " + e.getMessage() + "\nTo string: " + e.toString());
            e.printStackTrace();
        }
    }
}

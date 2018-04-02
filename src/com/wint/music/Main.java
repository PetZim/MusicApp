package com.wint.music;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2) {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);

            MiniMusicCmdLine player = new MiniMusicCmdLine();
            player.play(instrument, note);
        }
    }
}

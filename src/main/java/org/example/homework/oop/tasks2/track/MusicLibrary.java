package org.example.homework.oop.tasks2.track;

import java.util.HashMap;
import java.util.HashSet;

public class MusicLibrary {
    private final HashMap<String, HashSet<MusicTrack>> musicLibrary = new HashMap<>();

    public void addMusicTrack(MusicTrack track) {
        if (musicLibrary.containsKey(track.getGenre())) {
            musicLibrary.get(track.getGenre()).add(track);
        }
        else {
            musicLibrary.put(track.getGenre(), new HashSet<>());
            musicLibrary.get(track.getGenre()).add(track);
        }
    }

    public void removeMusicTrack(MusicTrack track) {
        musicLibrary.get(track.getGenre()).remove(track);
    }

    public HashSet<MusicTrack> getMusicTracksByGenre(String genre) {
        return musicLibrary.get(genre);
    }

    public HashMap<String, HashSet<MusicTrack>> getMusicLibrary() {
        return musicLibrary;
    }
}

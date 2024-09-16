package org.example.homework.oop.tasks2.track;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class MusicLibraryTests {
    private final MusicTrack firstTrack = new MusicTrack();
    private final MusicTrack secondTrack = new MusicTrack();
    private final String firstMusicGenre = "First Music genre";
    private final String secondMusicGenre = "Second Music genre";

    @BeforeEach
    public void setUp() {
        firstTrack.setName("First music track");
        firstTrack.setExecutor("First track executor");
        firstTrack.setGenre(firstMusicGenre);

        secondTrack.setName("Second music track");
        secondTrack.setExecutor("Second track executor");
        secondTrack.setGenre(secondMusicGenre);
    }

    @Test
    public void addingTrackToLibrary() {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addMusicTrack(firstTrack);
        HashMap<String, HashSet<MusicTrack>> library = musicLibrary.getMusicLibrary();

        Assertions.assertTrue(library.containsKey(firstMusicGenre));
        Assertions.assertTrue(library.get(firstTrack.getGenre()).contains(firstTrack));
    }

    @Test
    public void removingTrackFromLibrary() {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addMusicTrack(secondTrack);
        musicLibrary.removeMusicTrack(secondTrack);

        HashMap<String, HashSet<MusicTrack>> library = musicLibrary.getMusicLibrary();

        Assertions.assertTrue(library.containsKey(secondMusicGenre));
        Assertions.assertEquals(0, library.get(secondMusicGenre).size());
    }

    @Test
    public void gettingTracksByGenre() {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addMusicTrack(firstTrack);
        musicLibrary.addMusicTrack(secondTrack);

        HashSet<MusicTrack> tracks = musicLibrary.getMusicTracksByGenre(firstMusicGenre);

        Assertions.assertEquals(1, tracks.size());
        Assertions.assertTrue(tracks.contains(firstTrack));
    }
}

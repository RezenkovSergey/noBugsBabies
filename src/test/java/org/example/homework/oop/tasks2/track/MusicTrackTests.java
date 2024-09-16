package org.example.homework.oop.tasks2.track;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MusicTrackTests {

    @Test
    public void creationMusicTrackTest() {
        String trackName = "Track name";
        String trackExecutor = "Track executor";
        String trackGenre = "Track genre";

        MusicTrack track = new MusicTrack();
        track.setName(trackName);
        track.setExecutor(trackExecutor);
        track.setGenre(trackGenre);

        Assertions.assertEquals(trackName, track.getName());
        Assertions.assertEquals(trackExecutor, track.getExecutor());
        Assertions.assertEquals(trackGenre, track.getGenre());
    }
}

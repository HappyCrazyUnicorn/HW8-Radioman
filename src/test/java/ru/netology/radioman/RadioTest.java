package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldGetAndSetCurrentVolumeLevel() {
        Radio amazingRadio = new Radio();
        int volume = 8;
        int expected = 8;

        amazingRadio.setVolumeLevel(volume);
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }

    @Test
    void shouldSetVolumeLevelUpper() {
        Radio amazingRadio = new Radio();
        int volume = 11;
        int expected = 0;

        amazingRadio.setVolumeLevel(volume);
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }

    @Test
    void shouldSetVolumeLevelLower() {
        Radio amazingRadio = new Radio();
        int volume = -1;
        int expected = 0;

        amazingRadio.setVolumeLevel(volume);
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }


    @Test
    void shouldIncreaseVolume() {
        Radio amazingRadio = new Radio();
        int volume = 1;
        int expected = 2;

        amazingRadio.setVolumeLevel(volume);
        amazingRadio.increaseVolume();
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }

    @Test
    void shouldIncreaseVolumeUp() {
        Radio amazingRadio = new Radio();
        int volume = 10;
        int expected = 10;

        amazingRadio.setVolumeLevel(volume);
        amazingRadio.increaseVolume();
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio amazingRadio = new Radio();
        int volume = 10;
        int expected = 9;

        amazingRadio.setVolumeLevel(volume);
        amazingRadio.decreaseVolume();
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }

    @Test
    void shouldDecreaseVolumeLower() {
        Radio amazingRadio = new Radio();
        int volume = 0;
        int expected = 0;

        amazingRadio.setVolumeLevel(volume);
        amazingRadio.decreaseVolume();
        assertEquals(expected, amazingRadio.getCurrentVolumeLevel());
    }


    @Test
    void shouldGetAndSetCurrentStation() {
        Radio amazingRadio = new Radio();
        int expected = 1;
        amazingRadio.setCurrentStation(expected);

        assertEquals(expected, amazingRadio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        Radio amazingRadio = new Radio();
        int station = 8;
        int expected = 9;

        amazingRadio.setCurrentStation(station);
        amazingRadio.nextStation();
        assertEquals(expected, amazingRadio.getCurrentStation());
    }

    @Test
    void shouldNextStationUpperBound() {
        Radio amazingRadio = new Radio();
        int station = 9;
        int expected = 0;

        amazingRadio.setCurrentStation(station);
        amazingRadio.nextStation();
        assertEquals(expected, amazingRadio.getCurrentStation());
    }

    @Test
    void shouldPrevStationLowerBound() {
        Radio amazingRadio = new Radio();
        int station = 0;
        int expected = 9;

        amazingRadio.setCurrentStation(station);
        amazingRadio.prevStation();
        assertEquals(expected, amazingRadio.getCurrentStation());
    }


    @Test
    void shouldPrevStation() {
        Radio amazingRadio = new Radio();
        int station = 1;
        int expected = 0;

        amazingRadio.setCurrentStation(station);
        amazingRadio.prevStation();
        assertEquals(expected, amazingRadio.getCurrentStation());
    }

    @Test
    void shouldSetStationUpper() {
        Radio amazingRadio = new Radio();
        int station = 10;
        int expected = 0;

        amazingRadio.setCurrentStation(station);
        assertEquals(expected, amazingRadio.getCurrentStation());
    }

    @Test
    void shouldSetStationLower() {
        Radio amazingRadio = new Radio();
        int station = -1;
        int expected = 0;

        amazingRadio.setCurrentStation(station);
        assertEquals(expected, amazingRadio.getCurrentStation());
    }

}
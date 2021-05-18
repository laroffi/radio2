package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSwitchNextStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPrevStationFrom0() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPlusVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchPlusVolumeWrong() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchMinusVolumeWrong() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchMinusVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
}
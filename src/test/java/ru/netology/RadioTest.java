package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio (25, 100);
    @Test
    public void shouldSwitchNextStationFromMax() {

        radio.setCurrentStation(25);
        assertEquals(25, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation() {

        assertEquals(0, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {

        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPrevStationFrom0() {

        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(25, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {

        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(23);
        assertEquals(23, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMax() {

        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(30);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMin() {

        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPlusVolume() {

        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchPlusVolumeWrong() {

        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchMinusVolumeWrong() {

        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchMinusVolume() {

        radio.setCurrentVolume(55);
        assertEquals(55, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(54, radio.getCurrentVolume());
    }
}
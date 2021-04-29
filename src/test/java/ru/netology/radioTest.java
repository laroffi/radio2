package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
    @Test
    public void shouldSwitchNextStationFromMax() {
        radio radio = new radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        radio radio = new radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPrevStationFrom0() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMax() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSetStationWrongMin() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPlusVolume() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchPlusVolumeWrong() {
        radio radio = new radio();
        radio.setCurrentVolume(10);
        assertEquals(10, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchMinusVolumeWrong() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void shouldSwitchMinusVolume() {
        radio radio = new radio();
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
        radio.minusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
}
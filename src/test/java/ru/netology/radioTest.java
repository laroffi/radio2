package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {
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
    public void shouldSwitchPlusVolume() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.plusVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchMinusVolume() {
        radio radio = new radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.getCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
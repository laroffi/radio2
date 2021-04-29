package ru.netology;

public class radio {
    private int minStation;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume;
    private int maxVolume = 10;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void plusVolume() {
        if (currentVolume >= maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void minusVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }
}

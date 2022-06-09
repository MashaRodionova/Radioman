package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= 9) {
            this.currentRadioStation = currentRadioStation;
        } else {
            return;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 10) {
            this.currentVolume = currentVolume;
        } else {
            return;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void NextStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void PrevStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }

    public void IncreaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void DecreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }


}
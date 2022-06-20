package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int numberOfRadioStations;
    private int maxRadioStation;
    public Radio(int numberOfRadioStations){
        this.numberOfRadioStations = numberOfRadioStations;
        this.maxRadioStation = numberOfRadioStations -1;
    }
    public Radio(){
        this.numberOfRadioStations = 10;
        this.maxRadioStation = numberOfRadioStations -1;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation <= maxRadioStation) {
            this.currentRadioStation = currentRadioStation;
        } else {
            return;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
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
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = 0;
        } else {
            this.currentRadioStation = currentRadioStation + 1;
        }
    }

    public void PrevStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = maxRadioStation;
        } else {
            this.currentRadioStation = currentRadioStation - 1;
        }
    }

    public void IncreaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void DecreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }


}
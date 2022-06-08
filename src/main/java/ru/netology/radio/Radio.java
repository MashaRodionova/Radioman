package ru.netology.radio;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int NextStation(int currentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;

    }

    public int PrevStation(int currentRadioStation) {
        if (currentRadioStation > 0 && currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
        return currentRadioStation;

    }

}
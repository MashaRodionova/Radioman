package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    //Тестируем переключение станций кнопкой NEXT
    @Test
    public void NextStationFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.NextStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void NextStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.NextStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void NextStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.NextStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    //Тестируем переключение станций кнопкой PREV
    @Test
    public void PrevStationFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.PrevStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void PrevStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.PrevStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void PrevStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.PrevStation();
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    //Тестируем переключение станций с помощью указания номера станции
    @Test
    public void NumberStationFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void NumberStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int actual = radio.getCurrentRadioStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void NumberStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void NumberStationForthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int actual = radio.getCurrentRadioStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void NumberStationFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int actual = radio.getCurrentRadioStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    //Тестируем увеличение звука
    @Test
    public void CreaseVolumeFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.IncreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void CreaseVolumeSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.IncreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void CreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.IncreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void CreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.IncreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void CreaseVolumeFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.IncreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }


    //Тестируем уменьшение звука
    @Test
    public void DecreaseVolumeFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.DecreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.DecreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.DecreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.DecreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }


}

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
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.NextStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.NextStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.NextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    //Тестируем переключение станций кнопкой PREV
    @Test
    public void PrevStationFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.PrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.PrevStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.PrevStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        radio.PrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.PrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.PrevStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.PrevStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }


    //Тестируем переключение станций с помощью указания номера станции
    @Test
    public void NumberStationFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationForthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NumberStationSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }


    //Тестируем увеличение звука
    @Test
    public void CreaseVolumeFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.IncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.IncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.IncreaseVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(73);
        radio.IncreaseVolume();
        assertEquals(74, radio.getCurrentVolume());
    }


    //Тестируем уменьшение звука
    @Test
    public void DecreaseVolumeFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.DecreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.DecreaseVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(39);
        radio.DecreaseVolume();
        assertEquals(38, radio.getCurrentVolume());
    }


    //Тестируем переключение станций кнопкой NEXT c предварительным изменением количества радиостанций
    @Test
    public void NextStationWithGivenAmountFirstTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(76);
        radio.NextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountSecondTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(75);
        radio.NextStation();
        assertEquals(76, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountThirdTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(0);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountFourthTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(77);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountFifthTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(1);
        radio.NextStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountSixthTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(-1);
        radio.NextStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void NextStationWithGivenAmountSeventhTest() {
        Radio radio = new Radio(77);
        radio.setCurrentRadioStation(42);
        radio.NextStation();
        assertEquals(43, radio.getCurrentRadioStation());
    }

    //Тестируем переключение станций кнопкой PREV c предварительным изменением количества радиостанций
    @Test
    public void PrevStationWithGivenAmountFirstTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(0);
        radio.PrevStation();
        assertEquals(46, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountSecondTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(46);
        radio.PrevStation();
        assertEquals(45, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountThirdTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(1);
        radio.PrevStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountFourthTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(-1);
        radio.PrevStation();
        assertEquals(46, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountFifthTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(47);
        radio.PrevStation();
        assertEquals(46, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountSixthTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(45);
        radio.PrevStation();
        assertEquals(44, radio.getCurrentRadioStation());
    }

    @Test
    public void PrevStationWithGivenAmountSeventhTest() {
        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(21);
        radio.PrevStation();
        assertEquals(20, radio.getCurrentRadioStation());
    }


//закоммитила изменения не в ту ветку и не придумала ничего лучше, чем изменить файл этим комментарием и закоммитить в нужную ветку
}

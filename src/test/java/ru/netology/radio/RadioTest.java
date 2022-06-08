package ru.netology.radio;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
   void NextRadioStationFirstTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void NextRadioStationSecondTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void NextRadioStationThirdTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void NextRadioStationFourthTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void NextRadioStationFifthTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void NextRadioStationSixthTest (int radioChannel, int expected){
        Radio radioStation = new Radio();
        int actual = radioStation.NextStation(radioChannel);
        assertEquals(expected, actual);
    }

}

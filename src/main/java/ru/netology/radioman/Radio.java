package ru.netology.radioman;

public class Radio {
    private String name; //название
    private int currentStation; //номер станции
    private int currentVolumeLevel; //уровень громкости

    //методы работы с радио
    //текущая громкость
    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    //установка громкости
    public void setVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel > 10) {
            return;
        }
        if (currentVolumeLevel < 0) {
            return;
        }
        //если уровень громкости в заданном диапазоне, то устанавливаем его
        this.currentVolumeLevel = currentVolumeLevel;
    }

    //увеличение громкости на 1
    public void increaseVolume() {
        if (currentVolumeLevel < 10) {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
    }

    //уменьшение громкости на 1
    public void decreaseVolume() {
        if (currentVolumeLevel > 0) {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
    }

    //текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    //увеличение станции на 1
    public void nextStation() {
        if (currentStation >= 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    //уменьшение станци на 1
    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    //прямая установка номера станции
    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        //если номер станции в нужном диапазоне, то устанавливаем его
        this.currentStation = currentStation;
    }


}

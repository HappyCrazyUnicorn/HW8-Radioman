package ru.netology.radioman;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {
    private String name; //название
    private int currentStation; //номер станции
    private int currentVolumeLevel; //уровень громкости
    private int maxVolume = 100; //максимальный уровень звука
    private int countStation = 10; //количество радиостанций, по умолчанию - 10
    private int maxStation = 9; //номер макисмальной станции

    //конструктор на случай, если вводим номер станции
    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxStation = countStation - 1;
    }

    //методы работы с радио

    //установка громкости
    public void setVolumeLevel(int currentVolumeLevel) {
        if (currentVolumeLevel > maxVolume) {
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
        if (currentVolumeLevel < maxVolume) {
            currentVolumeLevel = currentVolumeLevel + 1;
        }
    }

    //уменьшение громкости на 1
    public void decreaseVolume() {
        if (currentVolumeLevel > 0) {
            currentVolumeLevel = currentVolumeLevel - 1;
        }
    }

    //увеличение станции на 1
    public void nextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    //уменьшение станци на 1
    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    //прямая установка номера станции
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        //если номер станции в нужном диапазоне, то устанавливаем его
        this.currentStation = currentStation;
    }


}

package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int minStation;
    private int maxStation;

    public Radio() {
        minStation = 0;
        maxStation = 9;

    }
    public Radio(int selectStation) { //выбор номера станции напрямую
        maxStation = selectStation - 1;
        this.currentStation = selectStation;
    }

    public int getCurrentStation() { // геттер станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) { // сеттер станции
        if (currentStation < 0) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation;
        }
    }
    public void nextStation() { // переключение на следующую станцию
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }
    public void prevStation() { // переключение на предыдущую станцию
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() { // геттер громкости
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // сеттер громкости
        this.currentVolume = currentVolume;
    }
    public void nextVolume() { // переключение на следующую станцию
        if (currentVolume != 100) {
            currentVolume++;
        }
    }
    public void prevVolume() { // переключение на предыдущую станцию
        if (currentVolume != 0) {
            currentVolume--;
        }
    }


}
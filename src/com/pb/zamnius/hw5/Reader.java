package com.pb.zamnius.hw5;

public class Reader {
    private String pib;
    private String bilet;
    private String fak;
    private String data;
    private String tel;

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getBilet() {
        return bilet;
    }

    public void setBilet(String bilet) {
        this.bilet = bilet;
    }

    public String getFak() {
        return fak;
    }

    public void setFak(String fak) {
        this.fak = fak;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    String InfoR() {
        return "ФИО: " + pib + ", Номер билета: " + bilet + ", Факультет: " + fak + ", Дата рождения: " + data + ", Номер телефона: " + tel ;
    }
    String Person() {
        return  pib;
    }



}

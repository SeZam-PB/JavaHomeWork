package com.pb.zamnius.hw5;

public class Book {

    private String kniga;
    private String avtor;
    private String year;


    public String getKniga() {
        return kniga;
    }

    public void setKniga(String kniga) {
        this.kniga = kniga;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    String InfoB() {
        return "книга: " + kniga + ", автор: " + avtor + ", год издания: " + year;
    }
    String InfoB1() {
        return  kniga + ", автор: " + avtor;
    }
    String Books() {
        return  kniga;
        }


        }







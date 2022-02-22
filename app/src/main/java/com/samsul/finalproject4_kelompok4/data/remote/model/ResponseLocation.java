package com.samsul.finalproject4_kelompok4.data.remote.model;

public class ResponseLocation {

    private int id;
    private String name;
    private String terminal;

    public ResponseLocation(int id, String name, String terminal) {
        this.id = id;
        this.name = name;
        this.terminal = terminal;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

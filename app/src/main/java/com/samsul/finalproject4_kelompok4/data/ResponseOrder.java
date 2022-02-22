package com.samsul.finalproject4_kelompok4.data;

public class ResponseOrder {

    String tgl, bookNo, nameTerminal, terminalLocation, time;

    public ResponseOrder(String tgl, String bookNo, String nameTerminal, String terminalLocation, String time) {
        this.tgl = tgl;
        this.bookNo = bookNo;
        this.nameTerminal = nameTerminal;
        this.terminalLocation = terminalLocation;
        this.time = time;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getNameTerminal() {
        return nameTerminal;
    }

    public void setNameTerminal(String nameTerminal) {
        this.nameTerminal = nameTerminal;
    }

    public String getTerminalLocation() {
        return terminalLocation;
    }

    public void setTerminalLocation(String terminalLocation) {
        this.terminalLocation = terminalLocation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

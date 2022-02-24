package com.samsul.finalproject4_kelompok4.data.remote.model;

public class ResponseBus {

    private int idBus;
    private String busName;
    private String startTime;
    private String endTime;
    private String startLocation;
    private String startTerminal;
    private String endLocation;
    private String endTerminal;
    private String rating;
    private String review;
    private String prince;
    private String totalTime;
    private String busClass;
    private String imageBus;

    public ResponseBus(
            int idBus,
            String busName, String startTime,
            String endTime, String startLocation,
            String startTerminal, String endLocation,
            String endTerminal, String rating,
            String review, String prince,
            String totalTime, String busClass,
            String imageBus
    ) {
        this.idBus = idBus;
        this.busName = busName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startLocation = startLocation;
        this.startTerminal = startTerminal;
        this.endLocation = endLocation;
        this.endTerminal = endTerminal;
        this.rating = rating;
        this.review = review;
        this.prince = prince;
        this.totalTime = totalTime;
        this.busClass = busClass;
        this.imageBus = imageBus;
    }

    public String getImageBus() {
        return imageBus;
    }

    public void setImageBus(String imageBus) {
        this.imageBus = imageBus;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getStartTerminal() {
        return startTerminal;
    }

    public void setStartTerminal(String startTerminal) {
        this.startTerminal = startTerminal;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getEndTerminal() {
        return endTerminal;
    }

    public void setEndTerminal(String endTerminal) {
        this.endTerminal = endTerminal;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getBusClass() {
        return busClass;
    }

    public void setBusClass(String busClass) {
        this.busClass = busClass;
    }
}

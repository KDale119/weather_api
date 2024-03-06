package edu.mccneb.codeschool.weatherapi.model;

public class Time {
    Boolean current;

    String lastUpdatedFateTime;

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    public String getLastUpdatedFateTime() {
        return lastUpdatedFateTime;
    }

    public void setLastUpdatedFateTime(String lastUpdatedFateTime) {
        this.lastUpdatedFateTime = lastUpdatedFateTime;
    }
}

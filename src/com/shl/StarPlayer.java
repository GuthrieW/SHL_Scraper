package com.shl;

public class StarPlayer {
    private String name;
    private String team;
    private int goals;
    private int assists;
    private int points;
    private int plusMinus;
    private int PIMs;
    private int shots;
    private int hits;
    private int shotsBlocked;

    public StarPlayer(String name, String team, int goals, int assists, int points, int plusMinus, int PIMs, int shots, int hits, int shotsBlocked) {
        this.name = name;
        this.team = team;
        this.goals = goals;
        this.assists = assists;
        this.points = points;
        this.plusMinus = plusMinus;
        this.PIMs = PIMs;
        this.shots = shots;
        this.hits = hits;
        this.shotsBlocked = shotsBlocked;
    }

    public StarPlayer() {
        this.name = null;
        this.team = null;
        this.goals = 0;
        this.assists = 0;
        this.points = 0;
        this.plusMinus = 0;
        this.PIMs = 0;
        this.shots = 0;
        this.hits = 0;
        this.shotsBlocked = 0;
    }

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    public String getTeam() { return this.team; }

    public void setTeam(String team) { this.team = team; }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(int plusMinus) {
        this.plusMinus = plusMinus;
    }

    public int getPIMs() {
        return PIMs;
    }

    public void setPIMs(int PIMs) {
        this.PIMs = PIMs;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getShotsBlocked() {
        return shotsBlocked;
    }

    public void setShotsBlocked(int shotsBlocked) {
        this.shotsBlocked = shotsBlocked;
    }
}

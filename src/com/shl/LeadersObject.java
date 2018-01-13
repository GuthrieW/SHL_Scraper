package com.shl;

public class LeadersObject {
    private Integer positionOnList;
    private String playerName;
    private String playerPosition;
    private Integer gamesPlayed;
    private Integer goalsScored;
    private Integer assistsScored;
    private Integer pointsScored;
    private Integer plusMinus;
    private Integer totalPIMsScored;
    private Integer fightingMajorsPIMs;
    private Integer hitsGiven;
    private Integer hitsTaken;
    private String shotPercentage;
    private Integer shotsTaken;
    private Integer shotsBlocked;
    private Integer minutesPlayed;
    private Float averageMinutesPlayed;
    private Integer powerPlayGoals;
    private Integer powerPlayAssists;
    private Integer powerPlayShots;
    private Integer powerPlayMinutes;
    private Integer penaltyKillMinutes;

    public LeadersObject(Integer positiononlist, String playername, String playerposition, Integer gamesplayed, Integer goalsscored, Integer assistsscored, Integer pointsscored, Integer plusminus, Integer totalpimsscored, Integer fightingmajorspim, Integer hitsgiven, Integer hitstaken, String shotpercentage, Integer shotstaken, Integer shotsblocked, Integer minutesplayed, Float averageminutesplayed, Integer powerplaygoals, Integer powerplayassists, Integer powerplayshots, Integer powerplayminutes, Integer penaltykillminutes) {
        this.positionOnList = positiononlist;
        this.playerName = playername;
        this.playerPosition = playerposition;
        this.gamesPlayed = gamesplayed;
        this.goalsScored = goalsscored;
        this.assistsScored = assistsscored;
        this.pointsScored = pointsscored;
        this.plusMinus = plusminus;
        this.totalPIMsScored = totalpimsscored;
        this.fightingMajorsPIMs = fightingmajorspim;
        this.hitsGiven = hitsgiven;
        this.hitsTaken = hitstaken;
        this.shotPercentage = shotpercentage;
        this.shotsTaken = shotstaken;
        this.shotsBlocked = shotsblocked;
        this.minutesPlayed = minutesplayed;
        this.averageMinutesPlayed = averageminutesplayed;
        this.powerPlayGoals = powerplaygoals;
        this.powerPlayAssists = powerplayassists;
        this.powerPlayShots = powerplayshots;
        this.powerPlayMinutes = powerplayminutes;
        this.penaltyKillMinutes = penaltykillminutes;
    }

    public LeadersObject() {
        this.positionOnList = null;
        this.playerName = null;
        this.playerPosition = null;
        this.gamesPlayed = null;
        this.goalsScored = null;
        this.assistsScored = null;
        this.pointsScored = null;
        this.plusMinus = null;
        this.totalPIMsScored = null;
        this.fightingMajorsPIMs = null;
        this.hitsGiven = null;
        this.hitsTaken = null;
        this.shotPercentage = null;
        this.shotsTaken = null;
        this.shotsBlocked = null;
        this.minutesPlayed = null;
        this.averageMinutesPlayed = null;
        this.powerPlayGoals = null;
        this.powerPlayAssists = null;
        this.powerPlayShots = null;
        this.powerPlayMinutes = null;
        this.penaltyKillMinutes = null;
    }

    public Integer getPositionOnList() {
        return positionOnList;
    }

    public void setPositionOnList(Integer positionOnList) {
        this.positionOnList = positionOnList;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getAssistsScored() {
        return assistsScored;
    }

    public void setAssistsScored(Integer assistsScored) {
        this.assistsScored = assistsScored;
    }

    public Integer getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(Integer pointsScored) {
        this.pointsScored = pointsScored;
    }

    public Integer getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public Integer getTotalPIMsScored() {
        return totalPIMsScored;
    }

    public void setTotalPIMsScored(Integer totalPIMsScored) {
        this.totalPIMsScored = totalPIMsScored;
    }

    public Integer getFightingMajorsPIMs() {
        return fightingMajorsPIMs;
    }

    public void setFightingMajorsPIMs(Integer fightingMajorsPIMs) {
        this.fightingMajorsPIMs = fightingMajorsPIMs;
    }

    public Integer getHitsGiven() {
        return hitsGiven;
    }

    public void setHitsGiven(Integer hitsGiven) {
        this.hitsGiven = hitsGiven;
    }

    public Integer getHitsTaken() {
        return hitsTaken;
    }

    public void setHitsTaken(Integer hitsTaken) {
        this.hitsTaken = hitsTaken;
    }

    public String getShotPercentage() {
        return shotPercentage;
    }

    public void setShotPercentage(String shotPercentage) {
        this.shotPercentage = shotPercentage;
    }

    public Integer getShotsTaken() {
        return shotsTaken;
    }

    public void setShotsTaken(Integer shotsTaken) {
        this.shotsTaken = shotsTaken;
    }

    public Integer getShotsBlocked() {
        return shotsBlocked;
    }

    public void setShotsBlocked(Integer shotsBlocked) {
        this.shotsBlocked = shotsBlocked;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Float getAverageMinutesPlayed() {
        return averageMinutesPlayed;
    }

    public void setAverageMinutesPlayed(Float averageMinutesPlayed) {
        this.averageMinutesPlayed = averageMinutesPlayed;
    }

    public Integer getPowerPlayGoals() {
        return powerPlayGoals;
    }

    public void setPowerPlayGoals(Integer powerPlayGoals) {
        this.powerPlayGoals = powerPlayGoals;
    }

    public Integer getPowerPlayAssists() {
        return powerPlayAssists;
    }

    public void setPowerPlayAssists(Integer powerPlayAssists) {
        this.powerPlayAssists = powerPlayAssists;
    }

    public Integer getPowerPlayShots() {
        return powerPlayShots;
    }

    public void setPowerPlayShots(Integer powerPlayShots) {
        this.powerPlayShots = powerPlayShots;
    }

    public Integer getPowerPlayMinutes() {
        return powerPlayMinutes;
    }

    public void setPowerPlayMinutes(Integer powerPlayMinutes) {
        this.powerPlayMinutes = powerPlayMinutes;
    }

    public Integer getPenaltyKillMinutes() {
        return penaltyKillMinutes;
    }

    public void setPenaltyKillMinutes(Integer penaltyKillMinutes) {
        this.penaltyKillMinutes = penaltyKillMinutes;
    }
}

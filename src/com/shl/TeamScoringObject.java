package com.shl;

public class TeamScoringObject {
    private String playerName;
    private String playerPos;
    private Integer gamesPlayed;
    private Integer goalsScored;
    private Integer assistsScored;
    private Integer pointsScored;
    private Integer plusMinus;
    private Integer totalPIMs;
    private Integer totalFightingMajorsPIMs;
    private Integer hitsGiven;
    private Integer hitsTaken;
    private Integer shotsTaken;
    private Integer shotsBlocked;
    private Integer minutesPlayed;
    private String averageMinutesPerGame;
    private Integer powerPlayGoalsScored;
    private Integer powerPlayAssistsScored;
    private Integer powerPlayShots;
    private Integer powerPlayMinutes;
    private Integer penaltyKillGoalsScored;
    private Integer penaltyKillAssistsScored;
    private Integer penaltyKillShots;
    private Integer penaltyKillMinutes;
    private Integer gameWinningGoals;
    private Integer gameTyingGoals;
    private String faceoffPercentage;
    private Integer faceoffsTaken;
    private Integer hatTricks;

    public TeamScoringObject() {
        this.playerName = null;
        this.playerPos = null;
        this.gamesPlayed = null;
        this.goalsScored = null;
        this.assistsScored = null;
        this.pointsScored = null;
        this.plusMinus = null;
        this.totalPIMs = null;
        this.totalFightingMajorsPIMs = null;
        this.hitsGiven = null;
        this.hitsTaken = null;
        this.shotsTaken = null;
        this.shotsBlocked = null;
        this.minutesPlayed = null;
        this.averageMinutesPerGame = null;
        this.powerPlayGoalsScored = null;
        this.powerPlayAssistsScored = null;
        this.powerPlayShots = null;
        this.powerPlayMinutes = null;
        this.penaltyKillGoalsScored = null;
        this.penaltyKillAssistsScored = null;
        this.penaltyKillShots = null;
        this.penaltyKillMinutes = null;
        this.gameWinningGoals = null;
        this.gameTyingGoals = null;
        this.faceoffPercentage = null;
        this.faceoffsTaken = null;
        this.hatTricks = null;
    }

    public TeamScoringObject(String playername, String playerpos, Integer gamesplayed, Integer goalsscored, Integer assistsscored, Integer pointesscored, Integer plusminus, Integer totalpims, Integer totalfightingmajorspims, Integer hitsgiven, Integer hitstaken, Integer shotstaken, Integer shotsblocked, Integer minutesplayed, String averageminutespergame, Integer powerplaygoalsscored, Integer powerplayassistsscored, Integer powerplayshots, Integer powerplayminutes, Integer penaltykillgoalsscored, Integer penaltykillassistsscored, Integer penaltykillshots, Integer penaltykillminutes, Integer gamewinninggoals, Integer gametyinggoals, String faceoffpercentage, Integer faceoffstaken, Integer hattricks) {
        this.playerName = playername;
        this.playerPos = playerpos;
        this.gamesPlayed = gamesplayed;
        this.goalsScored = goalsscored;
        this.assistsScored = assistsscored;
        this.pointsScored = pointesscored;
        this.plusMinus = plusminus;
        this.totalPIMs = totalpims;
        this.totalFightingMajorsPIMs = totalfightingmajorspims;
        this.hitsGiven = hitsgiven;
        this.hitsTaken = hitstaken;
        this.shotsTaken = shotstaken;
        this.shotsBlocked = shotsblocked;
        this.minutesPlayed = minutesplayed;
        this.averageMinutesPerGame = averageminutespergame;
        this.powerPlayGoalsScored = powerplaygoalsscored;
        this.powerPlayAssistsScored = powerplayassistsscored;
        this.powerPlayShots = powerplayshots;
        this.powerPlayMinutes = powerplayminutes;
        this.penaltyKillGoalsScored = penaltykillgoalsscored;
        this.penaltyKillAssistsScored = penaltykillassistsscored;
        this.penaltyKillShots = penaltykillshots;
        this.penaltyKillMinutes = penaltykillminutes;
        this.gameWinningGoals = gamewinninggoals;
        this.gameTyingGoals = gametyinggoals;
        this.faceoffPercentage = faceoffpercentage;
        this.faceoffsTaken = faceoffstaken;
        this.hatTricks = hattricks;
    }

    public Integer getTotalFightingMajorsPIMs() {
        return totalFightingMajorsPIMs;
    }

    public void setTotalFightingMajorsPIMs(Integer totalFightingMajorsPIMs) {
        this.totalFightingMajorsPIMs = totalFightingMajorsPIMs;
    }

    public void setAllObjects() {}


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

    public Integer getPenaltyKillShots() {
        return penaltyKillShots;
    }

    public void setPenaltyKillShots(Integer penaltyKillShots) {
        this.penaltyKillShots = penaltyKillShots;
    }

    public Integer getPenaltyKillMinutes() {
        return penaltyKillMinutes;
    }

    public void setPenaltyKillMinutes(Integer penaltyKillMinutes) {
        this.penaltyKillMinutes = penaltyKillMinutes;
    }

    public String calculateShootingPercentage() {

        return new String();
    }

    public String calculatePowerPlayPoints() {

        return new String();
    }

    public String calculatePenaltyKillPoints() {

        return new String();
    }

    public String calculateSpecialTeamsMinutes() {

        return new String();
    }

    public String calculateTotalMinorPenaltyPIMs() {
        int numTotalPIMs = this.totalPIMs;
        int numTotalFightingPIMs = this.totalFightingMajorsPIMs;
        int totalMinorPIMs = numTotalPIMs - numTotalFightingPIMs;
        return Integer.toString(totalMinorPIMs);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPos() {
        return playerPos;
    }

    public void setPlayerPos(String playerPos) {
        this.playerPos = playerPos;
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

    public Integer getTotalPIMs() {
        return totalPIMs;
    }

    public void setTotalPIMs(Integer totalPIMs) {
        this.totalPIMs = totalPIMs;
    }

    public Integer getTotalFghtingMajors() {
        return totalFightingMajorsPIMs;
    }

    public void setTotalFghtingMajors(Integer totalFghtingMajors) {
        this.totalFightingMajorsPIMs = totalFghtingMajors;
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

    public String getAverageMinutesPerGame() {
        return averageMinutesPerGame;
    }

    public void setAverageMinutesPerGame(String averageMinutesPerGame) {
        this.averageMinutesPerGame = averageMinutesPerGame;
    }

    public Integer getPowerPlayGoalsScored() {
        return powerPlayGoalsScored;
    }

    public void setPowerPlayGoalsScored(Integer powerPlayGoalsScored) {
        this.powerPlayGoalsScored = powerPlayGoalsScored;
    }

    public Integer getPowerPlayAssistsScored() {
        return powerPlayAssistsScored;
    }

    public void setPowerPlayAssistsScored(Integer powerPlayAssistsScored) {
        this.powerPlayAssistsScored = powerPlayAssistsScored;
    }

    public Integer getPenaltyKillGoalsScored() {
        return penaltyKillGoalsScored;
    }

    public void setPenaltyKillGoalsScored(Integer penaltyKillGoalsScored) {
        this.penaltyKillGoalsScored = penaltyKillGoalsScored;
    }

    public Integer getPenaltyKillAssistsScored() {
        return penaltyKillAssistsScored;
    }

    public void setPenaltyKillAssistsScored(Integer penaltyKillAssistsScored) {
        this.penaltyKillAssistsScored = penaltyKillAssistsScored;
    }

    public Integer getGameWinningGoals() {
        return gameWinningGoals;
    }

    public void setGameWinningGoals(Integer gameWinningGoals) {
        this.gameWinningGoals = gameWinningGoals;
    }

    public Integer getGameTyingGoals() {
        return gameTyingGoals;
    }

    public void setGameTyingGoals(Integer gameTyingGoals) {
        this.gameTyingGoals = gameTyingGoals;
    }

    public String getFaceoffPercentage() {
        return faceoffPercentage;
    }

    public void setFaceoffPercentage(String faceoffPercentage) {
        this.faceoffPercentage = faceoffPercentage;
    }

    public Integer getFaceoffsTaken() {
        return faceoffsTaken;
    }

    public void setFaceoffsTaken(Integer faceoffsTaken) {
        this.faceoffsTaken = faceoffsTaken;
    }

    public Integer getHatTricks() {
        return hatTricks;
    }

    public void setHatTricks(Integer hatTricks) {
        this.hatTricks = hatTricks;
    }
}

package com.shl;

public class TeamStandingsObject {
    private String teamName;
    private Integer gamesPlayed;
    private Integer wins;
    private Integer losses;
    private Integer otLosses;
    private Integer totalPoints;
    private Integer goalsFor;
    private Integer goalsAgainst;

    public TeamStandingsObject(String teamname, Integer gamesplayed, Integer wins, Integer losses, Integer otlosses, Integer totalpoints, Integer goalsfor, Integer goalsagainst) {
        this.teamName = teamname;
        this.gamesPlayed = gamesplayed;
        this.wins = wins;
        this.losses = losses;
        this.otLosses = otlosses;
        this.totalPoints = totalpoints;
        this.goalsFor = goalsfor;
        this.goalsAgainst = goalsagainst;
    }

    public String calculateGoalDifferential() {
        int numGoalsFor = this.goalsFor;
        int numGoalsAgainst = this.goalsAgainst;
        int goalDifferential = numGoalsFor - numGoalsAgainst;
        return Integer.toString(goalDifferential);
    }

    public String calculatePointPercentage() {
        int numGamesPlayed = this.gamesPlayed;
        int numPossiblePoints = numGamesPlayed * 2;
        float numEarnedPoints = this.totalPoints;
        float pointPercentage = numEarnedPoints / numPossiblePoints;
        return String.format("%.3f", pointPercentage);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getOtLosses() {
        return otLosses;
    }

    public void setOtLosses(Integer otLosses) {
        this.otLosses = otLosses;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer points) {
        this.totalPoints = points;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }
}
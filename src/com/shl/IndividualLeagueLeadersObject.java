package com.shl;

public class IndividualLeagueLeadersObject {
    private Integer positionOnList;
    private String playerName;
    private Integer gamesPlayed;
    private String statResult;

    public IndividualLeagueLeadersObject(Integer positiononlist, String playername, Integer gamesplayed, String statresult) {
        this.positionOnList = positiononlist;
        this.playerName = playername;
        this.gamesPlayed = gamesplayed;
        this.statResult = statresult;
    }

    public IndividualLeagueLeadersObject() {
        this.positionOnList = null;
        this.playerName = null;
        this.gamesPlayed = null;
        this.statResult = null;
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

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getStatResult() {
        return statResult;
    }

    public void setStatResult(String statResult) {
        this.statResult = statResult;
    }
}

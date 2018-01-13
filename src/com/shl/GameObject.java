package com.shl;

public class GameObject {
    private String gameLink;
    private String gameTeams;
    private String gameNumber;

    public GameObject(String gamelink, String gameTeams, String gameNumber) {
        this.gameLink = gamelink;
        this.gameTeams = gameTeams;
        this.gameNumber = gameNumber;
    }

    public String getGameLink() {
        return gameLink;
    }

    public void setGameLink(String gamelink) {
        this.gameLink = gamelink;
    }

    public String getGameTeams() {
        return gameTeams;
    }

    public void setGameTeams(String gameTeams) {
        this.gameTeams = gameTeams;
    }

    public String getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(String gameNumber) {
        this.gameNumber = gameNumber;
    }
}

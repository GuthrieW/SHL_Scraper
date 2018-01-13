package com.shl;

public class SingleGame {
    private StarPlayer star1;
    private StarPlayer star2;
    private StarPlayer star3;
    private String gameStatsString;
    private String leftTeamScore;
    private String rightTeamScore;
    private String leftTeamName;
    private String rightTeamName;

    public SingleGame(StarPlayer star1, StarPlayer star2, StarPlayer star3, String gameStatsString, String leftTeamScore, String rightTeamScore, String leftTeamName, String rightTeamName) {
        this.star1 = star1;
        this.star2 = star2;
        this.star3 = star3;
        this.gameStatsString = gameStatsString;
        this.leftTeamScore = leftTeamScore;
        this.rightTeamScore = rightTeamScore;
        this.leftTeamName = leftTeamName;
        this.rightTeamName = rightTeamName;
    }

    public SingleGame() {
        this.star1 = null;
        this.star2 = null;
        this.star3 = null;
        this.gameStatsString = null;
        this.leftTeamScore = null;
        this.rightTeamScore = null;
        this.leftTeamName = null;
        this.rightTeamName = null;
    }

    public StarPlayer getStar1() {
        return star1;
    }

    public void setStar1(StarPlayer star1) {
        this.star1 = star1;
    }

    public StarPlayer getStar2() {
        return star2;
    }

    public void setStar2(StarPlayer star2) {
        this.star2 = star2;
    }

    public StarPlayer getStar3() {
        return star3;
    }

    public void setStar3(StarPlayer star3) {
        this.star3 = star3;
    }

    public String getGameStatsString() {
        return gameStatsString;
    }

    public void setGameStatsString(String gameStatsString) {
        this.gameStatsString = gameStatsString;
    }

    public String getLeftTeamScore() {
        return leftTeamScore;
    }

    public void setLeftTeamScore(String leftTeamScore) {
        this.leftTeamScore = leftTeamScore;
    }

    public String getRightTeamScore() {
        return rightTeamScore;
    }

    public void setRightTeamScore(String rightTeamScore) {
        this.rightTeamScore = rightTeamScore;
    }

    public String getLeftTeamName() {
        return leftTeamName;
    }

    public void setLeftTeamName(String leftTeamName) {
        this.leftTeamName = leftTeamName;
    }

    public String getRightTeamName() {
        return rightTeamName;
    }

    public void setRightTeamName(String rightTeamName) {
        this.rightTeamName = rightTeamName;
    }
}

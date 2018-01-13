package com.shl;

public class RosterObject {
    private String playerName;
    private String playerPosition;
    private Integer checkingStat;
    private Integer fightingStat;
    private Integer disciplineStat;
    private Integer skatingStat;
    private Integer strengthStat;
    private Integer enduranceStat;
    private Integer puckHandlingStat;
    private Integer faceoffStat;
    private Integer passingStat;
    private Integer scoringStat;
    private Integer defenseStat;
    private Integer penaltyShotStat;

    public RosterObject() {
        this.playerName = null;
        this.playerPosition = null;
        this.checkingStat = null;
        this.fightingStat = null;
        this.disciplineStat = null;
        this.skatingStat = null;
        this.strengthStat = null;
        this.enduranceStat = null;
        this.puckHandlingStat = null;
        this.faceoffStat = null;
        this.passingStat = null;
        this.scoringStat = null;
        this.defenseStat = null;
        this.penaltyShotStat = null;
    }

    public RosterObject(String playername, String playerposition, Integer checkingstat, Integer fightingstat, Integer disciplinestat, Integer skatingstat, Integer strengthstat, Integer endurancestat, Integer puckhandlingstat, Integer faceoffstat, Integer passingstat, Integer scoringstat, Integer defensestat, Integer penaltyshotstat) {
        this.playerName = playername;
        this.playerPosition = playerposition;
        this.checkingStat = checkingstat;
        this.fightingStat = fightingstat;
        this.disciplineStat = disciplinestat;
        this.skatingStat = skatingstat;
        this.strengthStat = strengthstat;
        this.enduranceStat = endurancestat;
        this.puckHandlingStat = puckhandlingstat;
        this.faceoffStat = faceoffstat;
        this.passingStat = passingstat;
        this.scoringStat = scoringstat;
        this.defenseStat = defensestat;
        this.penaltyShotStat = penaltyshotstat;
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

    public Integer getCheckingStat() {
        return checkingStat;
    }

    public void setCheckingStat(Integer checkingStat) {
        this.checkingStat = checkingStat;
    }

    public Integer getFightingStat() {
        return fightingStat;
    }

    public void setFightingStat(Integer fightingStat) {
        this.fightingStat = fightingStat;
    }

    public Integer getDisciplineStat() {
        return disciplineStat;
    }

    public void setDisciplineStat(Integer disciplineStat) {
        this.disciplineStat = disciplineStat;
    }

    public Integer getSkatingStat() {
        return skatingStat;
    }

    public void setSkatingStat(Integer skatingStat) {
        this.skatingStat = skatingStat;
    }

    public Integer getStrengthStat() {
        return strengthStat;
    }

    public void setStrengthStat(Integer strengthStat) {
        this.strengthStat = strengthStat;
    }

    public Integer getEnduranceStat() {
        return enduranceStat;
    }

    public void setEnduranceStat(Integer enduranceStat) {
        this.enduranceStat = enduranceStat;
    }

    public Integer getPuckHandlingStat() {
        return puckHandlingStat;
    }

    public void setPuckHandlingStat(Integer puckHandlingStat) {
        this.puckHandlingStat = puckHandlingStat;
    }

    public Integer getFaceoffStat() {
        return faceoffStat;
    }

    public void setFaceoffStat(Integer faceoffStat) {
        this.faceoffStat = faceoffStat;
    }

    public Integer getPassingStat() {
        return passingStat;
    }

    public void setPassingStat(Integer passingStat) {
        this.passingStat = passingStat;
    }

    public Integer getScoringStat() {
        return scoringStat;
    }

    public void setScoringStat(Integer scoringStat) {
        this.scoringStat = scoringStat;
    }

    public Integer getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat(Integer defenseStat) {
        this.defenseStat = defenseStat;
    }

    public Integer getPenaltyShotStat() {
        return penaltyShotStat;
    }

    public void setPenaltyShotStat(Integer penaltyShotStat) {
        this.penaltyShotStat = penaltyShotStat;
    }
}

package com.shl;

import com.sun.org.apache.xpath.internal.operations.Plus;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.HashMap;

class Helpers {
    // stage strings
    static final String TitleString = "SHL Statistics Viewer";

    // menubar & labels strings
    static final String ViewString = "View";
    static final String SeasonString = "Season";
    static final String StandingsString = "Standings";
    static final String IndividualStatsString = "Individual Stats";
    static final String IndividualLeadersString = "Individual Leaders";
    static final String LeadersString = "Leaders";
    static final String RostersString = "Rosters";
    static final String GamesString = "Games";
    static final String ChangeSeasonString = "Change Season";
    static final String ChangeLeagueString = "Change League";
    static final String ToggleSeasonString = "Toggle Season";

    // team names
    static final String ColoradoMammothsTeamString = "Colorado Mammoths";
    static final String DetroitFalconsTeamString = "Detroit Falcons";
    static final String HalifaxRaidersTeamString = "Halifax Raiders";
    static final String KelownaKnightsTeamString = "Kelowna Knights";
    static final String MontrealMilitiaTeamString = "Montreal Militia";
    static final String PrinceGeorgeFirebirdsTeamString = "Prince George Firebirds";
    static final String StLouisScarecrowsTeamString = "St. Louis Scarecrows";
    static final String VancouverWhalersTeamString = "Vancouver Whalers";

    // individual leaders combo box strings
    static final String individualLeadersGoalsString = "Goals";
    static final String individualLeadersAssistsString = "Assist";
    static final String individualLeadersShotsString = "Shots";
    static final String individualLeadersShotPercentageString = "Shot %";
    static final String individualLeadersCentersString = "Centers";
    static final String individualLeadersLeftWingsString = "Left Wings";
    static final String individualLeadersRightWingsString = "Right Wings";
    static final String individualLeadersDefensemenString = "Defensemen";
    static final String individualLeadersPointsPer20String = "Points Per 20 Minutes";
    static final String individualLeadersFaceoffPercentageString = "Faceoff %";
    static final String individualLeadersPlusMinusString = "+/-";
    static final String individualLeadersPIMsString = "PIM";
    static final String individualLeadersShotBlocksString = "Shot Blocks";
    static final String individualLeadersRookiesString = "Rookies";
    static final String individualLeadersHitsString = "Hits";
    static final String individualLeadersPowerPlayGoalsString = "Power Play Goals";
    static final String individualLeadersShortHandedGoalsString = "Short Handed Goals";
    static final String individualLeadersGameWinningGoalsString = "Game Winning Goals";

    // common column names
    static final String RowNumberColumn = "#";
    static final String NameColumn = "Name";
    static final String PositionColumn = "Pos";
    static final String GamesPlayedColumn = "GP";
    static final String GoalsScoredColumn = "G";
    static final String AssistsScoredColumn = "A";
    static final String PointsScoredColumn = "P";
    static final String PlusMinusColumn = "+/-";
    static final String TotalPIMsColumn = "PIM";
    static final String FightingMajorsPIMsColumn = "PIM5";
    static final String HitsGivenColumn = "HIT";
    static final String HitsTakenColumn = "HTT";
    static final String ShotsTakenColumn = "SHT";
    static final String ShotsBlockedColumn = "SB";
    static final String MinutesPlayedColumn = "MP";
    static final String AverageMinutesPerGameColumn = "AMG";
    static final String PowerPlayGoalsScoredColumn = "PPG";
    static final String PowerPlayAssistsScoredColumn = "PPA";
    static final String PowerPlayShotsColumn = "PPS";
    static final String PowerPlayMinutesColumn = "PPM";

    // standings column names
    static final String TeamColumn = "Team";
    static final String WinsColumn = "W";
    static final String LossesColumn = "L";
    static final String OTLossesColumn = "OTL";
    static final String PointsColumn = "P";
    static final String GoalsForColumn = "GF";
    static final String GoalsAgainstColumn = "GA";

    // individual stats column names
    static final String PenaltyKillGoalsScoredColumn = "PKG";
    static final String PenaltyKillAssistsScoredColumn = "PKA";
    static final String PenaltyKillShotsColumn = "PKS";
    static final String PenaltyKillMinutesColumn = "PKM";
    static final String GameWinningGoalsColumn = "GWG";
    static final String GameTyingGoalsColumn = "GTG";
    static final String FaceOffPercentageColumn = "FO%";
    static final String FaceOffsTakenColumn = "FOT";
    static final String HatTricksColumn = "HT";

    // individual leader stats column names
    static final String PenaltyShotGoalsScoredColumn = "PGS";
    static final String TotalFightsColumn = "FT";
    static final String FightsWonColumn = "FW";
    static final String GoalScoringStreakColumn = "GS";

    // leader column names
    static final String ShootingPercentageColumn = "S%";

    // roster column names
    static final String CheckingColumn = "CK";
    static final String FightingColumn = "FG";
    static final String DisciplineColumn = "DI";
    static final String SkatingColumn = "SK";
    static final String StrengthColumn = "ST";
    static final String EnduranceColumn = "EN";
    static final String PuckHandlingColumn = "PH";
    static final String FaceOffsColumn = "FO";
    static final String PassingColumn = "PA";
    static final String ScoringColumn = "SC";
    static final String DefenseColumn = "DF";
    static final String PenaltyShotColumn = "PS";

    // individual columns strings
    static final String CentersColumn = "C";
    static final String LeftWingsColumn = "LW";
    static final String RightWingsColumn = "RW";
    static final String DefensemenColumn = "D";
    static final String PointsPer20MinsColumn = "P/20";
    static final String FaceoffPercentageColumn = "FO%";
    static final String RookiesColumn = "R";
    static final String ShortHandedGoalsColumn = "SHG";

    // label settings
    static final int PreferredLabelFontSize = 20;
    static final String PreferredLabelFontString = "Arial";

    // htmlStrings
    static final String IndividualStatsMammothsHTML = "STHS_JS_Team_ColoradoMammoths";
    static final String IndividualStatsFalconsHTML = "STHS_JS_Team_DetroitFalcons";
    static final String IndividualStatsRaidersHTML = "STHS_JS_Team_HalifaxRaiders";
    static final String IndividualStatsKnightsHTML = "STHS_JS_Team_KelownaKnights";
    static final String IndividualStatsMilitiaHTML = "STHS_JS_Team_MontrealMilitia";
    static final String IndividualStatsFirebirdsHTML = "STHS_JS_Team_PrinceGeorgeFirebirds";
    static final String IndividualStatsScarecrowsHTML = "STHS_JS_Team_St.LouisScarecrows";
    static final String IndividualStatsWhalersHTML = "STHS_JS_Team_VancouverWhalers";

    static final String RostersMammothsHTML = "STHS_JS_Team_ColoradoMammoths";
    static final String RostersFalconsHTML = "STHS_JS_Team_DetroitFalcons";
    static final String RostersRaidersHTML = "STHS_JS_Team_HalifaxRaiders";
    static final String RostersKnightsHTML = "STHS_JS_Team_KelownaKnights";
    static final String RostersMilitiaHTML = "STHS_JS_Team_MontrealMilitia";
    static final String RostersFirebirdsHTML = "STHS_JS_Team_PrinceGeorgeFirebirds";
    static final String RostersScarecrowsHTML = "STHS_JS_Team_St.LouisScarecrows";
    static final String RostersWhalersHTML = "STHS_JS_Team_VancouverWhalers";

    // html patterns
    static final String hrefLinkPattern = "href=\"(.*?)\"";
    static final String hrefTextPattern = ">(.*?)</a>";
    static final String gameLinkNumberPattern = "SMJHL-(.*?).html";

    // stage preferred sizes
    static final int stageHeight = 450;
    static final int stageWidth = 800;

    // hash maps
    static final HashMap<String, Integer> IndividualLeadersMap = new HashMap<>();
    static {
        IndividualLeadersMap.put(individualLeadersGoalsString, 8);
        IndividualLeadersMap.put(individualLeadersAssistsString, 9);
        IndividualLeadersMap.put(individualLeadersShotsString, 10);
        IndividualLeadersMap.put(individualLeadersShotPercentageString, 11);
        IndividualLeadersMap.put(individualLeadersCentersString, 12);
        IndividualLeadersMap.put(individualLeadersLeftWingsString, 13);
        IndividualLeadersMap.put(individualLeadersRightWingsString, 14);
        IndividualLeadersMap.put(individualLeadersDefensemenString, 15);
        IndividualLeadersMap.put(individualLeadersPointsPer20String, 16);
        IndividualLeadersMap.put(individualLeadersFaceoffPercentageString, 17);
        IndividualLeadersMap.put(individualLeadersPlusMinusString, 18);
        IndividualLeadersMap.put(individualLeadersPIMsString, 19);
        IndividualLeadersMap.put(individualLeadersShotBlocksString, 20);
        IndividualLeadersMap.put(individualLeadersRookiesString, 21);
        IndividualLeadersMap.put(individualLeadersHitsString, 22);
        IndividualLeadersMap.put(individualLeadersPowerPlayGoalsString, 23);
        IndividualLeadersMap.put(individualLeadersShortHandedGoalsString, 24);
        IndividualLeadersMap.put(individualLeadersGameWinningGoalsString, 25);
    }

    static final HashMap<String, String> IndividualLeadersColumnsMap = new HashMap<>();
    static {
        IndividualLeadersColumnsMap.put(individualLeadersGoalsString, GoalsScoredColumn);
        IndividualLeadersColumnsMap.put(individualLeadersAssistsString, AssistsScoredColumn);
        IndividualLeadersColumnsMap.put(individualLeadersShotsString, ShotsTakenColumn);
        IndividualLeadersColumnsMap.put(individualLeadersShotPercentageString, ShootingPercentageColumn);
        IndividualLeadersColumnsMap.put(individualLeadersCentersString, CentersColumn);
        IndividualLeadersColumnsMap.put(individualLeadersLeftWingsString, LeftWingsColumn);
        IndividualLeadersColumnsMap.put(individualLeadersRightWingsString, RightWingsColumn);
        IndividualLeadersColumnsMap.put(individualLeadersDefensemenString, DefensemenColumn);
        IndividualLeadersColumnsMap.put(individualLeadersPointsPer20String, PointsPer20MinsColumn);
        IndividualLeadersColumnsMap.put(individualLeadersFaceoffPercentageString, FaceoffPercentageColumn);
        IndividualLeadersColumnsMap.put(individualLeadersPlusMinusString, PlusMinusColumn);
        IndividualLeadersColumnsMap.put(individualLeadersPIMsString, TotalPIMsColumn);
        IndividualLeadersColumnsMap.put(individualLeadersShotBlocksString, ShotsBlockedColumn);
        IndividualLeadersColumnsMap.put(individualLeadersRookiesString, RookiesColumn);
        IndividualLeadersColumnsMap.put(individualLeadersHitsString, HitsGivenColumn);
        IndividualLeadersColumnsMap.put(individualLeadersPowerPlayGoalsString, PowerPlayGoalsScoredColumn);
        IndividualLeadersColumnsMap.put(individualLeadersShortHandedGoalsString, ShortHandedGoalsColumn);
        IndividualLeadersColumnsMap.put(individualLeadersGameWinningGoalsString, GameWinningGoalsColumn);
    }

    // helper methods
    static void println(Object msg) {
        System.out.println(msg);
    }

    static int parseGameNumber(String gameString) {
        String[] s = gameString.split(":");
        return Integer.parseInt(s[0]);
    }


// 1 - Francesco Bellucci (DET
//  2 - Samuel McVay (DET
//  3 - Viktor Marius (DET
    static String parsePlayerName(String starString) {
        String[] firstSplit = starString.split("-");
        String[] secondSplit = firstSplit[1].split("\\(");
        return secondSplit[0];
    }

    static String parsePlayerTeam(String starString) {
        String[] firstSplit = starString.split("\\(");
        return firstSplit[1];
    }
}

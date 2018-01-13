package com.shl;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SHLScraper {


    public static TeamStandingsObject[] getStandingsArray(int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-ProStanding.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element overallStandingsDiv = d.getElementById("tabmain4");
        Element overallStandingsTable = overallStandingsDiv.select("table").get(0);
        Elements rows = overallStandingsTable.select("tr");
        TeamStandingsObject[] standings = new TeamStandingsObject[8];

        int ordering = 0;
        for (Element row : rows) {
            if (ordering == 0) {
                ordering++;
                continue;
            }
            ordering++;
            String[] columnValues = new String[14];
            Elements cols = row.select("td");
            for (int i = 0; i < 14; i++) {
                columnValues[i] = cols.get(i).text();
            }
            TeamStandingsObject team = new TeamStandingsObject(columnValues[1], Integer.parseInt(columnValues[2]), Integer.parseInt(columnValues[3]), Integer.parseInt(columnValues[4]), Integer.parseInt(columnValues[5]), Integer.parseInt(columnValues[6]), Integer.parseInt(columnValues[7]), Integer.parseInt(columnValues[8]));
            standings[ordering - 2] = team;
        }

        return standings;
    }

    public static TeamScoringObject[] getTeamScoringArray(String team, int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-ProTeamScoring.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String teamHTML = "";
        if (team.equals(Helpers.ColoradoMammothsTeamString)) {
            teamHTML = Helpers.IndividualStatsMammothsHTML;
        } else if (team.equals(Helpers.DetroitFalconsTeamString)) {
            teamHTML = Helpers.IndividualStatsFalconsHTML;
        } else if (team.equals(Helpers.HalifaxRaidersTeamString)) {
            teamHTML = Helpers.IndividualStatsRaidersHTML;
        } else if (team.equals(Helpers.KelownaKnightsTeamString)) {
            teamHTML = Helpers.IndividualStatsKnightsHTML;
        } else if (team.equals(Helpers.MontrealMilitiaTeamString)) {
            teamHTML = Helpers.IndividualStatsMilitiaHTML;
        } else if (team.equals(Helpers.PrinceGeorgeFirebirdsTeamString)) {
            teamHTML = Helpers.IndividualStatsFirebirdsHTML;
        } else if (team.equals(Helpers.StLouisScarecrowsTeamString)) {
            teamHTML = Helpers.IndividualStatsScarecrowsHTML;
        } else if (team.equals(Helpers.VancouverWhalersTeamString)) {
            teamHTML = Helpers.IndividualStatsWhalersHTML;
        } else {
            System.err.println("Error getting scoring HTML");
            System.exit(1);
        }

        try {
            Element teamScoringDiv = d.getElementById(teamHTML);
            Element teamScoringTable1 = teamScoringDiv.select("table").get(0);
            Elements rows1 = teamScoringTable1.select("tr");
            Element teamScoringTable2 = teamScoringDiv.select("table").get(1);
            Elements rows2 = teamScoringTable2.select("tr");

            ArrayList<TeamScoringObject> scoring = new ArrayList<>();

            int ordering = 0;
            for (Element element : rows1) {
                if (ordering == 0) {
                    ordering++;
                    continue;
                }
                ordering++;
                TeamScoringObject obj = new TeamScoringObject();
                Elements cols1 = element.select("td");

                obj.setPlayerName(cols1.get(0).text()); // 0
                if (cols1.get(1).text().equals("X")) {
                    obj.setPlayerPos("F"); // 1
                } else {
                    obj.setPlayerPos("D"); // 2
                }
                obj.setGamesPlayed(Integer.parseInt(cols1.get(3).text())); // 3
                obj.setGoalsScored(Integer.parseInt(cols1.get(4).text())); // 4
                obj.setAssistsScored(Integer.parseInt(cols1.get(5).text())); // 5
                obj.setPointsScored(Integer.parseInt(cols1.get(6).text())); // 6
                obj.setPlusMinus(Integer.parseInt(cols1.get(7).text())); // 7
                obj.setTotalPIMs(Integer.parseInt(cols1.get(8).text())); // 8
                obj.setTotalFightingMajorsPIMs(Integer.parseInt(cols1.get(9).text())); // 9
                obj.setHitsGiven(Integer.parseInt(cols1.get(10).text())); // 10
                obj.setHitsTaken(Integer.parseInt(cols1.get(11).text())); // 11
                obj.setShotsTaken(Integer.parseInt(cols1.get(12).text())); // 12
                obj.setShotsBlocked(Integer.parseInt(cols1.get(16).text())); // 16
                obj.setMinutesPlayed(Integer.parseInt(cols1.get(17).text())); // 17
                obj.setAverageMinutesPerGame(cols1.get(18).text()); // 18
                obj.setPowerPlayGoalsScored(Integer.parseInt(cols1.get(19).text())); // 19
                obj.setPowerPlayAssistsScored(Integer.parseInt(cols1.get(20).text())); // 20
                obj.setPowerPlayShots(Integer.parseInt(cols1.get(22).text())); // 22
                obj.setPowerPlayMinutes(Integer.parseInt(cols1.get(23).text())); // 23
                obj.setPenaltyKillGoalsScored(Integer.parseInt(cols1.get(24).text())); // 24
                obj.setPenaltyKillAssistsScored(Integer.parseInt(cols1.get(25).text())); // 25
                obj.setPenaltyKillShots(Integer.parseInt(cols1.get(27).text())); // 27
                obj.setPenaltyKillMinutes(Integer.parseInt(cols1.get(28).text())); // 28
                scoring.add(obj);
            }

            ordering = 0;
            for (Element element : rows2) {
                if (ordering == 0) {
                    ordering++;
                    continue;
                }
                ordering++;
                Elements cols2 = element.select("td");


                TeamScoringObject obj = scoring.get(ordering - 2);
                obj.setGameWinningGoals(Integer.parseInt(cols2.get(3).text())); // 3
                obj.setGameTyingGoals(Integer.parseInt(cols2.get(4).text())); // 4
                obj.setFaceoffPercentage(cols2.get(5).text()); // 5
                obj.setFaceoffsTaken(Integer.parseInt(cols2.get(6).text())); // 6
                obj.setHatTricks(Integer.parseInt(cols2.get(10).text())); // 10
            }
            TeamScoringObject[] scoringArray = new TeamScoringObject[scoring.size()];

            for (int i = 0; i < scoringArray.length; i++) {
                scoringArray[i] = scoring.get(i);
            }
            return scoringArray;
        } catch (Exception e) {
            e.printStackTrace();
            return new TeamScoringObject[1];
        }
    }

    public static IndividualLeagueLeadersObject[] getIndividualLeadersArray(String statistic, int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-ProIndividualLeaders.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int tableToGet = Helpers.IndividualLeadersMap.get(statistic);
        Element individualScoringTable = d.select("table").get(tableToGet);
        Elements individualPlayerStatistics = individualScoringTable.select("tr");

        ArrayList<IndividualLeagueLeadersObject> individualLeagueLeadersList = new ArrayList<>();
        int ordering = 0;
        for (Element individualPlayerStatistic : individualPlayerStatistics) {
            if (ordering == 0 || ordering == 1) {
                ordering++;
                continue;
            }
            ordering++;
            IndividualLeagueLeadersObject obj = new IndividualLeagueLeadersObject();
            Elements cols = individualPlayerStatistic.select("td");
            obj.setPositionOnList(Integer.parseInt(cols.get(0).text()));
            obj.setPlayerName(cols.get(1).text());
            obj.setGamesPlayed(Integer.parseInt(cols.get(2).text()));
            obj.setStatResult(cols.get(3).text());
            individualLeagueLeadersList.add(obj);
        }
        IndividualLeagueLeadersObject[] individualLeagueLeadersArray = new IndividualLeagueLeadersObject[individualLeagueLeadersList.size()];

        for (int i = 0; i < individualLeagueLeadersArray.length; i++) {
            individualLeagueLeadersArray[i] = individualLeagueLeadersList.get(i);
        }

        return individualLeagueLeadersArray;
    }

    public static LeadersObject[] getLeadersArray(int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-ProLeaders.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element leaderTable = d.select("table").get(7);
        Elements rows = leaderTable.select("tr");

        ArrayList<LeadersObject> leadersList = new ArrayList<>();
        int ordering = 0;
        for (Element row : rows) {
            if (ordering == 0) {
                ordering++;
                continue;
            }
            ordering++;
            LeadersObject obj = new LeadersObject();
            Elements cols = row.select("td");
            obj.setPositionOnList(Integer.parseInt(cols.get(0).text()));
            obj.setPlayerName(cols.get(1).text());
            if (cols.get(2).text().equals("X")) {
                obj.setPlayerPosition("F");
            } else {
                obj.setPlayerPosition("D");
            }
            obj.setGamesPlayed(Integer.parseInt(cols.get(4).text()));
            obj.setGoalsScored(Integer.parseInt(cols.get(5).text()));
            obj.setAssistsScored(Integer.parseInt(cols.get(6).text()));
            obj.setPointsScored(Integer.parseInt(cols.get(7).text()));
            obj.setPlusMinus(Integer.parseInt(cols.get(8).text()));
            obj.setTotalPIMsScored(Integer.parseInt(cols.get(9).text()));
            obj.setFightingMajorsPIMs(Integer.parseInt(cols.get(10).text()));
            obj.setHitsGiven(Integer.parseInt(cols.get(11).text()));
            obj.setHitsTaken(Integer.parseInt(cols.get(12).text()));
            obj.setShotPercentage(cols.get(16).text());
            obj.setShotsTaken(Integer.parseInt(cols.get(13).text()));
            obj.setShotsBlocked(Integer.parseInt(cols.get(17).text()));
            obj.setMinutesPlayed(Integer.parseInt(cols.get(18).text()));
            obj.setAverageMinutesPlayed(Float.parseFloat(cols.get(19).text()));
            obj.setPowerPlayGoals(Integer.parseInt(cols.get(20).text()));
            obj.setPowerPlayAssists(Integer.parseInt(cols.get(21).text()));
            obj.setPowerPlayShots(Integer.parseInt(cols.get(23).text()));
            obj.setPowerPlayMinutes(Integer.parseInt(cols.get(24).text()));
            obj.setPenaltyKillMinutes(Integer.parseInt(cols.get(29).text()));

            leadersList.add(obj);
        }

        LeadersObject[] leadersArray = new LeadersObject[leadersList.size()];

        for (int i = 0; i < leadersArray.length; i++) {
            leadersArray[i] = leadersList.get(i);
        }

        return leadersArray;
    }

    public static RosterObject[] getRostersArray(String team, int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-ProTeamRoster.html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String teamHTML = "";
        if (team.equals(Helpers.ColoradoMammothsTeamString)) {
            teamHTML = Helpers.RostersMammothsHTML;
        } else if (team.equals(Helpers.DetroitFalconsTeamString)) {
            teamHTML = Helpers.RostersFalconsHTML;
        } else if (team.equals(Helpers.HalifaxRaidersTeamString)) {
            teamHTML = Helpers.RostersRaidersHTML;
        } else if (team.equals(Helpers.KelownaKnightsTeamString)) {
            teamHTML = Helpers.RostersKnightsHTML;
        } else if (team.equals(Helpers.MontrealMilitiaTeamString)) {
            teamHTML = Helpers.RostersMilitiaHTML;
        } else if (team.equals(Helpers.PrinceGeorgeFirebirdsTeamString)) {
            teamHTML = Helpers.RostersFirebirdsHTML;
        } else if (team.equals(Helpers.StLouisScarecrowsTeamString)) {
            teamHTML = Helpers.RostersScarecrowsHTML;
        } else if (team.equals(Helpers.VancouverWhalersTeamString)) {
            teamHTML = Helpers.RostersWhalersHTML;
        } else {
            System.err.println("Error getting scoring HTML");
            System.exit(1);
        }

        try {
            Element rosterDiv = d.getElementById(teamHTML);
            Element rosterTable = rosterDiv.select("table").get(1);
            Elements rows = rosterTable.select("tr");

            ArrayList<RosterObject> rosterList = new ArrayList<>();
            int ordering = 0;
            for (Element row : rows) {
                if (ordering == 0) {
                    ordering++;
                    continue;
                }
                ordering++;
                RosterObject obj = new RosterObject();
                Elements cols = row.select("td");
                obj.setPlayerName(cols.get(1).text());
                if (cols.get(2).text().equals("X")) {
                    obj.setPlayerPosition("C");
                } else if (cols.get(3).text().equals("X")) {
                    obj.setPlayerPosition("LW");
                } else if (cols.get(4).text().equals("X")) {
                    obj.setPlayerPosition("RW");
                } else {
                    obj.setPlayerPosition("D");
                }
                obj.setCheckingStat(Integer.parseInt(cols.get(8).text()));
                obj.setFightingStat(Integer.parseInt(cols.get(9).text()));
                obj.setDisciplineStat(Integer.parseInt(cols.get(10).text()));
                obj.setSkatingStat(Integer.parseInt(cols.get(11).text()));
                obj.setStrengthStat(Integer.parseInt(cols.get(12).text()));
                obj.setEnduranceStat(Integer.parseInt(cols.get(13).text()));
                obj.setPuckHandlingStat(Integer.parseInt(cols.get(15).text()));
                obj.setFaceoffStat(Integer.parseInt(cols.get(16).text()));
                obj.setPassingStat(Integer.parseInt(cols.get(17).text()));
                obj.setScoringStat(Integer.parseInt(cols.get(18).text()));
                obj.setDefenseStat(Integer.parseInt(cols.get(19).text()));
                obj.setPenaltyShotStat(Integer.parseInt(cols.get(20).text()));
                rosterList.add(obj);
            }

            RosterObject[] rosterArray = new RosterObject[rosterList.size()];

            for (int i = 0; i < rosterArray.length; i++) {
                rosterArray[i] = rosterList.get(i);
            }
            return rosterArray;
        } catch (Exception e) {
            e.printStackTrace();
            return new RosterObject[1];
        }
    }

    public static GameObject[] getGamesArray(int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://theshl.b1.jcink.com/index.php?showtopic=85073").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element gamesHTML = d.getElementById("pid_2372711");
        Element gamesDiv = gamesHTML.select("div").get(0);
        Elements gamesLinks = gamesDiv.select("a[href]");
        ArrayList<Element> linksArrayList = new ArrayList<>();
        for (Element gamesLink : gamesLinks) {
            if (gamesLink.toString().matches(".*http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-[0-9]+.html.*")) {
                linksArrayList.add(gamesLink);
            }
        }

        ArrayList<GameObject> gamesList = new ArrayList<>();
        linksArrayList.forEach(e -> {
            String thing = e.toString();

            Pattern p = Pattern.compile(Helpers.hrefLinkPattern);
            Matcher m = p.matcher(thing);
            String gameLink = null;
            if (m.find()) {
                gameLink = m.group();
            }
            gameLink = gameLink.replace("href=\"", "");
            gameLink = gameLink.replace("\"", "");
//            String[] linkSplits = gameLink.split("\"");

            Pattern p2 = Pattern.compile(Helpers.hrefTextPattern);
            Matcher m2 = p2.matcher(thing);
            String gameText = null;
            if (m2.find()) {
                gameText = m2.group();
            }
            gameText = gameText.replace(">", "");
            gameText = gameText.replace("</a", "");

            Pattern p3 = Pattern.compile(Helpers.gameLinkNumberPattern);
            Matcher m3 = p3.matcher(thing);
            String gameNumber = null;
            if (m3.find()) {
                gameNumber = m3.group();
            }
            gameNumber = gameNumber.replace("SMJHL-", "");
            gameNumber = gameNumber.replace(".html", "");

            GameObject obj = new GameObject(gameLink, gameText, gameNumber);
            gamesList.add(obj);
        });

        GameObject[] gamesArray = new GameObject[gamesList.size()];
        for (int i = 0; i < gamesList.size(); i++) {
            gamesArray[i] = gamesList.get(i);
        }

        return gamesArray;
    }

    public static SingleGame getSingleGame(int gameNumber, int seasonNumber) {
        Document d = null;
        try {
            d = Jsoup.connect("http://www.smjhlstuff.wtgbear.com/S" + seasonNumber + "Reg/SMJHL-" + gameNumber + ".html").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // d should contain the game HTML
        Element goalsTable = d.select(".STHSGame_GoalsTable").get(0);
        Elements rows = goalsTable.select("tr");

        String leftTeamScore = rows.select(".STHSGame_GoalsTotal").get(0).text();
        String rightTeamScore = rows.select(".STHSGame_GoalsTotal").get(1).text();
        String leftTeamName = rows.select(".STHSGame_GoalsTeamName").get(0).text();
        String rightTeamName = rows.select(".STHSGame_GoalsTeamName").get(1).text();
        String leftTeamStatsHTML = d.select(".STHSGame_PlayerStatTable").get(0).html();
        String rightTeamStatsHMTL = d.select(".STHSGame_PlayerStatTable").get(1).html();


        Element threeStarsDiv = d.select(".STHSGame_3Star").get(0);
        String threeStarsString = threeStarsDiv.text();
        String[] starsArray = threeStarsString.split("\\)");


        StarPlayer star1 = new StarPlayer();
        star1.setName(Helpers.parsePlayerName(starsArray[0]));
        star1.setTeam(Helpers.parsePlayerTeam(starsArray[0]));
        StarPlayer star2 = new StarPlayer();
        star2.setName(Helpers.parsePlayerName(starsArray[1]));
        star2.setTeam(Helpers.parsePlayerTeam(starsArray[1]));
        StarPlayer star3 = new StarPlayer();
        star3.setName(Helpers.parsePlayerName(starsArray[2]));
        star3.setTeam(Helpers.parsePlayerTeam(starsArray[2]));

        SingleGame game = new SingleGame();
        game.setStar1(star1);
        game.setStar2(star2);
        game.setStar3(star3);
        game.setLeftTeamScore(leftTeamScore);
        game.setRightTeamScore(rightTeamScore);
        game.setLeftTeamName(leftTeamName);
        game.setRightTeamName(rightTeamName);
//        game.setGameStatsString(leftTeamStatsString + "\n\n" + rightTeamStatsString);
        game.setGameStatsString(leftTeamName + "<br>" + leftTeamStatsHTML + rightTeamName + "<br>" + rightTeamStatsHMTL);

        return game;
    }
}
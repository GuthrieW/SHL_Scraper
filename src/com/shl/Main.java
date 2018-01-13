package com.shl;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Optional;

public class Main extends Application {

    private Scene wholeScene;

    private Stage window;

    private MenuBar menuBar;

    private Menu changeScene;
    private Menu changeSeason;

    private ComboBox<String> individualStatsComboBox;
    private ComboBox<String> individualLeadersComboBox;
    private ComboBox<String> rosterComboBox;
    private ComboBox<String> gamesComboBox;

    private TableView<TeamStandingsObject> standingsTableView;
    private TableView<TeamScoringObject> individualStatsTableView;
    private TableView<IndividualLeagueLeadersObject> individualLeadersTableView;
    private TableView<LeadersObject> leadersTableView;
    private TableView<RosterObject> rosterTableView;

    private TableColumn standingsTeamNameColumn;
    private TableColumn standingsGamesPlayedColumn;
    private TableColumn standingsWinsColumn;
    private TableColumn standingsLossesColumn;
    private TableColumn standingsOTLossesColumn;
    private TableColumn standingsTotalPointsColumn;
    private TableColumn standingsGoalsForColumn;
    private TableColumn standingsGoalsAgainstColumn;

    private TableColumn individualStatsNameColumn;
    private TableColumn individualStatsPositionColumn;
    private TableColumn individualStatsGamesPlayedColumn;
    private TableColumn individualStatsGoalsScoredColumn;
    private TableColumn individualStatsAssistsScoredColumn;
    private TableColumn individualStatsPointsScoredColumn;
    private TableColumn individualStatsPlusMinusColumn;
    private TableColumn individualStatsTotalPIMsColumn;
    private TableColumn individualStatsFightingMajorsPIMsColumn;
    private TableColumn individualStatsHitsGivenColumn;
    private TableColumn individualStatsHitsTakenColumn;
    private TableColumn individualStatsShotsTakenColumn;
    private TableColumn individualStatsShotsBlockedColumn;
    private TableColumn individualStatsMinutesPlayedColumn;
    private TableColumn individualStatsMinutesPerGameColumn;
    private TableColumn individualStatsPowerPlayGoalsScoredColumn;
    private TableColumn individualStatsPowerPlayAssistsScoredColumn;
    private TableColumn individualStatsPowerPlayShotsColumn;
    private TableColumn individualStatsPowerPlayMinutesColumn;
    private TableColumn individualStatsPenaltyKillGoalsScoredColumn;
    private TableColumn individualStatsPenaltyKillAssistsScoredColumn;
    private TableColumn individualStatsPenaltyKillShotsColumn;
    private TableColumn individualStatsPenaltyKillMinutesColumn;
    private TableColumn individualStatsGameWinningGoalsColumn;
    private TableColumn individualStatsGameTyingGoalsColumn;
    private TableColumn individualStatsFaceoffPercentageColumn;
    private TableColumn individualStatsFaceoffsTakenColumn;
    private TableColumn individualStatsHatTricksColumn;

    private TableColumn individualLeadersRowNumberColumn;
    private TableColumn individualLeadersNameColumn;
    private TableColumn individualLeadersGamesPlayedColumn;
    private TableColumn individualLeadersStatColumn;

    private TableColumn leaderNameColumn;
    private TableColumn leaderPositionColumn;
    private TableColumn leaderGamesPlayedColumn;
    private TableColumn leaderGoalsScoredColumn;
    private TableColumn leaderAssistsScoredColumn;
    private TableColumn leaderPointsScoredColumn;
    private TableColumn leaderPlusMinusColumn;
    private TableColumn leaderTotalPIMsColumn;
    private TableColumn leaderFightingMajorsPIMsColumn;
    private TableColumn leaderHitsGivenColumn;
    private TableColumn leaderHitsTakenColumn;
    private TableColumn leaderShootingPercentageColumn;
    private TableColumn leaderShotsTakenColumn;
    private TableColumn leaderShotsBlockedColumn;
    private TableColumn leaderMinutesPlayedColumn;
    private TableColumn leaderAverageMinutesPerGameColumn;
    private TableColumn leaderPowerPlayGoalsScoredColumn;
    private TableColumn leaderPowerPlayAssistsScoredColumn;
    private TableColumn leaderPowerPlayShotsColumn;
    private TableColumn leaderPowerPlayMinutesColumn;
    private TableColumn leaderPenaltyKillMinutesColumn;

    private TableColumn rosterNameColumn;
    private TableColumn rosterPositionColumn;
    private TableColumn rosterCheckingColumn;
    private TableColumn rosterFightingColumn;
    private TableColumn rosterDisciplineColumn;
    private TableColumn rosterSkatingColumn;
    private TableColumn rosterStrengthColumn;
    private TableColumn rosterEnduranceColumn;
    private TableColumn rosterPuckHandlingColumn;
    private TableColumn rosterFaceoffsColumn;
    private TableColumn rosterPassingColumn;
    private TableColumn rosterScoringColumn;
    private TableColumn rosterDefenseColumn;
    private TableColumn rosterPenaltyShotColumn;

    private Label standingsLabel;
    private Label individualStatsLabel;
    private Label individualLeadersLabel;
    private Label leadersLabel;
    private Label rostersLabel;
    private Label gamesListLabel;
    private Label star1TeamLabel;
    private Label star1NameLabel;
    private Label star2TeamLabel;
    private Label star2NameLabel;
    private Label star3TeamLabel;
    private Label star3NameLabel;
    private Label scoreLabel;
    private Label star1Label;
    private Label star2Label;
    private Label star3Label;

    private BorderPane wholeSceneLayout;
    private BorderPane gamesSceneLayout;

    private VBox standingsLayout;
    private VBox individualStatsLayout;
    private VBox individualLeadersLayout;
    private VBox leadersLayout;
    private VBox rosterLayout;
//    private VBox gamesListLayout;
    private VBox gameStatsLayout;
    private VBox star1Layout;
    private VBox star2Layout;
    private VBox star3Layout;
    private VBox statsVBox;
    private VBox scoreLayout;

    private HBox starsLayout;
    private HBox teamStatsLayout;

    private StarPlayer star1;
    private StarPlayer star2;
    private StarPlayer star3;

    private WebView statsWebView;

    private int seasonNumber = 38;


    public static void main(String[] args) {
        try {
            Main runProgram = new Main();
            runProgram.launch(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        // set menu
        changeScene = new Menu(Helpers.ViewString);
        MenuItem standingsMenuItem = new MenuItem(Helpers.StandingsString);
        standingsMenuItem.setOnAction(e -> {
            createStandingsScene();
            wholeSceneLayout.setCenter(standingsLayout);
        });

        MenuItem individualStatsMenuItem = new MenuItem(Helpers.IndividualStatsString);
        individualStatsMenuItem.setOnAction(e -> {
            createIndividualStatsScene();
            wholeSceneLayout.setCenter(individualStatsLayout);
        });

        MenuItem individualLeadersMenuItem = new MenuItem(Helpers.IndividualLeadersString);
        individualLeadersMenuItem.setOnAction(e -> {
            createIndividualLeadersScene();
            wholeSceneLayout.setCenter(individualLeadersLayout);
        });

        MenuItem leadersMenuItem = new MenuItem(Helpers.LeadersString);
        leadersMenuItem.setOnAction(e -> {
            createLeadersScene();
            wholeSceneLayout.setCenter(leadersLayout);
        });

        MenuItem rosterMenuItem = new MenuItem(Helpers.RostersString);
        rosterMenuItem.setOnAction(e -> {
            createRostersScene();
            wholeSceneLayout.setCenter(rosterLayout);
        });

        MenuItem gameMenuItem = new MenuItem(Helpers.GamesString);
        gameMenuItem.setOnAction(e -> {
            createGamesScene();
            wholeSceneLayout.setCenter(gameStatsLayout);
        });

        changeScene.getItems().addAll(
                standingsMenuItem,
                individualStatsMenuItem,
                individualLeadersMenuItem,
                leadersMenuItem,
                rosterMenuItem,
                gameMenuItem
        );

        changeSeason = new Menu(Helpers.SeasonString);
        MenuItem changeSeasonMenuItem = new MenuItem(Helpers.ChangeSeasonString);
        changeSeasonMenuItem.setOnAction(e -> {
            int finalResult = 38;
            boolean runAgain;
            do {
                runAgain = false;
                TextInputDialog dialog = new TextInputDialog("Season Number");
                dialog.setTitle("Season Number");
                dialog.setHeaderText("Enter the season number you want to view");
                dialog.setContentText("Remember the season number must be at least 38");
                Optional<String> result = dialog.showAndWait();
                if (result.isPresent()) {
                    String strResult = result.get();
                    try {
                        int intResult = Integer.parseInt(strResult);
                        if (intResult < 38) {
                            runAgain = true;
                        }
                        finalResult = intResult;
                    } catch (Exception exc) {
                        exc.printStackTrace();
                        runAgain = true;
                    }
                }
            } while (runAgain);
            seasonNumber = finalResult;

            createStandingsScene();
            createIndividualStatsScene();
            createIndividualLeadersScene();
            createLeadersScene();
            createRostersScene();
            createGamesScene();
        });

        changeSeason.getItems().addAll(
                changeSeasonMenuItem
        );

        menuBar = new MenuBar();
        menuBar.setUseSystemMenuBar(true);
        menuBar.getMenus().addAll(
                changeScene,
                changeSeason
        );

        // create scenes
        try {
            createStandingsScene();
            createIndividualStatsScene();
            createIndividualLeadersScene();
            createLeadersScene();
            createRostersScene();
            createGamesScene();
        } catch (Exception e) {
            e.printStackTrace();
            Alert exceptionAlert = new Alert(Alert.AlertType.ERROR);
            exceptionAlert.setTitle("Bad Connection");
            exceptionAlert.setHeaderText("Index Timeout");
            exceptionAlert.setContentText("The connection to the index timed out.\nPlease ensure the SHL website is up and that your internet connection is not experiencing issues.");
            exceptionAlert.showAndWait();
            System.exit(1);
        }

        // set beginning stage
        wholeSceneLayout = new BorderPane();
        wholeSceneLayout.setTop(menuBar);
        wholeSceneLayout.setCenter(standingsLayout);
        wholeScene = new Scene(wholeSceneLayout);

        primaryStage.setTitle(Helpers.TitleString);
        primaryStage.setScene(wholeScene);
        primaryStage.setHeight(Helpers.stageHeight);
        primaryStage.setWidth(Helpers.stageWidth);
        primaryStage.show();
    }

    private void createStandingsScene() {
        // set standings scene
        standingsLayout = new VBox();
        standingsLabel = new Label(Helpers.StandingsString);
        standingsLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        standingsTableView = new TableView<>();
        standingsTableView.setTableMenuButtonVisible(true);

        standingsTeamNameColumn = new TableColumn(Helpers.TeamColumn);
        standingsGamesPlayedColumn = new TableColumn(Helpers.GamesPlayedColumn);
        standingsWinsColumn = new TableColumn(Helpers.WinsColumn);
        standingsLossesColumn = new TableColumn(Helpers.LossesColumn);
        standingsOTLossesColumn = new TableColumn(Helpers.OTLossesColumn);
        standingsTotalPointsColumn = new TableColumn(Helpers.PointsColumn);
        standingsGoalsForColumn = new TableColumn(Helpers.GoalsForColumn);
        standingsGoalsAgainstColumn = new TableColumn(Helpers.GoalsAgainstColumn);

        TeamStandingsObject[] standingsArray = SHLScraper.getStandingsArray(seasonNumber);
        ObservableList<TeamStandingsObject> standingsList = FXCollections.observableList(Arrays.asList(standingsArray));

        standingsTeamNameColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, String>("teamName"));
        standingsGamesPlayedColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("gamesPlayed"));
        standingsWinsColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("wins"));
        standingsLossesColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("losses"));
        standingsOTLossesColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("otLosses"));
        standingsTotalPointsColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("totalPoints"));
        standingsGoalsForColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("goalsFor"));
        standingsGoalsAgainstColumn.setCellValueFactory(new PropertyValueFactory<TeamStandingsObject, Integer>("goalsAgainst"));

        standingsTableView.setItems(standingsList);

        standingsTableView.getColumns().addAll(
                standingsTeamNameColumn,
                standingsGamesPlayedColumn,
                standingsWinsColumn,
                standingsLossesColumn,
                standingsOTLossesColumn,
                standingsTotalPointsColumn,
                standingsGoalsForColumn,
                standingsGoalsAgainstColumn
        );

        standingsLayout.getChildren().addAll(
                standingsLabel,
                standingsTableView
        );
    }

    private void createIndividualStatsScene() {
        // set individual stats scene
        individualStatsLayout = new VBox();
        individualStatsLabel = new Label(Helpers.IndividualStatsString);
        individualStatsLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        individualStatsComboBox = new ComboBox<>();
        individualStatsComboBox.getItems().addAll(
                Helpers.ColoradoMammothsTeamString,
                Helpers.DetroitFalconsTeamString,
                Helpers.HalifaxRaidersTeamString,
                Helpers.KelownaKnightsTeamString,
                Helpers.MontrealMilitiaTeamString,
                Helpers.PrinceGeorgeFirebirdsTeamString,
                Helpers.StLouisScarecrowsTeamString,
                Helpers.VancouverWhalersTeamString
        );
        individualStatsComboBox.setValue(Helpers.ColoradoMammothsTeamString);
        individualStatsComboBox.setOnAction(e -> {
                    TeamScoringObject[] teamScoringUpdate = SHLScraper.getTeamScoringArray(individualStatsComboBox.getValue(), seasonNumber);
                    ObservableList<TeamScoringObject> updateList = FXCollections.observableList(Arrays.asList(teamScoringUpdate));
                    individualStatsTableView.setItems(updateList);
                }
        );

        individualStatsTableView = new TableView<>();
        individualStatsTableView.setTableMenuButtonVisible(true);
        individualStatsNameColumn = new TableColumn(Helpers.NameColumn);
        individualStatsPositionColumn = new TableColumn(Helpers.PositionColumn);
        individualStatsGamesPlayedColumn = new TableColumn(Helpers.GamesPlayedColumn);
        individualStatsGoalsScoredColumn = new TableColumn(Helpers.GoalsScoredColumn);
        individualStatsAssistsScoredColumn = new TableColumn(Helpers.AssistsScoredColumn);
        individualStatsPointsScoredColumn = new TableColumn(Helpers.PointsScoredColumn);
        individualStatsPlusMinusColumn = new TableColumn(Helpers.PlusMinusColumn);
        individualStatsTotalPIMsColumn = new TableColumn(Helpers.TotalPIMsColumn);
        individualStatsFightingMajorsPIMsColumn = new TableColumn(Helpers.FightingMajorsPIMsColumn);
        individualStatsHitsGivenColumn = new TableColumn(Helpers.HitsGivenColumn);
        individualStatsHitsTakenColumn = new TableColumn(Helpers.HitsTakenColumn);
        individualStatsShotsTakenColumn = new TableColumn(Helpers.ShotsTakenColumn);
        individualStatsShotsBlockedColumn = new TableColumn(Helpers.ShotsBlockedColumn);
        individualStatsMinutesPlayedColumn = new TableColumn(Helpers.MinutesPlayedColumn);
        individualStatsMinutesPerGameColumn = new TableColumn(Helpers.AverageMinutesPerGameColumn);
        individualStatsPowerPlayGoalsScoredColumn = new TableColumn(Helpers.PowerPlayGoalsScoredColumn);
        individualStatsPowerPlayAssistsScoredColumn = new TableColumn(Helpers.PowerPlayAssistsScoredColumn);
        individualStatsPowerPlayShotsColumn = new TableColumn(Helpers.PowerPlayShotsColumn);
        individualStatsPowerPlayMinutesColumn = new TableColumn(Helpers.PowerPlayMinutesColumn);
        individualStatsPenaltyKillGoalsScoredColumn = new TableColumn(Helpers.PenaltyKillGoalsScoredColumn);
        individualStatsPenaltyKillAssistsScoredColumn = new TableColumn(Helpers.PenaltyKillAssistsScoredColumn);
        individualStatsPenaltyKillShotsColumn = new TableColumn(Helpers.PenaltyKillShotsColumn);
        individualStatsPenaltyKillMinutesColumn = new TableColumn(Helpers.PenaltyKillMinutesColumn);
        individualStatsGameWinningGoalsColumn = new TableColumn(Helpers.GameWinningGoalsColumn);
        individualStatsGameTyingGoalsColumn = new TableColumn(Helpers.GameTyingGoalsColumn);
        individualStatsFaceoffPercentageColumn = new TableColumn(Helpers.FaceOffPercentageColumn);
        individualStatsFaceoffsTakenColumn = new TableColumn(Helpers.FaceOffsTakenColumn);
        individualStatsHatTricksColumn = new TableColumn(Helpers.HatTricksColumn);

        TeamScoringObject[] teamScoringArray = SHLScraper.getTeamScoringArray(individualStatsComboBox.getValue(), seasonNumber);
        ObservableList<TeamScoringObject> teamScoringList = FXCollections.observableList(Arrays.asList(teamScoringArray));

        individualStatsNameColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, String>("playerName"));
        individualStatsPositionColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, String>("playerPos"));
        individualStatsGamesPlayedColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("gamesPlayed"));
        individualStatsGoalsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("goalsScored"));
        individualStatsAssistsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("assistsScored"));
        individualStatsPointsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("pointsScored"));
        individualStatsPlusMinusColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("plusMinus"));
        individualStatsTotalPIMsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("totalPIMs"));
        individualStatsFightingMajorsPIMsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("totalFightingMajorsPIMs"));
        individualStatsHitsGivenColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("hitsGiven"));
        individualStatsHitsTakenColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("hitsTaken"));
        individualStatsShotsTakenColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("shotsTaken"));
        individualStatsShotsBlockedColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("shotsBlocked"));
        individualStatsMinutesPlayedColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("minutesPlayed"));
        individualStatsMinutesPerGameColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Float>("averageMinutesPerGame"));
        individualStatsPowerPlayGoalsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("powerPlayGoalsScored"));
        individualStatsPowerPlayAssistsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("powerPlayAssistsScored"));
        individualStatsPowerPlayShotsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("powerPlayShots"));
        individualStatsPowerPlayMinutesColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("powerPlayMinutes"));
        individualStatsPenaltyKillGoalsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("penaltyKillGoalsScored"));
        individualStatsPenaltyKillAssistsScoredColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("penaltyKillAssistsScored"));
        individualStatsPenaltyKillShotsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("penaltyKillShots"));
        individualStatsPenaltyKillMinutesColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("penaltyKillMinutes"));
        individualStatsGameWinningGoalsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("gameWinningGoals"));
        individualStatsGameTyingGoalsColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("gameTyingGoals"));
        individualStatsFaceoffPercentageColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Float>("faceoffPercentage"));
        individualStatsFaceoffsTakenColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("faceoffsTaken"));
        individualStatsHatTricksColumn.setCellValueFactory(new PropertyValueFactory<TeamScoringObject, Integer>("hatTricks"));

        individualStatsTableView.setItems(teamScoringList);

        individualStatsTableView.getColumns().addAll(
                individualStatsNameColumn,
                individualStatsPositionColumn,
                individualStatsGamesPlayedColumn,
                individualStatsGoalsScoredColumn,
                individualStatsAssistsScoredColumn,
                individualStatsPointsScoredColumn,
                individualStatsPlusMinusColumn,
                individualStatsTotalPIMsColumn,
                individualStatsFightingMajorsPIMsColumn,
                individualStatsHitsGivenColumn,
                individualStatsHitsTakenColumn,
                individualStatsShotsTakenColumn,
                individualStatsShotsBlockedColumn,
                individualStatsMinutesPlayedColumn,
                individualStatsMinutesPerGameColumn,
                individualStatsPowerPlayGoalsScoredColumn,
                individualStatsPowerPlayAssistsScoredColumn,
                individualStatsPowerPlayShotsColumn,
                individualStatsPowerPlayMinutesColumn,
                individualStatsPenaltyKillGoalsScoredColumn,
                individualStatsPenaltyKillAssistsScoredColumn,
                individualStatsPenaltyKillShotsColumn,
                individualStatsPenaltyKillMinutesColumn,
                individualStatsGameWinningGoalsColumn,
                individualStatsGameTyingGoalsColumn,
                individualStatsFaceoffPercentageColumn,
                individualStatsFaceoffsTakenColumn,
                individualStatsHatTricksColumn
        );

        individualStatsLayout.getChildren().addAll(
                individualStatsLabel,
                individualStatsComboBox,
                individualStatsTableView
        );
    }

    private void createIndividualLeadersScene() {
        // set individual leaders scene
        individualLeadersLayout = new VBox();
        individualLeadersLabel = new Label(Helpers.IndividualLeadersString);
        individualLeadersLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        individualLeadersComboBox = new ComboBox<>();
        individualLeadersComboBox.getItems().addAll(
                Helpers.individualLeadersGoalsString,
                Helpers.individualLeadersAssistsString,
                Helpers.individualLeadersShotsString,
                Helpers.individualLeadersShotPercentageString,
                Helpers.individualLeadersCentersString,
                Helpers.individualLeadersLeftWingsString,
                Helpers.individualLeadersRightWingsString,
                Helpers.individualLeadersDefensemenString,
                Helpers.individualLeadersPointsPer20String,
                Helpers.individualLeadersFaceoffPercentageString,
                Helpers.individualLeadersPlusMinusString,
                Helpers.individualLeadersPIMsString,
                Helpers.individualLeadersShotBlocksString,
                Helpers.individualLeadersRookiesString,
                Helpers.individualLeadersHitsString,
                Helpers.individualLeadersPowerPlayGoalsString,
                Helpers.individualLeadersShortHandedGoalsString,
                Helpers.individualLeadersGameWinningGoalsString
        );
        individualLeadersComboBox.setValue(Helpers.individualLeadersGoalsString);
        individualLeadersComboBox.setOnAction(e -> {
            IndividualLeagueLeadersObject[] individualLeadersUpdate = SHLScraper.getIndividualLeadersArray(individualLeadersComboBox.getValue(), seasonNumber);
            ObservableList<IndividualLeagueLeadersObject> updateList = FXCollections.observableList(Arrays.asList(individualLeadersUpdate));
            individualLeadersTableView.setItems(updateList);
            individualLeadersStatColumn.setText(Helpers.IndividualLeadersColumnsMap.get(individualLeadersComboBox.getValue()));
        });

        individualLeadersTableView = new TableView<>();
        individualLeadersTableView.setTableMenuButtonVisible(true);
        individualLeadersRowNumberColumn = new TableColumn(Helpers.RowNumberColumn);
        individualLeadersNameColumn = new TableColumn(Helpers.NameColumn);
        individualLeadersGamesPlayedColumn = new TableColumn(Helpers.GamesPlayedColumn);
        individualLeadersStatColumn = new TableColumn(Helpers.GoalsScoredColumn);

        IndividualLeagueLeadersObject[] individualLeadersArray = SHLScraper.getIndividualLeadersArray(individualLeadersComboBox.getValue(), seasonNumber);
        ObservableList<IndividualLeagueLeadersObject> updateList = FXCollections.observableList(Arrays.asList(individualLeadersArray));

        individualLeadersRowNumberColumn.setCellValueFactory(new PropertyValueFactory<IndividualLeagueLeadersObject, String>("positionOnList"));
        individualLeadersNameColumn.setCellValueFactory(new PropertyValueFactory<IndividualLeagueLeadersObject, String>("playerName"));
        individualLeadersGamesPlayedColumn.setCellValueFactory(new PropertyValueFactory<IndividualLeagueLeadersObject, Integer>("gamesPlayed"));
        individualLeadersStatColumn.setCellValueFactory(new PropertyValueFactory<IndividualLeagueLeadersObject, String>("statResult"));
        individualLeadersStatColumn.setMinWidth(70);

        individualLeadersTableView.setItems(updateList);

        individualLeadersTableView.getColumns().addAll(
                individualLeadersRowNumberColumn,
                individualLeadersNameColumn,
                individualLeadersGamesPlayedColumn,
                individualLeadersStatColumn
        );

        individualLeadersLayout.getChildren().addAll(
                individualLeadersLabel,
                individualLeadersComboBox,
                individualLeadersTableView
        );
    }

    private void createLeadersScene() {
        // set leaders scene
        leadersLayout = new VBox();
        leadersLabel = new Label(Helpers.LeadersString);
        leadersLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        leadersTableView = new TableView<>();
        leadersTableView.setTableMenuButtonVisible(true);
        leaderNameColumn = new TableColumn(Helpers.NameColumn);
        leaderPositionColumn = new TableColumn(Helpers.PositionColumn);
        leaderGamesPlayedColumn = new TableColumn(Helpers.GamesPlayedColumn);
        leaderGoalsScoredColumn = new TableColumn(Helpers.GoalsScoredColumn);
        leaderAssistsScoredColumn = new TableColumn(Helpers.AssistsScoredColumn);
        leaderPointsScoredColumn = new TableColumn(Helpers.PointsScoredColumn);
        leaderPlusMinusColumn = new TableColumn(Helpers.PlusMinusColumn);
        leaderTotalPIMsColumn = new TableColumn(Helpers.TotalPIMsColumn);
        leaderFightingMajorsPIMsColumn = new TableColumn(Helpers.FightingMajorsPIMsColumn);
        leaderHitsGivenColumn = new TableColumn(Helpers.HitsGivenColumn);
        leaderHitsTakenColumn = new TableColumn(Helpers.HitsTakenColumn);
        leaderShootingPercentageColumn = new TableColumn(Helpers.ShootingPercentageColumn);
        leaderShotsTakenColumn = new TableColumn(Helpers.ShotsTakenColumn);
        leaderShotsBlockedColumn = new TableColumn(Helpers.ShotsBlockedColumn);
        leaderMinutesPlayedColumn = new TableColumn(Helpers.MinutesPlayedColumn);
        leaderAverageMinutesPerGameColumn = new TableColumn(Helpers.AverageMinutesPerGameColumn);
        leaderPowerPlayGoalsScoredColumn = new TableColumn(Helpers.PowerPlayGoalsScoredColumn);
        leaderPowerPlayAssistsScoredColumn = new TableColumn(Helpers.PowerPlayAssistsScoredColumn);
        leaderPowerPlayShotsColumn = new TableColumn(Helpers.PowerPlayShotsColumn);
        leaderPowerPlayMinutesColumn = new TableColumn(Helpers.PowerPlayMinutesColumn);
        leaderPenaltyKillMinutesColumn = new TableColumn(Helpers.PenaltyKillMinutesColumn);

        LeadersObject[] leadersArray = SHLScraper.getLeadersArray(seasonNumber);

        ObservableList<LeadersObject> updateList = FXCollections.observableList(Arrays.asList(leadersArray));

        leaderNameColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, String>("playerName"));
        leaderPositionColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, String>("playerPosition"));
        leaderGamesPlayedColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("gamesPlayed"));
        leaderGoalsScoredColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("goalsScored"));
        leaderAssistsScoredColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("assistsScored"));
        leaderPointsScoredColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("pointsScored"));
        leaderPlusMinusColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("plusMinus"));
        leaderTotalPIMsColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("totalPIMsScored"));
        leaderFightingMajorsPIMsColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("fightingMajorsPIMs"));
        leaderHitsGivenColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("hitsGiven"));
        leaderHitsTakenColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("hitsTaken"));
        leaderShootingPercentageColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Float>("shotPercentage"));
        leaderShotsTakenColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("shotsTaken"));
        leaderShotsBlockedColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("shotsBlocked"));
        leaderMinutesPlayedColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("minutesPlayed"));
        leaderAverageMinutesPerGameColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Float>("averageMinutesPlayed"));
        leaderPowerPlayGoalsScoredColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("powerPlayGoals"));
        leaderPowerPlayAssistsScoredColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("powerPlayAssists"));
        leaderPowerPlayShotsColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("powerPlayShots"));
        leaderPowerPlayMinutesColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("powerPlayMinutes"));
        leaderPenaltyKillMinutesColumn.setCellValueFactory(new PropertyValueFactory<LeadersObject, Integer>("penaltyKillMinutes"));

        leadersTableView.setItems(updateList);

        leadersTableView.getColumns().addAll(
                leaderNameColumn,
                leaderPositionColumn,
                leaderGamesPlayedColumn,
                leaderGoalsScoredColumn,
                leaderAssistsScoredColumn,
                leaderPointsScoredColumn,
                leaderPlusMinusColumn,
                leaderTotalPIMsColumn,
                leaderFightingMajorsPIMsColumn,
                leaderHitsGivenColumn,
                leaderHitsTakenColumn,
                leaderShootingPercentageColumn,
                leaderShotsTakenColumn,
                leaderShotsBlockedColumn,
                leaderMinutesPlayedColumn,
                leaderAverageMinutesPerGameColumn,
                leaderPowerPlayGoalsScoredColumn,
                leaderPowerPlayAssistsScoredColumn,
                leaderPowerPlayShotsColumn,
                leaderPowerPlayMinutesColumn,
                leaderPenaltyKillMinutesColumn
        );

        leadersLayout.getChildren().addAll(
                leadersLabel,
                leadersTableView
        );
    }

    private void createRostersScene() {
        // set roster scene
        rosterLayout = new VBox();
        rostersLabel = new Label(Helpers.RostersString);
        rostersLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        rosterComboBox = new ComboBox<>();
        rosterComboBox.getItems().addAll(
                Helpers.ColoradoMammothsTeamString,
                Helpers.DetroitFalconsTeamString,
                Helpers.HalifaxRaidersTeamString,
                Helpers.KelownaKnightsTeamString,
                Helpers.MontrealMilitiaTeamString,
                Helpers.PrinceGeorgeFirebirdsTeamString,
                Helpers.StLouisScarecrowsTeamString,
                Helpers.VancouverWhalersTeamString
        );
        rosterComboBox.setValue(Helpers.ColoradoMammothsTeamString);
        rosterComboBox.setOnAction(e -> {
                    RosterObject[] rosterUpdate = SHLScraper.getRostersArray(rosterComboBox.getValue(), seasonNumber);
                    ObservableList<RosterObject> updateList = FXCollections.observableList(Arrays.asList(rosterUpdate));
                    rosterTableView.setItems(updateList);
                }
        );

        rosterTableView = new TableView<>();
        rosterTableView.setTableMenuButtonVisible(true);
        rosterNameColumn = new TableColumn(Helpers.NameColumn);
        rosterPositionColumn = new TableColumn(Helpers.PositionColumn);
        rosterCheckingColumn = new TableColumn(Helpers.CheckingColumn);
        rosterFightingColumn = new TableColumn(Helpers.FightingColumn);
        rosterDisciplineColumn = new TableColumn(Helpers.DisciplineColumn);
        rosterSkatingColumn = new TableColumn(Helpers.SkatingColumn);
        rosterStrengthColumn = new TableColumn(Helpers.StrengthColumn);
        rosterEnduranceColumn = new TableColumn(Helpers.EnduranceColumn);
        rosterPuckHandlingColumn = new TableColumn(Helpers.PuckHandlingColumn);
        rosterFaceoffsColumn = new TableColumn(Helpers.FaceOffsColumn);
        rosterPassingColumn = new TableColumn(Helpers.PassingColumn);
        rosterScoringColumn = new TableColumn(Helpers.ScoringColumn);
        rosterDefenseColumn = new TableColumn(Helpers.DefenseColumn);
        rosterPenaltyShotColumn = new TableColumn(Helpers.PenaltyShotColumn);

        RosterObject[] rosterArray = SHLScraper.getRostersArray(rosterComboBox.getValue(), seasonNumber);
        ObservableList<RosterObject> rosterList = FXCollections.observableList(Arrays.asList(rosterArray));

        rosterNameColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, String>("playerName"));
        rosterPositionColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, String>("playerPosition"));
        rosterCheckingColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("checkingStat"));
        rosterFightingColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("fightingStat"));
        rosterDisciplineColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("disciplineStat"));
        rosterSkatingColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("skatingStat"));
        rosterStrengthColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("strengthStat"));
        rosterEnduranceColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("enduranceStat"));
        rosterPuckHandlingColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("puckHandlingStat"));
        rosterFaceoffsColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("faceoffStat"));
        rosterPassingColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("passingStat"));
        rosterScoringColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("scoringStat"));
        rosterDefenseColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("defenseStat"));
        rosterPenaltyShotColumn.setCellValueFactory(new PropertyValueFactory<RosterObject, Integer>("penaltyShotStat"));

        rosterTableView.setItems(rosterList);

        rosterTableView.getColumns().addAll(
                rosterNameColumn,
                rosterPositionColumn,
                rosterCheckingColumn,
                rosterFightingColumn,
                rosterDisciplineColumn,
                rosterSkatingColumn,
                rosterStrengthColumn,
                rosterEnduranceColumn,
                rosterPuckHandlingColumn,
                rosterFaceoffsColumn,
                rosterPassingColumn,
                rosterScoringColumn,
                rosterDefenseColumn,
                rosterPenaltyShotColumn
        );

        rosterLayout.getChildren().addAll(
                rostersLabel,
                rosterComboBox,
                rosterTableView
        );
    }

    private void createGamesScene() {
        // set games scene
        gameStatsLayout = new VBox();
        gamesListLabel = new Label("Game Stats");
        gamesListLabel.setFont(Font.font(Helpers.PreferredLabelFontString, FontWeight.BOLD, Helpers.PreferredLabelFontSize));

        GameObject[] gamesArray = SHLScraper.getGamesArray(seasonNumber);
        ObservableList<GameObject> gamesList = FXCollections.observableList(Arrays.asList(gamesArray));

        gamesComboBox = new ComboBox<>();
        for (GameObject gameObject : gamesList) {
            gamesComboBox.getItems().add(gameObject.getGameNumber() + ": " + gameObject.getGameTeams());
        }
        if (gamesComboBox.getItems().size() == 0) {
            System.out.println("Too small");
            return;
        }
        gamesComboBox.setValue(gamesComboBox.getItems().get(0));
        gamesComboBox.setOnAction(e -> {
            SingleGame game = SHLScraper.getSingleGame(Helpers.parseGameNumber(gamesComboBox.getValue()), seasonNumber);
            scoreLabel.setText("Game Score: " + game.getLeftTeamName() + " " + game.getLeftTeamScore() + " - " + game.getRightTeamScore() + " " +  game.getRightTeamName());

            star1 = game.getStar1();
            star1TeamLabel.setText(star1.getTeam());
            star1NameLabel.setText(star1.getName());

            star2 = game.getStar2();
            star2TeamLabel.setText(star2.getTeam());
            star2NameLabel.setText(star2.getName());

            star3 = game.getStar3();
            star3TeamLabel.setText(star3.getTeam());
            star3NameLabel.setText(star3.getName());

            statsWebView.getEngine().loadContent(game.getGameStatsString());
        });

        SingleGame game = SHLScraper.getSingleGame(Helpers.parseGameNumber(gamesComboBox.getValue()), seasonNumber);

        statsVBox = new VBox();

        scoreLayout = new VBox();
        scoreLabel = new Label("Game Score: " + game.getLeftTeamName() + " " + game.getLeftTeamScore() + " - " + game.getRightTeamScore() + " " +  game.getRightTeamName());
        scoreLabel.setFont(Font.font(Helpers.PreferredLabelFontString, Helpers.PreferredLabelFontSize));

//        scoreLayout.getChildren().addAll(gameTeamsLabel, gameScoreLabel);
        scoreLayout.getChildren().addAll(scoreLabel);


        starsLayout = new HBox();

        star1Layout = new VBox();
        star1 = game.getStar1();
        star1Label = new Label("1st Star");
        star1TeamLabel = new Label(star1.getTeam());
        star1NameLabel = new Label(star1.getName().substring(1));
        star1Layout.getChildren().addAll(star1Label, star1TeamLabel, star1NameLabel);

        star2Layout = new VBox();
        star2 = game.getStar2();
        star2Label = new Label("2nd Star");

        star2TeamLabel = new Label(star2.getTeam());
        star2NameLabel = new Label(star2.getName());
        star2Layout.getChildren().addAll(star2Label, star2TeamLabel, star2NameLabel);

        star3Layout = new VBox();
        star3 = game.getStar3();
        star3Label = new Label("3rd Star");

        star3TeamLabel = new Label(star3.getTeam());
        star3NameLabel = new Label(star3.getName());
        star3Layout.getChildren().addAll(star3Label, star3TeamLabel, star3NameLabel);

        starsLayout.getChildren().addAll(star1Layout, star2Layout, star3Layout);

        teamStatsLayout = new HBox();

        statsWebView = new WebView();
        statsWebView.getEngine().loadContent(game.getGameStatsString());

        teamStatsLayout.getChildren().addAll(statsWebView);

        statsVBox.getChildren().addAll(scoreLayout, starsLayout, teamStatsLayout);
        gameStatsLayout.getChildren().addAll(gamesListLabel, gamesComboBox, statsVBox);
    }
}

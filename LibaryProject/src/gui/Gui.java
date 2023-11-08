package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

public class Gui extends Application {

    private TextField txfUsername;
    private TextField txfPassword;


    @Override
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 1000, 600);
        opretBaggrund(pane);

        stage.setTitle("Let's go!");
        stage.setScene(scene);
        stage.show();
    }

    private void opretBaggrund(GridPane pane){
        //Baggrund
        LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE,
                new Stop(0, Color.PURPLE),
                new Stop(1, Color.BLUE));

        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, new CornerRadii(0), new Insets(0));
        Background background = new Background(backgroundFill);
        pane.setBackground(background);
    }

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblUsername = new Label("Username:");
        lblUsername.setTextFill(Color.WHITE);
        pane.add(lblUsername, 0, 0);
        txfUsername = new TextField();
        pane.add(txfUsername, 1, 0, 2, 1);

        Label lblPassword = new Label("Password:");
        lblPassword.setTextFill(Color.WHITE);
        pane.add(lblPassword, 0, 1);
        txfPassword = new TextField();
        pane.add(txfPassword, 1, 1, 2, 1);

        Button btnCombine = new Button("Log in");
        pane.add(btnCombine, 0, 3);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 0, 10));

        btnCombine.setOnAction(event -> {
            logInAction();
        });
    }

    private void logInAction() {
        System.out.println("Yes");
        ;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piemenu;

import java.awt.Point;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author mannevva
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import javafx.scene.paint.Color;

import javafx.stage.Stage;
// www.  j av a2 s.  c  om
public class PieMenu extends Application {
  public static void main(String[] args) {
    launch(args);
  }
  @Override
  public void start(Stage stage) {
   Scene scene = new Scene(new Group());
        stage.setTitle(" Pie Menu");
        stage.setWidth(1000);
        stage.setHeight(1000);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Modifier", 25),
                new PieChart.Data("Supprimer", 25),
                new PieChart.Data("Precedent", 25),
                new PieChart.Data("Suivant", 25));

        final PieChart chart = new PieChart(pieChartData);
        chart.setClockwise(false);
        chart.setLabelsVisible(false);
        chart.setLegendVisible(false);
        chart.setVisible(false);
       

        for (final PieChart.Data data : chart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<MouseEvent>() {
                        @Override public void handle(MouseEvent e) {
                            
                                
                            
                        }
                    });
        }
                
        ((Group) scene.getRoot()).getChildren().add(chart);
        
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
       @Override
       public void handle(MouseEvent event) {
          if (event.getButton() == MouseButton.SECONDARY){
              chart.setTranslateX(event.getX() - chart.getLayoutX());
              chart.setTranslateY(event.getY() - chart.getLayoutY());
              chart.setVisible(true);
          }else{
              chart.setVisible(false);
          }
       }
            
       });
        stage.setScene(scene);
        stage.show();
    }
    
   
   
  }

  
  
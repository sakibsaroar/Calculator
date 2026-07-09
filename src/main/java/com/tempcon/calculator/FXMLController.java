package com.tempcon.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;



public class FXMLController implements Initializable {
    
    Double datainput =0d ;
    String operation = "nothing";
    double answer;
    
    
    @FXML
    private Button zero;
    @FXML
    private Button equals;
    @FXML
    private Button decimal;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button six;
    @FXML
    private Button five;
    @FXML
    private Button four;
    @FXML
    private Button seven;
    @FXML
    private Button backspace;
    @FXML
    private Button signchange;
    @FXML
    private Button div;
    @FXML
    private Button mul;
    @FXML
    private Button eight;
    @FXML
    private Button subs;
    @FXML
    private Button nine;
    @FXML
    private Label fdigits;
    @FXML
    private Label foperation;
    @FXML
    private Button clear;
    @FXML
    private Button add;
    @FXML
    private Button percentage;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void calculator (ActionEvent event) {
        
         if (event.getSource() == one) {
            fdigits.setText( fdigits.getText()+"1");
                       } 
           else if (event.getSource() == two) {
            fdigits.setText(fdigits.getText() + "2");
            }
          else if (event.getSource() == three) {
            fdigits.setText(fdigits.getText() + "3");
            }
          else if (event.getSource() == four) {
            fdigits.setText(fdigits.getText() + "4");
            }
          else if (event.getSource() == five) {
            fdigits.setText(fdigits.getText() + "5");
           } 
           else if (event.getSource() == six) {
            fdigits.setText(fdigits.getText() + "6");
            }
          else if (event.getSource() == seven) {
            fdigits.setText(fdigits.getText() + "7");
            }
          else if (event.getSource() == eight) {
            fdigits.setText(fdigits.getText() + "8");
            }
          else if (event.getSource() == nine) {
            fdigits.setText(fdigits.getText() + "9");
           } 
           else if (event.getSource() == zero) {
            fdigits.setText(fdigits.getText() + "0");
            
          
           }
           
             if (event.getSource() == signchange) {
                double sign = Double.parseDouble(fdigits.getText());
          
                             
             if(sign>0)
             {   fdigits.setText("-"+ fdigits.getText());}
            
             
            if(sign<0){
                fdigits.setText(String.valueOf(Math.abs(sign)));}
               
           
              }          
             
             
           
            
            
             else if(event.getSource() == decimal) {
             
            
             {fdigits.setText(fdigits.getText() + ".");}   
            
             }
           
              if(event.getSource() == clear) {
             
                 fdigits.setText("");
                 foperation.setText("");
           }
      
         
               if (event.getSource() == backspace) {
              
               
              fdigits.setText(fdigits.getText().substring( 0, fdigits.getText().length() - 1));
                   
      
          }
          
                
             if (event.getSource() == add) {
            datainput = Double.parseDouble(fdigits.getText());
            operation = "add"; 
            fdigits.setText("");
            foperation.setText(datainput+"+");
           } 
            if (event.getSource() == subs) {
            datainput = Double.parseDouble(fdigits.getText());
            operation = "substract"; 
            fdigits.setText("");
            foperation.setText(datainput+"-");
           }
            if (event.getSource() == mul) {
            datainput = Double.parseDouble(fdigits.getText());
            operation = "multiply"; 
            fdigits.setText("");
            foperation.setText(datainput+"*");
           }
            if (event.getSource() == div) {
            datainput = Double.parseDouble(fdigits.getText());
            operation = "devide"; 
            fdigits.setText("");
            foperation.setText(datainput+"/");
           }
             if (event.getSource() == percentage) {
             datainput = Double.parseDouble(fdigits.getText());
                      
                       answer = datainput/100;
                      fdigits.setText(String.valueOf(answer));

             
             
             }
          try{
                 if (event.getSource() == equals) {
               
            Double lastvalue = Double.parseDouble(fdigits.getText());
            
            switch (operation) {
                case "add": 
                    answer = datainput + lastvalue;
                    fdigits.setText(String.valueOf(answer));
                    foperation.setText("");
                    break;
                    
                case "substract": 
                    answer = datainput - lastvalue;
                    fdigits.setText(String.valueOf(answer));
                    foperation.setText("");
                    break;
                    
                  case "multiply": 
                    answer = datainput * lastvalue;
                    fdigits.setText(String.valueOf(answer));
                    foperation.setText("");  
                    break;
                    
                case "devide":                   
                    answer = datainput / lastvalue;
                    fdigits.setText(String.valueOf(answer));
                    foperation.setText("");
                    break;
                    
                        }
            
                 }
          }                 
                 catch(Exception e){
                         
                          fdigits.setText("Error");
                         }
           
                if(fdigits.getText().length()<13){
                     fdigits.setStyle("-fx-font:28  regular;");
                        }
               if(fdigits.getText().length()>13){
                     fdigits.setStyle("-fx-font:19  regular;");
                        }




        } 

    @FXML
    private void mclick(MouseEvent event) {
          if (event.getSource() == one) {
            one.setStyle("-fx-background-color:  #ffbf00  ;");
                       } 
           else if (event.getSource() == two) {
            two.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == three) {
            three.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == four) {
          four.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == five) {
            five.setStyle("-fx-background-color:  #ffbf00  ;");
           } 
         
            else if (event.getSource() == six) {
            six.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == seven) {
            seven.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == eight) {
            eight.setStyle("-fx-background-color:  #ffbf00  ;");
            }
          else if (event.getSource() == nine) {
            nine.setStyle("-fx-background-color:  #ffbf00  ;");
           } 
           else if (event.getSource() == zero) {
            zero.setStyle("-fx-background-color:  #ffbf00  ;");
           }
           else if (event.getSource() == equals) {
            equals.setStyle("-fx-background-color:  #ffbf00  ;");
                   }
          
          else if (event.getSource() == add) {
            add.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == subs) {
            subs.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == mul) {
            mul.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == div) {
            div.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == decimal) {
            decimal.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == percentage) {
            percentage.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == backspace) {
            backspace.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          else if (event.getSource() == signchange) {
            signchange.setStyle("-fx-background-color:  #ffbf00  ;");
           }
          
           }
    

    @FXML
    private void mmoved(MouseEvent event) {
        if (event.getSource() == one) {
            one.setStyle("-fx-background-color:  #1a1a1a;");
                       } 
           else if (event.getSource() == two) {
            two.setStyle("-fx-background-color: #1a1a1a;");
            }
          else if (event.getSource() == three) {
            three.setStyle("-fx-background-color:  #1a1a1a;");
            }
          else if (event.getSource() == four) {
          four.setStyle("-fx-background-color:  #1a1a1a;");
            }
          else if (event.getSource() == five) {
            five.setStyle("-fx-background-color: #1a1a1a;");
           } 
           else if (event.getSource() == six) {
            six.setStyle("-fx-background-color:  #1a1a1a;");
            }
          else if (event.getSource() == seven) {
            seven.setStyle("-fx-background-color:  #1a1a1a;");
            }
          else if (event.getSource() == eight) {
            eight.setStyle("-fx-background-color:  #1a1a1a;");
            }
          else if (event.getSource() == nine) {
            nine.setStyle("-fx-background-color:  #1a1a1a;");
           } 
           else if (event.getSource() == zero) {
            zero.setStyle("-fx-background-color:  #1a1a1a;");
            
            
         }
        else if (event.getSource() == equals) {
            equals.setStyle("-fx-background-color:  #1a1a1a  ;");
                   }
          
          else if (event.getSource() == add) {
            add.setStyle("-fx-background-color:  #1a1a1a  ;");
           }
          else if (event.getSource() == subs) {
            subs.setStyle("-fx-background-color:  #1a1a1a ;");
           }
          else if (event.getSource() == mul) {
            mul.setStyle("-fx-background-color:  #1a1a1a  ;");
           }
           else if (event.getSource() == div) {
            div.setStyle("-fx-background-color:  #1a1a1a  ;");
           }
          else if (event.getSource() == decimal) {
            decimal.setStyle("-fx-background-color:  #1a1a1a;");
           }
          else if (event.getSource() == percentage) {
            percentage.setStyle("-fx-background-color:  #1a1a1a ;");
           }
          else if (event.getSource() == backspace) {
            backspace.setStyle("-fx-background-color:  #1a1a1a  ;");
           }
          else if (event.getSource() == signchange) {
            signchange.setStyle("-fx-background-color:  #1a1a1a  ;");
           }
    }

   
    }
            
           
            
            
            
            
            

           
                
            
        
        
                
                 
                
 
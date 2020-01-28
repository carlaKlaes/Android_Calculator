package com.example.caseStudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    boolean flagEqualPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TV 1
        final TextView operationScreen = findViewById(R.id.operationScreen);
        //TV com.example.caseStudy.CalcActivity screen
        final TextView calculatorScreen = findViewById(R.id.calculatorScreen);
        //buttons
        final Button zero = findViewById(R.id.button_0);
        final Button one = findViewById(R.id.button_1);
        final Button two = findViewById(R.id.button_2);
        final Button tree = findViewById(R.id.button_3);
        final Button four = findViewById(R.id.button_4);
        final Button five = findViewById(R.id.button_5);
        final Button six = findViewById(R.id.button_6);
        final Button seven = findViewById(R.id.button_7);
        final Button eight = findViewById(R.id.button_8);
        final Button nine = findViewById(R.id.button_9);
        final Button addition = findViewById(R.id.button_add);
        final Button clear = findViewById(R.id.button_clear);
        final Button division = findViewById(R.id.button_divide);
        final Button dot = findViewById(R.id.button_dot);
        final Button equals = findViewById(R.id.button_equal);
        final Button multiplication = findViewById(R.id.button_Mult);
        final Button percentage = findViewById(R.id.button_percentage);
        final Button plus_minus = findViewById(R.id.button_plus_minus);
        final Button subtraction = findViewById(R.id.button_subtract);

        final Button exponential = findViewById(R.id.button_xy);
        final Button mplus = findViewById(R.id.button_mplus);
        final Button mminus = findViewById(R.id.button_mminus);
        final Button mc = findViewById(R.id.button_mc);
        final Button mr = findViewById(R.id.button_mr);

        final CalcActivity CalcActivity = new CalcActivity();

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1;

                final int id= v.getId();
                switch (id){
                    case R.id.button_0:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                           n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("0");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("0");
                        }
                        break;
                    case R.id.button_1:

                        try {
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        } catch (NumberFormatException e) {
                            n1=0;
                        }

                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("1");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("1");
                        }
                        break;
                    case R.id.button_2:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }

                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("2");
                            flagEqualPressed = false;
                        }else{
                            calculatorScreen.append("2");
                        }
                        break;
                    case R.id.button_3:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("3");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("3");
                        }
                        break;
                    case R.id.button_4:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("4");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("4");
                        }
                        break;
                    case R.id.button_5:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("5");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("5");
                        }
                        break;
                    case R.id.button_6:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("6");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("6");
                        }
                        break;
                    case R.id.button_7:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("7");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("7");
                        }
                        break;
                    case R.id.button_8:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }
                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("8");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("8");
                        }
                        break;
                    case R.id.button_9:
                        try{
                            n1 = Double.parseDouble(calculatorScreen.getText().toString());
                        }catch (NumberFormatException e) {
                            n1=0;
                        }

                        if((n1 == 0) || (flagEqualPressed)){
                            calculatorScreen.setText("9");
                            flagEqualPressed=false;
                        }else{
                            calculatorScreen.append("9");
                        }
                        break;
                    case R.id.button_equal:
                        operationScreen.append(calculatorScreen.getText());
                        Double result = CalcActivity.calculation(operationScreen);
                        calculatorScreen.setText(result.toString());
                        operationScreen.setText("");
                        flagEqualPressed=true;
                        break;
                    case R.id.button_add:
                        operationScreen.append(calculatorScreen.getText());
                        CalcActivity.setLastNumberTyped(calculatorScreen);
                        operationScreen.append("+");
                        calculatorScreen.setText("");
                        break;
                    case R.id.button_clear:
                        calculatorScreen.setText("0");
                        operationScreen.setText("");
                        break;
                    case R.id.button_divide:
                        operationScreen.append(calculatorScreen.getText());
                        CalcActivity.setLastNumberTyped(calculatorScreen);
                        operationScreen.append("/");
                        calculatorScreen.setText("");
                        break;
                    case R.id.button_dot:
                        calculatorScreen.append(".");
                        operationScreen.append(".");
                        break;
                    case R.id.button_Mult:
                        operationScreen.append(calculatorScreen.getText());
                        CalcActivity.setLastNumberTyped(calculatorScreen);
                        operationScreen.append("x");
                        calculatorScreen.setText("");
                        break;
                    case R.id.button_percentage:
                        Double perc = CalcActivity.getPercent(calculatorScreen,operationScreen);
                        if (perc != 0.0) {
                            calculatorScreen.setText(perc.toString());
                        }
                        break;
                    case R.id.button_plus_minus:
                        Double signal = CalcActivity.invertSignal(calculatorScreen);
                        calculatorScreen.setText(signal.toString());
                        break;
                    case R.id.button_xy:
                        operationScreen.append(calculatorScreen.getText());
                        operationScreen.append("^");
                        calculatorScreen.setText("");
                        break;
                    case R.id.button_mplus:
                        //adds the displayed number to memory
                        CalcActivity.memoryPlus(calculatorScreen);
                        calculatorScreen.setText("0");
                        break;
                    case R.id.button_mminus:
                        //subtracts the displayed number from memory
                        CalcActivity.memoryMinus(calculatorScreen);
                        calculatorScreen.setText("0");
                        break;
                    case R.id.button_mc:
                        //clears the memory (i.e. resets the memory variable to Zero)
                        CalcActivity.memoryClear();
                        break;
                    case R.id.button_mr:
                        //recalls the memory (bring the memory variable value back to display)
                        Double rec = CalcActivity.memoryReturn();
                        calculatorScreen.setText(rec.toString());
                        break;
                    case R.id.button_subtract:
                        operationScreen.append(calculatorScreen.getText());
                        CalcActivity.setLastNumberTyped(calculatorScreen);
                        operationScreen.append("-");
                        calculatorScreen.setText("");
                        break;

                }//end of switch
            }//end of oneClick view
        };//end of OnClickListener

        zero.setOnClickListener(calculatorListener);
        one.setOnClickListener(calculatorListener);
        two.setOnClickListener(calculatorListener);
        tree.setOnClickListener(calculatorListener);
        four.setOnClickListener(calculatorListener);
        five.setOnClickListener(calculatorListener);
        six.setOnClickListener(calculatorListener);
        seven.setOnClickListener(calculatorListener);
        eight.setOnClickListener(calculatorListener);
        nine.setOnClickListener(calculatorListener);
        one.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        clear.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        percentage.setOnClickListener(calculatorListener);
        plus_minus.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        exponential.setOnClickListener(calculatorListener);
        mplus.setOnClickListener(calculatorListener);
        mminus.setOnClickListener(calculatorListener);
        mc.setOnClickListener(calculatorListener);
        mr.setOnClickListener(calculatorListener);

    }//end of onCreate Method

}//end od mainActivity class

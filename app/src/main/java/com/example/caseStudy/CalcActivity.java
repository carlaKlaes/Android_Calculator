package com.example.caseStudy;

import android.widget.TextView;

public class CalcActivity {

    private double memory;
    private double lastNumberTyped;

    CalcActivity(){
        this.memory = 0;
    }

    // saves the last number typed to be used on % operations
    public void setLastNumberTyped (TextView calculatorScreen){
        this.lastNumberTyped = Double.parseDouble(calculatorScreen.getText().toString());

    }

    public Double invertSignal(TextView calculatorScreen){
        Double signal = Double.parseDouble(calculatorScreen.getText().toString());

        if(signal == 0){
            return 0.0;
        }
        signal = signal * -1;
        return signal;
    }

    public void memoryPlus(TextView calculatorScreen){
        Double n1 = Double.parseDouble(calculatorScreen.getText().toString());
        this.memory = this.memory + n1;
    }
    public void memoryMinus(TextView calculatorScreen){
        Double n1 = Double.parseDouble(calculatorScreen.getText().toString());
        this.memory = this.memory - n1;
    }

    public void memoryClear(){
        this.memory = 0;
    }
    public Double memoryReturn(){
        return this.memory;
    }
    public Double getPercent(TextView calculatorScreen, TextView operationScreen){

        Double perc = 0.0;
        Double num1 = Double.parseDouble(calculatorScreen.getText().toString());

        if (operationScreen.getText().toString().length() == 0){
            // lower screen
            perc = num1/100;
        }
        else{
            //2+
            //2%
            perc = this.lastNumberTyped * (num1/100);
            this.lastNumberTyped = perc;
        }
        return perc;
    }

    //the method calculation is invoked by the button equal
    public Double calculation(TextView operationScreen){

        String screenContent = operationScreen.getText().toString();
        //screenContent.contains()

        int start = 0;
        int i;
        int finish = 0;
        char op = ' ';
        double num1 =0;
        double num2 =0;


        for(i=0; i<screenContent.length(); i++){

            if((screenContent.charAt(i) == '+') ||
                    (screenContent.charAt(i) == '-') ||
                    (screenContent.charAt(i) == 'x') ||
                    (screenContent.charAt(i) == '/') ||
                    (screenContent.charAt(i) == '^')){

                if(op != ' '){
                    finish = i;
                    num2 = Double.parseDouble(screenContent.substring(start, finish));
                    switch (op){
                        case '+':
                            num1 = num1 + num2;
                            break;
                        case '-':
                            num1 = num1 - num2;
                            break;
                        case '/':
                            num1 = num1 / num2;
                            break;
                        case 'x':
                            num1 = num1 * num2;
                            break;
                        case '^':
                            num1 = Math.pow(num1,num2);
                            break;
                    }
                    op = screenContent.charAt(i);
                    start = i+1;
                    num2 = 0;
                }else{
                    finish = i;
                    num1 = Double.parseDouble(screenContent.substring(start, finish));
                    op = screenContent.charAt(i);
                    start = i+1;
                }
            }
        }

        //if no operation selected then return the same number received
        if (op == ' '){
            return Double.parseDouble(screenContent);
        }

        // ex. if type: 7+= --> 7+7
        if (start >= screenContent.length()){
            num2 = num1;
        } else{
            finish = i;
            num2 = Double.parseDouble(screenContent.substring(start, finish));
        }

        switch (op) {
            case '+':
                num1 = num1 + num2;
                break;
            case '-':
                num1 = num1 - num2;
                break;
            case '/':
                num1 = num1 / num2;
                break;
            case 'x':
                num1 = num1 * num2;
                break;
            case '^':
                num1 = Math.pow(num1,num2);
                break;
        }

        return num1;
    }
}

package com.ankroid.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView primaryTV;
    private TextView secondaryTV;
    private Button acBtn;
    private Button cBtn;
    private Button btnOpBr;
    private Button btnClBr;
    private Button sin;
    private Button cos;
    private Button tan;
    private Button log;
    private Button fact;
    private Button square;
    private Button sqrt;
    private Button division;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button multi;
    private Button four;
    private Button five;
    private Button six;
    private Button sub;
    private Button one;
    private Button two;
    private Button three;
    private Button add;
    private Button pi;
    private Button deci;
    private  Button zero;
    private Button equal;

    private String sign;
    private String  value2 ,str , specialFunction;
    private  Double num1 , num2 ,result;
    Boolean hasdot ,isSpecialFunction;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primaryTV = findViewById(R.id.idTVPrimary);
        secondaryTV = findViewById(R.id.idTVSecondary);
        acBtn = findViewById(R.id.idBtnAC);
        cBtn = findViewById(R.id.idBtnC);
        btnOpBr = findViewById(R.id.idBtnOpBr);
        btnClBr = findViewById(R.id.idBtnClBr);
        sin = findViewById(R.id.idBtnSin);
        cos = findViewById(R.id.idBtnCos);
        tan = findViewById(R.id.idBtnTan);
        fact = findViewById(R.id.idBtnFact);
        square = findViewById(R.id.idBtnSquare);
        sqrt = findViewById(R.id.idBtnSquareRoot);
        division = findViewById(R.id.idBtnDivision);
        seven = findViewById(R.id.idBtnSeven);
        eight = findViewById(R.id.idBtnEight);
        nine = findViewById(R.id.idBtnNine);
        multi = findViewById(R.id.idBtnMulti);
        four = findViewById(R.id.idBtnFour);
        five = findViewById(R.id.idBtnFive);
        six = findViewById(R.id.idBtnSix);
        sub = findViewById(R.id.idBtnSub);
        one = findViewById(R.id.idBtnOne);
        two = findViewById(R.id.idBtnTwo);
        three = findViewById(R.id.idBtnThree);
        log = findViewById(R.id.idBtnLog);
        add = findViewById(R.id.idBtnAdd);
        pi = findViewById(R.id.idBtnPie);
        zero = findViewById(R.id.idBtnZero);
        deci = findViewById(R.id.idBtnDeci);
        equal = findViewById(R.id.idBtnEqual);
        hasdot = false;
        isSpecialFunction = false;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"1");
            }
        } );
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"2");
            }
        } );
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"3");
            }
        } );
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"4");
            }
        } );
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"5");
            }
        } );
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"6");
            }
        } );
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"7");
            }
        } );

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"8");
            }
        } );
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"9");
            }
        } );
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"0");
            }
        } );

        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (!primaryTV.getText().toString().contains(".")){
                    primaryTV.setText(primaryTV.getText().toString() + ".");
//                }
//                if (primaryTV.getText().toString().contains("x") || primaryTV.getText().toString().contains("+") || primaryTV.getText().toString().contains("-") || primaryTV.getText().toString().contains("÷")){
//                    primaryTV.setText(primaryTV.getText().toString() + ".");
//                }
            }
        } );

        acBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText("");
                secondaryTV.setText("");
            }
        } );

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()){
                    String val = primaryTV.getText().toString();
                    val = val.substring(0,val.length() - 1);
                    primaryTV.setText(val);
                }
            }
        } );

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()) {
                    primaryTV.setText(primaryTV.getText().toString() + "+");
                }
            }
        } );

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()){

                    primaryTV.setText(primaryTV.getText().toString() + "-");
                }
            }
        } );
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()) {
                    primaryTV.setText(primaryTV.getText().toString() + "x");
                }
            }
        } );

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()) {
                    primaryTV.setText(primaryTV.getText().toString() + "÷");
                }

            }
        } );
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!primaryTV.getText().toString().isEmpty()) {
                    String val = primaryTV.getText().toString();
                    double r = Math.sqrt(Double.parseDouble(val));
                    primaryTV.setText(String.valueOf(r));
                }
            }
        } );

        btnOpBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+"(");
            }
        } );

        btnClBr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                primaryTV.setText(primaryTV.getText().toString()+")");
            }
        } );

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                secondaryTV.setText(pi.getText());
                primaryTV.setText(primaryTV.getText().toString()+"3.14");
            }
        } );

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                secondaryTV.setText(pi.getText());
                primaryTV.setText(primaryTV.getText().toString()+"sin");
            }
        } );

        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                secondaryTV.setText(pi.getText());
                primaryTV.setText(primaryTV.getText().toString()+"cos");
            }
        } );

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
//                secondaryTV.setText(pi.getText());
                primaryTV.setText(primaryTV.getText().toString()+"tan");
            }
        } );

        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!primaryTV.getText().toString().isEmpty()) {
                    int val = Integer.parseInt(primaryTV.getText().toString());
                    int fact = factorial(val);
                    primaryTV.setText(String.valueOf(fact));
                    secondaryTV.setText(val + "!");
                }
            }
        });

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!primaryTV.getText().toString().isEmpty()) {
                    double d = Double.parseDouble(primaryTV.getText().toString());
                    double square = d * d;
                    primaryTV.setText(String.valueOf(square));
                    secondaryTV.setText(d + "²");
                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primaryTV.setText(primaryTV.getText()+"log");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!primaryTV.getText().toString().isEmpty()){
                    String val = primaryTV.getText().toString();
                    String replacedStr = val.replace('÷' , '/').replace('x' ,'*');
                    double result = eval(replacedStr);
                    primaryTV.setText(String.valueOf(result));
                    secondaryTV.setText(val);
                }
            }
        });
    }

    //        factorial function
    int factorial(int n){
        return (n==1 || n== 0) ? 1 : n * factorial(n-1);
    }

    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }


}

package com.egcoding.newappjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button one, two, three, four, five, six, seven, eight, nine;
    Button zero, add, Subtract, Multiply, divide, EqualSign, dot, erase;
    boolean OperaSubtract, OperaAdd, OperaMultiply, OperaDivision;
    TextView calcScreen;
    TextView calcScreen2;

    float Value1, Value2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*shadowButton1 = findViewById(R.id.button);
        shadowButton2 = findViewById(R.id.button2);*/
        Assign(one, R.id.uno);
        Assign(two, R.id.dos);
        Assign(three, R.id.tres);
        Assign(four,R.id.four);
        Assign(five,R.id.five);
        Assign(six,R.id.six);
        Assign(seven,R.id.seven);
        Assign(eight,R.id.eight);
        Assign(nine,R.id.nine);
        Assign(zero,R.id.zero);
        /*DoubleZero = findViewById(R.id.doubleZeros);*/
        Assign(EqualSign,R.id.igual);
        Assign(erase,R.id.cancelar);
        Assign(Multiply,R.id.mutiplicacion);
        Assign(add,R.id.suma);
        Assign(divide, R.id.division);
        Assign(Subtract,R.id.resta);
        //percent =  findViewById(R.id.percent);
        calcScreen = (TextView) findViewById(R.id.Pantalla);
        calcScreen2 = (TextView) findViewById(R.id.Pantalla2);

    }

    void Assign(Button btn, int id)
    {
        btn = findViewById(id);
        btn.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        Button button = (Button) view;
        String btntxt = button.getText().toString();
        String datatoCalculate = calcScreen.getText().toString();

        if(btntxt.equals("1"))
        {
            calcScreen.setText(calcScreen.getText() + "1");
        }
        if(btntxt.equals("2"))
        {
            calcScreen.setText(calcScreen.getText() + "2");
        }
        if(btntxt.equals("3"))
        {
            calcScreen.setText(calcScreen.getText() + "3");
        }
        if(btntxt.equals("4"))
        {
            calcScreen.setText(calcScreen.getText() + "4");
        }
        if(btntxt.equals("5"))
        {
            calcScreen.setText(calcScreen.getText() + "5");
        }
        if(btntxt.equals("6"))
        {
            calcScreen.setText(calcScreen.getText() + "6");
        }
        if(btntxt.equals("7"))
        {
            calcScreen.setText(calcScreen.getText() + "7");
        }
        if(btntxt.equals("8"))
        {
            calcScreen.setText(calcScreen.getText() + "8");
        }
        if(btntxt.equals("9"))
        {
            calcScreen.setText(calcScreen.getText() + "9");
        }
        if(btntxt.equals("0"))
        {
            calcScreen.setText(calcScreen.getText() + "0");
        }

        if(btntxt.equals("+"))
        {
            if(calcScreen == null)
            {
                assert false;
                calcScreen.setText("");
            }
            else{
                Value1 = Float.parseFloat(calcScreen.getText() + "");
                OperaAdd = true;
                calcScreen.setText(null);
            }
        }
        if(btntxt.equals("-"))
        {
            if(calcScreen == null)
            {
                assert false;
                calcScreen.setText("");
            }
            else{
                Value1 = Float.parseFloat(calcScreen.getText() + "");
                OperaSubtract = true;
                calcScreen.setText(null);
            }
        }
        if(btntxt.equals("/"))
        {
            if(calcScreen == null)
            {
                assert false;
                calcScreen.setText("");
            }
            else{
                Value1 = Float.parseFloat(calcScreen.getText() + "");
                OperaDivision = true;
                calcScreen.setText(null);
            }
        }
        if(btntxt.equals("X"))
        {
            if(calcScreen == null)
            {
                assert false;
                calcScreen.setText("");
            }
            else{
                Value1 = Float.parseFloat(calcScreen.getText() + "");
                OperaMultiply = true;
                calcScreen.setText(null);
            }
        }

        if(btntxt.equals("=")) {
            Value2 = Float.parseFloat(calcScreen.getText() + "");
            if (OperaAdd) {
                calcScreen2.setText(Value1 + Value2 + "");
                OperaAdd = false;
            }
            if (OperaSubtract) {
                calcScreen2.setText(Value1 - Value2 + "");
                OperaSubtract = false;
            }
            if (OperaMultiply) {
                calcScreen2.setText(Value1 * Value2 + "");
                OperaMultiply = false;
            }
            if (OperaDivision) {
                calcScreen2.setText(Value1 / Value2 + "");
                OperaDivision = false;
            }
        }


        if(btntxt.equals("C"))
        {
            calcScreen.setText("");
            calcScreen2.setText("0");
            return;
        }

        if(btntxt.equals("D"))
        {
            datatoCalculate = datatoCalculate.substring(0, datatoCalculate.length()-1);
        }
        else {
            datatoCalculate = datatoCalculate + btntxt;
        }


    }
}


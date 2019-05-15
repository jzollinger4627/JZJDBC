package com.jbstudios.quadraticcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText X1 = (EditText) findViewById(R.id.xOne);
    private EditText Y1 = (EditText) findViewById(R.id.yOne);

    private EditText X2 = (EditText) findViewById(R.id.xTwo);
    private EditText Y2 = (EditText) findViewById(R.id.yTwo);

    private EditText X3 = (EditText) findViewById(R.id.xThree);
    private EditText Y3 = (EditText) findViewById(R.id.yThree);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculate = (Button) findViewById(R.id.calc);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double[] array1 = {-getDouble(Y1),-Math.pow(getDouble(X1),2),-(2*getDouble(X1))};
                double[] array2 = {getDouble(Y2),Math.pow(getDouble(X2),2),(2*getDouble(X2))};
                double[] array3 = {-getDouble(Y3),-Math.pow(getDouble(X3),2),-(2*getDouble(X3))};

                double[] array4 = {array1[0]+array2[0],array1[1]+array2[1],array1[2]+array2[2]};
                double[] array5 = {array3[0]+array2[0],array3[1]+array2[1],array3[2]+array2[2]};

                array4[0] = array4[0]*array5[2];
                array4[1] = array4[1]*array5[2];

                array5[0] = array5[0]*array4[2];
                array5[1] = array5[1]*array4[2];
            }
        });

    }

    private double getDouble(EditText a) {
        return Double.parseDouble(a.getText().toString());
    }
}

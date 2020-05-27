package com.example.gavin.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText weight ;
    EditText height ;
    TextView output ;
    TextView rating ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = (EditText) findViewById(R.id.weightEditText) ;
        height = (EditText) findViewById(R.id.heightEditText) ;
        output = (TextView) findViewById(R.id.bmiTextView) ;
        rating = (TextView) findViewById(R.id.descriptionTextView) ;
    }

    public void calculateBMI(View v){
        double w = new Double(weight.getText().toString()) ;
        double h = new Double(height.getText().toString()) ;
        double value = BMIconvert.calculateBMI(w,h);

        output.setText(new Double(value).toString());

        if (value<40) {
            rating.setText("U phat AF");
            if (value<35) {
                rating.setText("U phat");
                if (value<30) {
                    rating.setText("Thicc AF");
                    if (value<25) {
                        rating.setText("Ideal");
                        if (value<18.5) {
                            rating.setText("Underweight");
                        }
                    }

                }

            }

        }
    }
}


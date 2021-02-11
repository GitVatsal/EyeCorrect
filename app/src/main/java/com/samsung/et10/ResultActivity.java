package com.samsung.et10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    TextView Res;
    Button goToHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Res  = findViewById(R.id.textView6);
        goToHome = findViewById(R.id.button5);
        Double resultM = -100 / DetectorActivity.GetDistance();
        Double resultH = 4 + resultM;
        if(MainActivity.getType()==1) {
            if( resultM > -0.5)  Res.setText("You may not require spectacles for shortsightedness. Approx theoretical power: " + Double.toString(resultM) );
            else Res.setText("You may require spectacles of power " + Double.toString(resultM));
        }
        else if(MainActivity.getType()==2) {
            if( resultH < 0.4 )  Res.setText("You may not require spectacles for farsightedness.") ;// Approx theoretical power: " + Double.toString(resultM) );
            else Res.setText("You may require spectacles of power " + Double.toString(resultH));
        }
        goToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        Button exit = (Button) findViewById(R.id.button8);

        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });

    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


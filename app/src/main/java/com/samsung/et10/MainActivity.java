package com.samsung.et10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button ,buttonH;
    static public int mOrH=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonH= (Button) findViewById(R.id.button);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityH();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, Myopia.class);
        mOrH=1;
        startActivity(intent);
    }
    public void openNewActivityH(){
        Intent intent = new Intent(this, Hypermetropia.class);
        mOrH=2;
        startActivity(intent);
    }
    static public int getType(){
        return mOrH;
    }

}



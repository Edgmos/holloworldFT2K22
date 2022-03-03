package com.example.holloworldft2k22;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    private TextView txtMain;
    private boolean isHelloWorld;
    private int isBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtMain = (TextView)findViewById(R.id.txtMain);
        this.isHelloWorld = true;
        this.isBlack = BLACK;
    }

    public void onBtnMainClick(View view) {
        if(this.isHelloWorld){
            this.txtMain.setText("Well well well");
            this.isHelloWorld = false;
        }
        else{
            this.txtMain.setText(R.string.lable_name);
            this.isHelloWorld = true;
        }
    }
    public void onBtnColClick(View view) {
        if(this.isBlack == BLACK){
            this.txtMain.setTextColor(GREEN);
            this.isBlack = GREEN;
        }
        else{
            this.txtMain.setTextColor(BLACK);
            this.isBlack = BLACK;
        }
    }
}
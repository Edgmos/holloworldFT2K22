package com.example.holloworldft2k22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtMain;
    private boolean isHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtMain = (TextView)findViewById(R.id.txtMain);
        this.isHelloWorld = true;
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
}
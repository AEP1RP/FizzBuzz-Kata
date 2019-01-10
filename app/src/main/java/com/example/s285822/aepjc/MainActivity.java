package com.example.s285822.aepjc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static void main(String ...args){




    }

    private boolean isFizz(int n){
        return n%3 == 0;
    }

    private boolean isBuzz(int n){
        return n %5 == 0;
    }






}

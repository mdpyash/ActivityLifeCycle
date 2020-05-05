package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.textViewState)).setText("onCreate()n");
    }

    @Override
    protected void onStart(){
        super.onStart();

        ((TextView) findViewById(R.id.textViewState)).append("onCreate()n ");
    }

    @Override
    protected void onResume(){
        super.onResume();

        ((TextView) findViewById(R.id.textViewState)).append("onCreate()n ");
    }

    @Override
    protected void onPause(){
        super.onPause();

        ((TextView) findViewById(R.id.textViewState)).append("onCreate()n ");
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        ((TextView) findViewById(R.id.textViewState)).append("onCreate()n ");

        if(isFinishing()){
            ((TextView) findViewById(R.id.textViewState)).append("... is finishing!");
        }
    }
}

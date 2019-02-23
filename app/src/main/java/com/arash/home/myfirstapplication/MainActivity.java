package com.arash.home.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
//    TextView txt = findViewById(R.id.txtTitle);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hello", "Created");
        
//        Button btn = findViewById(R.id.btnSearch);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Hello", "Started");
        
        
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Hello", "Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Hello", "Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Hello","Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Hello","Destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Hello","Restarted");
    }
}

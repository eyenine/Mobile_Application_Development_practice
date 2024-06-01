package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy invoked");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
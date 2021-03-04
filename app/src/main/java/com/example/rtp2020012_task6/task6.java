package com.example.rtp2020012_task6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class task6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task6);
    }
    public void startAlertTask(View v) {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Congratulations");
        b.setMessage("Alert Dialog has successfully popped up");
        b.setPositiveButton("Continue", null);
        AlertDialog d = b.create();
        d.show();
    }
    public void startToastTask(View v) {
        Toast.makeText(getBaseContext(),"The toast message has popped up",Toast.LENGTH_SHORT).show();
    }
}
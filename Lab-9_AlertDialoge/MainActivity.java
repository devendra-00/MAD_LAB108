package com.example.108Android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_dy)
                .setTitle("Be Alert")
                        .setMessage("Nice to meet you!")
                                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                                    }
                                }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
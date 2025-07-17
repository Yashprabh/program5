package com.example.program5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private RelativeLayout containerRL;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing variables with ids.
        containerRL = findViewById(R.id.idRLContainer);
        // on below line we are setting background for
        // our relative layout on below line.
        containerRL.setBackground(getResources().getDrawable(R.drawable.back_drawable));
    }
}

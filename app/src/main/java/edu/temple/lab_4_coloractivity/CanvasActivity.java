package edu.temple.lab_4_coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
        getSupportActionBar().setTitle("Canvas Activity");
        final Intent catchintent=getIntent();
        String cv=catchintent.getStringExtra("colorval");
        final ConstraintLayout layout=(ConstraintLayout) findViewById(R.id.constraint1);
        layout.setBackgroundColor(Color.parseColor(cv));
    }
}

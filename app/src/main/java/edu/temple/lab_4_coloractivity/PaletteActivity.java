package edu.temple.lab_4_coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {
    int current_item=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View v = findViewById(R.id.backgroundactivity);
        getSupportActionBar().setTitle("Palette Activity");
        final String[] Colors= {"Blue", "Cyan", "Gray", "Green", "Magenta", "Red", "aqua", "purple", "maroon", "yellow"};
        final ColorAdapter colorAdapter = new ColorAdapter(PaletteActivity.this, Colors);
        final Spinner spin= (Spinner)findViewById(R.id.spinner);
        spin.setAdapter(colorAdapter);
        final ConstraintLayout backgroundcolor= (ConstraintLayout)findViewById(R.id.backgroundactivity);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                backgroundcolor.setBackgroundColor(Color.parseColor((String) Colors[pos]));
                view.setBackgroundColor(Color.WHITE);
                if(current_item==pos) {
                    return;
                }
                else {
                    Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
                    intent.putExtra("colorval", Colors[pos]);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

    }

}

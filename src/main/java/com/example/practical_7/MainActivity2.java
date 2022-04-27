package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int id = intent.getIntExtra("id", R.id.imgbtn);
        Log.d("display", String.valueOf(id));
        ImageButton image = findViewById(R.id.imgbtn2);
        if (id == R.id.imgbtn) {
            image.setImageResource(R.drawable.car);
        }
        else {
            Toast.makeText(this, "Pls do somethig else", Toast.LENGTH_SHORT).show();
        }

    }
}

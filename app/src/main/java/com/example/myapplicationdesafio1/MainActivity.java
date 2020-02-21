package com.example.myapplicationdesafio1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView miimagen = findViewById(R.id.miimagen);
        Picasso.get().load("https://sendeyo.com/up/d/6be1254bc4").into(miimagen);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
                intentExample();
            }
        });


    }
    private void intentExample(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}

package com.example.sudety;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private int coun = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button like = findViewById(R.id.likeButton);
        Button dislike = findViewById(R.id.deleteButton);
        TextView Out = findViewById(R.id.comm);
        TextView Email= findViewById(R.id.email);
        TextView Pass1 = findViewById(R.id.pass1);
        TextView Pass2 = findViewById(R.id.pass2);
        Button Save = findViewById(R.id.save);
        Button Check = findViewById(R.id.check);
        Button Like = findViewById(R.id.likeButton);
        TextView Counter = findViewById(R.id.Counter);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coun++;
                Counter.setText(coun +" polubień");
            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coun--;
                if(coun < 0){
                    coun = 0;
                }
                Counter.setText(coun +" polubień");
            }
        });
    }
}
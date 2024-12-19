package com.example.sudety;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView coun;
    private Button like;
    private Button dislike;
    private EditText email;
    private EditText password1;
    private EditText password2;
    private Button save;
    private Button check;
    private TextView comm;
    private String lastreg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coun = findViewById(R.id.Counter);
        like = findViewById(R.id.likeButton);
        dislike = findViewById(R.id.deleteButton);
        email = findViewById(R.id.email);
        password1 = findViewById(R.id.pass1);
        password2 = findViewById(R.id.pass2);
        save = findViewById(R.id.save);
        check = findViewById(R.id.check);
        comm = findViewById(R.id.comm);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                nowaLiczbaLike();
            }
        });

        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                    counter--;
                    nowaLiczbaLike();
                }
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = email.getText().toString().trim();
                String haslo = password1.getText().toString().trim();
                String hasloAgain = password2.getText().toString().trim();

                if (!mail.contains("@")) {
                    comm.setText("Nieprawidłowy adres e-mail");
                } else if (!hasloAgain.matches(haslo)) {
                    comm.setText("Hasła się różnią");
                } else {
                    lastreg = mail;
                    comm.setText("Zarejestrowano " + mail);
                }
            }

        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!lastreg.isEmpty()){
                    comm.setText("Uczestnik: " + lastreg);
                } else {
                    comm.setText("Brak zarejestrowanego użytkownika");
                }
            }
        });
    }

    private void nowaLiczbaLike() {
        like.setText(like + " Polubień");
    }

}
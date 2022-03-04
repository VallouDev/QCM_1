package com.example.qcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inscription extends AppCompatActivity implements View.OnClickListener {


    TextView mdp;
    TextView mail;
    Button btninscr;




        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.inscription);
            Bundle bundle = getIntent().getExtras();

            btninscr = findViewById(R.id.button);
            mdp = findViewById(R.id.mdp);
            mail = findViewById(R.id.adresse);

            // getting the bundle from the intent


            // setting the text in the textview
            //  txtString.setText(bundle.getString("key1", "No value from the MainActivity"));
            btninscr.setOnClickListener(this);
            mdp.setOnClickListener(this);
            mail.setOnClickListener(this);
        }

    public static boolean isEmailAdress(String email){
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$");
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                if(isEmailAdress(mail.getText().toString()) == true){
                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(Inscription.this, MainActivity.class);
                    bundle.putString("mail",mail.getText().toString());
                    bundle.putString("mdp",mdp.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    Toast toast =  Toast.makeText(Inscription.this, "Erreur, adresse-mail invalide", Toast.LENGTH_SHORT);
                    toast.show();
                }
                break;

        }
    }
}


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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnconn;
    Button btninscr;
    TextView mdp;
    TextView mail;
    String str;
    String str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bundle = getIntent().getExtras();

        if (bundle == null) {
            //str = bundle.getString("mail");
            //str2 = bundle.getString("mdp");
        }

                btnconn = findViewById(R.id.button);
                btninscr = findViewById(R.id.inscrire);
                mdp = findViewById(R.id.mdp);
                mail = findViewById(R.id.adresse);


                // one button will pass the bundle and other button
                // will not pass the bundle
                btnconn.setOnClickListener(this);
                btninscr.setOnClickListener(this);


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
                //if (str == mail.toString() && str2 == mdp.toString()) {
                if(isEmailAdress(mail.getText().toString()) == true){
                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
               }
            else {
                    Toast toast =  Toast.makeText(MainActivity.this, "Mauvais email", Toast.LENGTH_SHORT);
                    toast.show();
               }
                break;
            case R.id.inscrire:
                Bundle bundle2 = new Bundle();
                Intent intent2 = new Intent(MainActivity.this, Inscription.class);
                intent2.putExtras(bundle2);
                startActivity(intent2);
                break;

        }
    }
}
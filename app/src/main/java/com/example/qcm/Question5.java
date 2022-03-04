package com.example.qcm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.chip.Chip;

public class Question5 extends AppCompatActivity implements View.OnClickListener {

    Button valide;
    RadioButton rep1;
    RadioButton rep2;
    RadioButton rep3;
    int reponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);

        Bundle bundle = getIntent().getExtras();
        valide = findViewById(R.id.bvalide);
        rep1 = findViewById(R.id.r616);
        rep2 = findViewById(R.id.r4298);
        rep3 = findViewById(R.id.r81);


        rep1.setOnClickListener(this);
        rep2.setOnClickListener(this);
        rep3.setOnClickListener(this);
        valide.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.bvalide):
                if (rep3.isChecked()) {
                    reponse = reponse + 1;
                } else {
                    reponse = reponse + 0;
                }
                Bundle bundle2 = new Bundle();
                Intent intent2 = new Intent(Question5.this, SecondActivity.class);
                bundle2.putInt("reponse", reponse);
                intent2.putExtras(bundle2);
                startActivity(intent2);
                break;
        }
    }
}
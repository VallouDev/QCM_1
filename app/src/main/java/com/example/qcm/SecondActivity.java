package com.example.qcm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    // TextView txtString;
    Button q1;
    Button q2;
    Button q3;
    Button q4;
    Button q5;
    TextView scorus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("reponse");

        q1 = findViewById(R.id.bq1);
        q2 = findViewById(R.id.bq2);
        q3 = findViewById(R.id.bq3);
        q4 = findViewById(R.id.bq4);
        q5 = findViewById(R.id.bq5);
        scorus = findViewById(R.id.textView2);

        scorus.setText(String.valueOf(score));


        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bq1:
                Bundle bundle = new Bundle();
                Intent intent = new Intent(SecondActivity.this, Question1.class);
                intent.putExtras(bundle);
                startActivity(intent);
                break;
            case R.id.bq2:
                Bundle bundle2 = new Bundle();
                Intent intent2 = new Intent(SecondActivity.this, Question2.class);
                intent2.putExtras(bundle2);
                startActivity(intent2);
                break;
            case R.id.bq3:
                Bundle bundle3 = new Bundle();
                Intent intent3 = new Intent(SecondActivity.this, Question3.class);
                intent3.putExtras(bundle3);
                startActivity(intent3);
                break;
            case R.id.bq4:
                Bundle bundle4 = new Bundle();
                Intent intent4 = new Intent(SecondActivity.this, Question4.class);
                intent4.putExtras(bundle4);
                startActivity(intent4);
                break;
            case R.id.bq5:
                Bundle bundle5 = new Bundle();
                Intent intent5 = new Intent(SecondActivity.this, Question5.class);
                intent5.putExtras(bundle5);
                startActivity(intent5);
                break;

        }
    }

}


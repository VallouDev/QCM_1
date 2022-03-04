package com.example.qcm;

import android.graphics.Movie;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.LinkedList;
import java.util.List;

public class Question4 extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);

        Bundle bundle = getIntent().getExtras();

        //LinkedList<List> list = new LinkedList<list>();
      // list.add(new List("Reponse1"));
        //list.add(new List("Reponse2"));
        //list.add(new List("Reponse3"));

    }

    @Override
    public void onClick(View view) {

    }
}

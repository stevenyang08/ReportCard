package com.example.android.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Grades> gradeArray = new ArrayList<Grades>();

        gradeArray.add(new Grades("History", "B-"));
        gradeArray.add(new Grades("Math", "C+"));
        gradeArray.add(new Grades("PE", "A"));
        gradeArray.add(new Grades("Science", "B+"));
        gradeArray.add(new Grades("Geography", "C+"));

        System.out.println(gradeArray.get(0).toString());

        updateList(gradeArray);
    }

    public void updateList(ArrayList<Grades> arrayList) {
        GradeAdapter gradeAdapter = new GradeAdapter(this, arrayList);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(gradeAdapter);
    }
}

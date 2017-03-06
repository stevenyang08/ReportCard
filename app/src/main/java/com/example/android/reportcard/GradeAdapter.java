package com.example.android.reportcard;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by stevenyang on 3/6/17.
 */

public class GradeAdapter extends ArrayAdapter<Grades> {

    public GradeAdapter(Activity context, ArrayList<Grades> arrayList) {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemListView = convertView;
        if (itemListView == null) {
            itemListView = LayoutInflater.from(getContext()).inflate(R.layout.grade_list_items, parent, false);
        }

        Grades currentGrade = getItem(position);

        TextView classTextView = (TextView) itemListView.findViewById(R.id.class_name);
        classTextView.setText(currentGrade.getClassName());

        TextView gradeTextView = (TextView) itemListView.findViewById(R.id.class_grade);
        gradeTextView.setText(currentGrade.getGrade());

        return itemListView;
    }
}

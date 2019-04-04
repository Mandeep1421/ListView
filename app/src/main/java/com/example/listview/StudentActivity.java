package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.listview.model.Student;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity
{
    private ListView lstStudentData;
    private ArrayList<Student>studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        initData();
        lstStudentData = findViewById(R.id.lstOperatingSystem);

        lstStudentData.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Student mStudent = studentArrayList.get(i);

            }
        });
    }

    private void initData()
    {
        studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("Pritesh", "1", "India"));
        studentArrayList.add(new Student("Mandeep", "2", "Brazil"));
        studentArrayList.add(new Student("Samir", "3", "India"));
        studentArrayList.add(new Student("Kunal", "4", "Canada"));
        studentArrayList.add(new Student("Mannider", "5","Italy"));
        studentArrayList.add(new Student("Amrit", "6", "Mexico"));
        studentArrayList.add(new Student("Priya", "7", "Turkey"));
        studentArrayList.add(new Student("Akshay", "8", "Brazil"));

    }
}


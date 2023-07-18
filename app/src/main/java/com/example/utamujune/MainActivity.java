package com.example.utamujune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new codes for learning
        Student student =  new Student();
        int gotAge  = student.age;

        /* instantiate dog class*/
        Dog dogobj = new Dog();
        int output = dogobj.calculateSize();
        System.out.println("Calculate method output is: " + output);
    }

}
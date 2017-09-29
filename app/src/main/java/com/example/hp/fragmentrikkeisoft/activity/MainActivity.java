package com.example.hp.fragmentrikkeisoft.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private StudentFragment studentFragment;
    private StudentNameFragment studentNameFragment;
    private StudentDetailFragment studentDetailFragment;

    private String mName;
    private String mCountry;
    private String mDateOfBirth;
    private String mSex;
    private String mClass;
    private String mCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showStudentNameScreen();
    }

    public void showStudentNameScreen() {
        if (studentNameFragment==null) {
            studentNameFragment=new StudentNameFragment();
        }

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, studentNameFragment).commit();
    }

    public void showStudentScreen() {
        if (studentFragment==null) {
            studentFragment=new StudentFragment();
        }

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, studentFragment).commit();

    }

    public void showStudentDetailScreen() {
        if (studentDetailFragment==null) {
            studentDetailFragment=new StudentDetailFragment();
        }

        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, studentDetailFragment).commit();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public String getmDateOfBirth() {
        return mDateOfBirth;
    }

    public void setmDateOfBirth(String mDateOfBirth) {
        this.mDateOfBirth = mDateOfBirth;
    }

    public String getmSex() {
        return mSex;
    }

    public void setmSex(String mSex) {
        this.mSex = mSex;
    }

    public String getmClass() {
        return mClass;
    }

    public void setmClass(String mClass) {
        this.mClass = mClass;
    }

    public String getmCourse() {
        return mCourse;
    }

    public void setmCourse(String mCourse) {
        this.mCourse = mCourse;
    }
}

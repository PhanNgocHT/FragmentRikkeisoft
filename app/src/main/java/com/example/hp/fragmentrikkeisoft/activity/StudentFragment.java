package com.example.hp.fragmentrikkeisoft.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hp.fragmentrikkeisoft.R;


/**
 * Created by hp on 9/27/2017.
 */

public class StudentFragment extends Fragment implements View.OnClickListener{
    private TextView tvName;
    private EditText etCountry, etDateOfBirth, etSex, etClass, etCourse;
    private Button btnOk;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_student, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();

    }

    private void initView() {
        tvName=getActivity().findViewById(R.id.tv_name_student);
        etCountry=getActivity().findViewById(R.id.et_country);
        etDateOfBirth=getActivity().findViewById(R.id.et_date_of_birth);
        etSex=getActivity().findViewById(R.id.et_sex);
        etClass=getActivity().findViewById(R.id.et_class);
        etCourse=getActivity().findViewById(R.id.et_course);
        btnOk=getActivity().findViewById(R.id.btn_ok_student);
        btnOk.setOnClickListener(this);
        tvName.setText(((MainActivity) getActivity()).getmName());
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ok_student:
                fillData();
                break;
            default:
                break;
        }
    }

    private void fillData() {
        String country=etCountry.getText().toString();
        String dateOfBirth=etDateOfBirth.getText().toString();
        String sex=etSex.getText().toString();
        String myClass=etClass.getText().toString();
        String course=etCourse.getText().toString();
        if (country.isEmpty() || dateOfBirth.isEmpty() || sex.isEmpty() || myClass.isEmpty() || course.isEmpty()) {
            Toast.makeText(getActivity(), R.string.inform, Toast.LENGTH_SHORT).show();
            return;
        }
        MainActivity mainActivity=((MainActivity) getActivity());
        mainActivity.setmCountry(country);
        mainActivity.setmDateOfBirth(dateOfBirth);
        mainActivity.setmSex(sex);
        mainActivity.setmClass(myClass);
        mainActivity.setmCourse(course);
        mainActivity.showStudentDetailScreen();

    }

}

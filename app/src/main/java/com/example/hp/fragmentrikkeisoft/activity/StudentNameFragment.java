package com.example.hp.fragmentrikkeisoft.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hp.fragmentrikkeisoft.R;

/**
 * Created by hp on 9/27/2017.
 */

public class StudentNameFragment extends Fragment implements View.OnClickListener{
    private EditText etName;
    private Button btnOk;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_student_name, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        etName=getActivity().findViewById(R.id.et_name);
        btnOk=getActivity().findViewById(R.id.btn_ok_student_name);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ok_student_name:
                fillData();
                break;
            default:
                break;
        }
    }

    private void fillData() {
        String name=etName.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(getActivity(), R.string.inform, Toast.LENGTH_SHORT).show();
            return;
        }
        ((MainActivity)getActivity()).setmName(name);
        ((MainActivity) getActivity()).showStudentScreen();

    }
}

package com.example.hp.fragmentrikkeisoft.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hp.fragmentrikkeisoft.R;


/**
 * Created by hp on 9/27/2017.
 */

public class StudentDetailFragment extends Fragment {
    private TextView tvName, tvCountry, tvDateOfBirth, tvSex, tvClass, tvCourse;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_student_detail, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        fillData();
    }

    private void initView() {

        tvName=getActivity().findViewById(R.id.tv_name);
        tvCountry=getActivity().findViewById(R.id.tv_country);
        tvDateOfBirth=getActivity().findViewById(R.id.tv_date_of_birth);
        tvSex=getActivity().findViewById(R.id.tv_sex);
        tvClass=getActivity().findViewById(R.id.tv_class);
        tvCourse=getActivity().findViewById(R.id.tv_course);
    }

    private void fillData(){
        MainActivity mainActivity=((MainActivity) getActivity());
        tvName.setText(mainActivity.getmName());
        tvCountry.setText(mainActivity.getmCountry());
        tvDateOfBirth.setText(mainActivity.getmDateOfBirth());
        tvSex.setText(mainActivity.getmSex());
        tvClass.setText(mainActivity.getmClass());
        tvCourse.setText(mainActivity.getmCourse());
    }
}

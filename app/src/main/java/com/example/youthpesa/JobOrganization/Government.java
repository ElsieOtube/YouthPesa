package com.example.youthpesa.JobOrganization;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.youthpesa.JobCategory.Automotive;
import com.example.youthpesa.R;

public class Government extends Fragment {
    private CardView automotive, writing;

    public Government() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_goverment, container, false);

        automotive = rootView.findViewById(R.id.automotive);
        automotive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Automotive.class));
            }
        });

        writing = rootView.findViewById(R.id.writing);
        writing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.writing.class));
            }
        });

        return  rootView;

    }
}



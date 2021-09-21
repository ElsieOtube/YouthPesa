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


public class NonGovernment extends Fragment {
    private CardView automotive, writing, beauty, design, education, event, farm, finance, food, health, legal, sales, tech, translation;


    public NonGovernment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_non_government, container, false);

        automotive = rootView.findViewById(R.id.automotiveNon);
        automotive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Automotive.class));
            }
        });

        writing = rootView.findViewById(R.id.writingNon);
        writing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.writing.class));
            }
        });

        beauty = rootView.findViewById(R.id.beautyNon);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Beauty.class));
            }
        });

        design = rootView.findViewById(R.id.designNon);
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Design.class));
            }
        });

        education = rootView.findViewById(R.id.educationNon);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Education.class));
            }
        });

        event = rootView.findViewById(R.id.eventsNon);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Event.class));
            }
        });

        farm = rootView.findViewById(R.id.farmNon);
        farm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Farm.class));
            }
        });

        finance = rootView.findViewById(R.id.financeNon);
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Finance.class));
            }
        });

        food = rootView.findViewById(R.id.foodNon);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Food.class));
            }
        });

        health = rootView.findViewById(R.id.healthNon);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Health.class));
            }
        });

        legal = rootView.findViewById(R.id.legalNon);
        legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Legal.class));
            }
        });

        sales = rootView.findViewById(R.id.salesNon);
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Sales.class));
            }
        });

        tech = rootView.findViewById(R.id.techNon);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Tech.class));
            }
        });

        translation = rootView.findViewById(R.id.translationNon);
        translation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Translation.class));
            }
        });


        return  rootView;
    }
}
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
    private CardView automotive, writing, beauty, design, education, event, farm, finance, food, health, legal, sales, tech, translation;

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

        beauty = rootView.findViewById(R.id.beauty);
        beauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Beauty.class));
            }
        });

        design = rootView.findViewById(R.id.design);
        design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Design.class));
            }
        });

        education = rootView.findViewById(R.id.education);
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Education.class));
            }
        });

        event = rootView.findViewById(R.id.events);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Event.class));
            }
        });

        farm = rootView.findViewById(R.id.farm);
        farm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Farm.class));
            }
        });

        finance = rootView.findViewById(R.id.finance);
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Finance.class));
            }
        });

        food = rootView.findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Food.class));
            }
        });

        health = rootView.findViewById(R.id.health);
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Health.class));
            }
        });

        legal = rootView.findViewById(R.id.legal);
        legal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Legal.class));
            }
        });

        sales = rootView.findViewById(R.id.sales);
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Sales.class));
            }
        });

        tech = rootView.findViewById(R.id.tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Tech.class));
            }
        });

        translation = rootView.findViewById(R.id.translation);
        translation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), com.example.youthpesa.JobCategory.Translation.class));
            }
        });



        return  rootView;

    }
}



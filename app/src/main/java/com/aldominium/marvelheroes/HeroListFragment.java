package com.aldominium.marvelheroes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.aldominium.marvelheroes.Models.SuperHero;

import java.util.ArrayList;


public class HeroListFragment extends Fragment {

    private static final String TAG = HeroListFragment.class.getSimpleName();

    ArrayList<SuperHero> superHeroes;


    public HeroListFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Bundle bundle = getArguments();


        superHeroes = bundle.getParcelableArrayList(MainActivity.HERO_LIST);

        if (superHeroes == null)
            Log.d(TAG, "No hay superheroes en el bundle");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero_list, container, false);
    }

}

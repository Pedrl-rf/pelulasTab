package com.example.pelulastab.primerEjercicio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyPagerAdapter extends FragmentStateAdapter {

    private final ArrayList<Pelicula> listaPeliculas;

    public MyPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, ArrayList<Pelicula> listaPeliculas) {
        super(fragmentManager, lifecycle);
        this.listaPeliculas = listaPeliculas;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Pelicula pelicula = listaPeliculas.get(position);
        FragmentEquipo fragment = FragmentEquipo.newInstance(pelicula, position);
        return fragment;
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }
}

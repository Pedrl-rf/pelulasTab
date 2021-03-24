package com.example.pelulastab.primerEjercicio;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.pelulastab.R;

public class FragmentEquipo extends Fragment {
    //variable estática usada para pasar datos
    private static final String ARG_FILM = "pelicula";
    private static final String ARG_POS = "position";
    private TextView tvTitle, tvAuthor, tvYear, tvSinopsis;
    private ImageView ivPhoto;
    private ConstraintLayout frCl;

    private Pelicula pelicula;
    private int position;


    public static FragmentEquipo newInstance(Pelicula pelicula, int position) {
        Bundle args = new Bundle();
        args.putParcelable(ARG_FILM, pelicula);
        args.putInt(ARG_POS, position);

        FragmentEquipo fl = new FragmentEquipo();
        fl.setArguments(args);
        return fl;
    }

    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null){
            if (arguments.containsKey(ARG_FILM)) {
                pelicula = arguments.getParcelable(ARG_FILM);
            }
            if (arguments.containsKey(ARG_POS)) {
                position = arguments.getInt(ARG_POS);
            }
        }
    }


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pelicula, container, false);
        tvAuthor = view.findViewById(R.id.tv_author);
        tvSinopsis = view.findViewById(R.id.tv_sinopsis);
        tvTitle = view.findViewById(R.id.tv_title);
        tvYear = view.findViewById(R.id.tv_year);
        ivPhoto = view.findViewById(R.id.iv_photo);
        frCl = view.findViewById(R.id.cl_layout);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //en la variable libro tendremos los datos del libro
        tvAuthor.setText(pelicula.getTitle());
        tvYear.setText(pelicula.getYear());
        tvTitle.setText(pelicula.getTitle());
        tvSinopsis.setText(pelicula.getSinopsis());
        ivPhoto.setImageResource(pelicula.getPhoto());
    }
}

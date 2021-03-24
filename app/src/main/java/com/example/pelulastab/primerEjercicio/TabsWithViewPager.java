package com.example.pelulastab.primerEjercicio;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.example.pelulastab.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class TabsWithViewPager extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_with_pager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Cartelera");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Pelicula>listaPeliculas = new ArrayList<>();
        listaPeliculas.add(new Pelicula("Titulo","autor","1234","2001",R.drawable.harrypotter));
        listaPeliculas.add(new Pelicula("Titulo","autor","1234","2001",R.drawable.harrypotter));
        listaPeliculas.add(new Pelicula("Titulo","autor","1234","2001",R.drawable.harrypotter));
        listaPeliculas.add(new Pelicula("Titulo","autor","1234","2001",R.drawable.harrypotter));


        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), getLifecycle(),listaPeliculas);
        ViewPager2 viewPager = (ViewPager2) findViewById(R.id.viewpager);

        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                //método para configurar los tabs
                tab.setText("Pelicula " + (position + 1));
            }
        });

        mediator.attach();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

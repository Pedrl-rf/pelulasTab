package com.example.pelulastab.segundoejercicio;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Page1();
            case 1:
                return new Page2();
            case 3:
                return new Page3();
            default:
                return new Page1();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

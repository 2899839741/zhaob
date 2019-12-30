package com.community.zhao.ui.homes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.community.zhao.R;
import com.community.zhao.ui.home.HomeViewModel;

public class HomesFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of (this).get (HomeViewModel.class);
        View root = inflater.inflate (R.layout.fragment_homes, container, false);

        return root;
    }
}
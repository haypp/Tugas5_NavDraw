package com.reyjunaaf.tugas5_navdraw.ui.onigiri;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.reyjunaaf.tugas5_navdraw.R;
import com.reyjunaaf.tugas5_navdraw.databinding.FragmentOnigiriBinding;

public class onigiri extends Fragment {

    private FragmentOnigiriBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onigiri, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
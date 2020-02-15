package com.rizkykhapidsyah.p_fragments;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_satu, container, false);
        TextView IDJAVA_TextView = view.findViewById(R.id.IDXML_TextView);
        IDJAVA_TextView.setText("Fragment Satu");
        return view;
    }
}

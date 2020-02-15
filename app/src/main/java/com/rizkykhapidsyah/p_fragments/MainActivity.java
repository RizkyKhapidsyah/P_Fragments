package com.rizkykhapidsyah.p_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment IDJAVA_Fragment = null;
    Button IDJAVA_Button1, IDJAVA_Button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDJAVA_Button1 = findViewById(R.id.IDXML_Button1);
        IDJAVA_Button2 = findViewById(R.id.IDXML_Button2);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.IDXML_Button1:
                IDJAVA_Fragment = new FragmentSatu();
                MuatFragment(IDJAVA_Fragment);
                break;
            case R.id.IDXML_Button2:
                IDJAVA_Fragment = new FragmentDua();
                MuatFragment(IDJAVA_Fragment);
                break;
        }
    }

    private void MuatFragment(Fragment F) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        FT.replace(R.id.IDXML_Fragment, F);
        FT.commit();
    }


}

package com.example.job14bowo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.job14bowo.R;
import com.example.job14bowo.kuliner;
import com.example.job14bowo.busana;
import com.example.job14bowo.pplg;
import com.example.job14bowo.to;
import com.example.job14bowo.tpfl;



public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnBusana, btnKuliner, btnPplg, btnTo, btnTpfl, btnExit;

    busana fragmentBusana;
    kuliner fragmentKuliner;
    pplg fragmentpplg;
    to fragmentTo;
    tpfl fragmentTpfl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBusana = findViewById(R.id.btn_busana);
        btnKuliner = findViewById(R.id.btn_kuliner);
        btnPplg = findViewById(R.id.btn_pplg);
        btnTo = findViewById(R.id.btn_to);
        btnTpfl = findViewById(R.id.btn_tpfl);
        btnExit = findViewById(R.id.btn_exit);

        btnBusana.setOnClickListener(this);
        btnKuliner.setOnClickListener(this);
        btnPplg.setOnClickListener(this);
        btnTo.setOnClickListener(this);
        btnTpfl.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    void menuBusana() {
        fragmentBusana = new busana();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentBusana);
        ft.commit();
    }

    void menuKuliner() {
        fragmentKuliner = new kuliner();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentKuliner);
        ft.commit();
    }

    void menuPplg() {
        fragmentpplg = new pplg();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentpplg);
        ft.commit();
    }

    void menuTo() {
        fragmentTo = new to();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentTo);
        ft.commit();
    }

    void menuTpfl() {
        fragmentTpfl = new tpfl();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentTpfl);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnKuliner) {
            menuKuliner();
        }
        if (v == btnBusana) {
            menuBusana();
        }
        if (v == btnPplg) {
            menuPplg();
        }
        if (v == btnTo) {
            menuTo();
        }
        if (v == btnTpfl) {
            menuTpfl();
        }
        if (v == btnExit) {
            menuExit();
        }
    }
}
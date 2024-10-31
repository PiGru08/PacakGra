package com.example.pacakgra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> listaWidokowJablek = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaWidokowJablek.add(findViewById(R.id.imageView1));
        listaWidokowJablek.add(findViewById(R.id.imageView2));
        listaWidokowJablek.add(findViewById(R.id.imageView3));
        listaWidokowJablek.add(findViewById(R.id.imageView4));
        listaWidokowJablek.add(findViewById(R.id.imageView5));
        listaWidokowJablek.add(findViewById(R.id.imageView6));
        listaWidokowJablek.add(findViewById(R.id.imageView7));
        listaWidokowJablek.add(findViewById(R.id.imageView8));
        listaWidokowJablek.add(findViewById(R.id.imageView9));
        ukryjJablka();
        pokazLosoweJabolko();
    }

    private void pokazLosoweJabolko(){
        int losowaLiczba = (int) (Math.random()*9);
        listaWidokowJablek.get(losowaLiczba).setVisibility(View.VISIBLE);
    }

    private void ukryjJablka(){
        for (int i = 0; i < listaWidokowJablek.size(); i++) {
            listaWidokowJablek.get(i).setVisibility(View.INVISIBLE);
        }
    }
}
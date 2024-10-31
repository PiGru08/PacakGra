package com.example.pacakgra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> listaWidokowJablek = new ArrayList<>();
    int punkty =0;
    int czas = 1000*60; //TODO ustawić czas 1000 * 10 żeby było 10 sekund
    TextView textView;
    CountDownTimer countDownTimer;
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
        odliczanieCzasu();
        pokazLosoweJabolko();

    }

    private void pokazLosoweJabolko(){
        int losowaLiczba = (int) (Math.random()*9);
        listaWidokowJablek.get(losowaLiczba).setVisibility(View.VISIBLE);
        textView = findViewById(R.id.textViewLiczbaKlikniec);
        listaWidokowJablek.get(losowaLiczba).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty++;
                        view.setVisibility(View.INVISIBLE);
                        pokazLosoweJabolko();
                        ukryjJablka();
                        textView.setText("Liczba klikniętych jabłek: "+punkty);
                    }
                }
        );
    }

    private void odliczanieCzasu(){
        countDownTimer = new CountDownTimer(czas, 400) {
            @Override
            public void onTick(long l) {
                ukryjJablka();
                pokazLosoweJabolko();
            }

            @Override
            public void onFinish() {

            }
        };
        countDownTimer.start();
    }

    private void ukryjJablka(){
        for (int i = 0; i < listaWidokowJablek.size(); i++) {
            listaWidokowJablek.get(i).setVisibility(View.INVISIBLE);
        }
    }
    //TODO Do zrobienia odliczanie czasu końca gry
}
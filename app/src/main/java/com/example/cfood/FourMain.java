package com.example.cfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class FourMain extends AppCompatActivity {
    ImageView water, checheviza, chicken_grud, fish, grechka, grid_chiken, indeika, kapusta, kinoa, omlet, pasta, potatoe, salad, sirniki, sok, tushovoshi, tvorog, yogurt;
    TextView waterT, chechevizaT, chicken_grudT, fishT, grechkaT, grid_chikenT, indeikaT, kapustaT, kinoaT, omletT, pastaT, potatoeT, saladT, sirnikiT, sokT, tushovoshiT, tvorogT, yogurtT, SUM1, SUM2, SUM3, SUM41, SUM42, SUM43;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_main);
        water = findViewById(R.id.water);
        checheviza = findViewById(R.id.checheviza);
        chicken_grud = findViewById(R.id.chicken_grud);
        fish = findViewById(R.id.fish);
        grechka = findViewById(R.id.grechka);
        grid_chiken = findViewById(R.id.grid_chicken);
        indeika = findViewById(R.id.indeika);
        kapusta = findViewById(R.id.kapusta);
        kinoa = findViewById(R.id.kinoa);
        omlet = findViewById(R.id.omlet);
        pasta = findViewById(R.id.pasta);
        potatoe = findViewById(R.id.potatoe);
        salad = findViewById(R.id.salad);
        sirniki = findViewById(R.id.sirniki);
        sok = findViewById(R.id.sok);
        tushovoshi = findViewById(R.id.tushovoshi);
        tvorog = findViewById(R.id.tvorog);
        yogurt = findViewById(R.id.yogurt);
        ///
        waterT = findViewById(R.id.waterT);
        chechevizaT = findViewById(R.id.chechevizaT);
        chicken_grudT = findViewById(R.id.chicken_grudT);
        fishT = findViewById(R.id.fishT);
        grechkaT = findViewById(R.id.grechkaT);
        grid_chikenT = findViewById(R.id.grid_chickenT);
        indeikaT = findViewById(R.id.indeikaT);
        kapustaT = findViewById(R.id.kapustaT);
        kinoaT = findViewById(R.id.kinoaT);
        omletT = findViewById(R.id.omletT);
        pastaT = findViewById(R.id.pastaT);
        potatoeT = findViewById(R.id.potatoeT);
        saladT = findViewById(R.id.saladT);
        sirnikiT = findViewById(R.id.sirnikiT);
        sokT = findViewById(R.id.sokT);
        tushovoshiT = findViewById(R.id.tushovoshiT);
        tvorogT = findViewById(R.id.tvorogT);
        yogurtT = findViewById(R.id.yogurtT);
        SUM1 = findViewById(R.id.SUM1);
        SUM2 = findViewById(R.id.SUM2);
        SUM3 = findViewById(R.id.SUM3);
        SUM41 = findViewById(R.id.SUM41);
        SUM42 = findViewById(R.id.SUM42);
        SUM43 = findViewById(R.id.SUM43);
    }
}
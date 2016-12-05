package com.pupupon.armenianalphabet;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends AppCompatActivity {
    // Vars:
    Button[] buttons =  new Button[4];
    Typeface droidSansArmenian;
    Typeface sylfaen;
    Typeface mainFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        droidSansArmenian = Typeface.createFromAsset(getAssets(), "fonts/DroidSansArmenian.ttf");
        sylfaen = Typeface.createFromAsset(getAssets(), "fonts/Sylfaen.ttf");
        mainFont = sylfaen;

        // Answer Section
        buttons[0] = (Button) findViewById(R.id.menuEntry1);
        buttons[1] = (Button) findViewById(R.id.menuEntry2);
        buttons[2] = (Button) findViewById(R.id.menuEntry3);
        buttons[3] = (Button) findViewById(R.id.menuEntry4);
        buttons[3] = (Button) findViewById(R.id.menuEntry5);

        // Init Buttons:
        for (Button i: buttons) {
            i.setTypeface(mainFont);
        }

    }

    public void startMenuEntry1(View view) {
    }

    public void startMenuEntry2(View view) {
        Intent quiz = new Intent(this, QuizActivity.class);
        startActivity(quiz);
    }

    public void startMenuEntry3(View view) {
    }

    public void startMenuEntry4(View view) {
    }

    public void startMenuEntry5(View view) {
    }
}

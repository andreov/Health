package com.example.health;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class PresurActivity extends AppCompatActivity {
    public int pUp;
    public int pDown;
    public int pulse;
    //Map<LocalDateTime, Pressure> pressureMap =new TreeMap<>();
    private static final String TAG = "PRESURE";
    public boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presur);
    }
    public void btnPresProfil(View view) {
        Intent intent = new Intent(PresurActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void btnPresFitnes(View view) {
        Intent intent = new Intent(PresurActivity.this, ActivityFitnes.class);
        startActivity(intent);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void btnSavePres(View view) {
        Log.i(TAG, "Пользователь нажал кнопку сохранения давления");
        EditText textUp = findViewById(R.id.TextPresUp);
        EditText textDown = findViewById(R.id.textPresDown);
        EditText textPulse = findViewById(R.id.textPulse);

        try {
            pUp = Integer.parseInt(textUp.getText().toString());
            pDown = Integer.parseInt(textDown.getText().toString());
            pulse = Integer.parseInt(textPulse.getText().toString());
        }
        catch (Exception ex){
            Toast.makeText(PresurActivity.this, R.string.tostAge,Toast.LENGTH_LONG).show();
            Log.e(TAG, "Неверный формат данных", ex);
        }
        LocalDateTime today = LocalDateTime.now();
        Pressure valuePres = new Pressure(pUp,pDown,pulse,checked);
        PresSave presSave = new PresSave();
        presSave.addPres(today, valuePres);

    }
    public void onCheckboxClicked(View view) {
        CheckBox language = (CheckBox) view;
        checked = language.isChecked();
    }
}
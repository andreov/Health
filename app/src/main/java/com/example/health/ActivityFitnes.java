package com.example.health;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalDateTime;

public class ActivityFitnes extends AppCompatActivity {
    private static final String TAG = "FITNES";
    private int step;
    private double weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitnes);
    }

    public void btnFitProfil(View view) {
        Intent intent = new Intent(ActivityFitnes.this, MainActivity.class);
        startActivity(intent);

    }

    public void btnFitPres(View view) {
        Intent intent = new Intent(ActivityFitnes.this, PresurActivity.class);
        startActivity(intent);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void btnSaveFitn(View view) {
        Log.i(TAG, "Пользователь нажал кнопку сохранения фитнес-параметров");
        EditText textStep = findViewById(R.id.textStep);
        EditText textWeight = findViewById(R.id.TextWeight);

        try {
            step = Integer.parseInt(textStep.getText().toString());
            weight = Double.parseDouble(textWeight.getText().toString());
        }
        catch (Exception ex){
            Toast.makeText(ActivityFitnes.this, R.string.tostStep,Toast.LENGTH_LONG).show();
            Log.e(TAG, "Неверный формат данных", ex);
        }
        LocalDateTime today = LocalDateTime.now();
        Fitnes valueFitn = new Fitnes(step,weight);
        FitnSave fitnSave = new FitnSave();
        fitnSave.addPres(today, valueFitn);

    }
}
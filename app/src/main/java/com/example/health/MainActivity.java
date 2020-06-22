package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "PROFIL";
    int age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnPres(View view) {
        Intent intent = new Intent(MainActivity.this, PresurActivity.class);
        startActivity(intent);

    }

    public void btnFitnes(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityFitnes.class);
        startActivity(intent);
    }
    public void btnSave(View view) {
        Log.i(TAG, "Пользователь нажал кнопку сохранения профиля");
        EditText textName = findViewById(R.id.TextName);
        EditText textAge = findViewById(R.id.textAge);
        TextView profil= findViewById(R.id.profilView);
        String name = textName.getText().toString();
        try {
            age = Integer.parseInt(textAge.getText().toString());
        }
        catch (Exception ex){
            Toast.makeText(this, R.string.tostAge,Toast.LENGTH_LONG).show();
            Log.e(TAG, "Получено исключение", ex);
        }
        Profil valueProfil = new Profil(name,age);
        ProfilSave profilSave = new ProfilSave();
        profilSave.addProfil(valueProfil);
        //profil.setText(valueProfil.listProfil.toString());


    }
}
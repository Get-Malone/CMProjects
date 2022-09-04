package com.example.computomovil;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.computomovil.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
//importamos el boton

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button botonNav = findViewById(R.id.btnEnviar);
        EditText editText = findViewById(R.id.txtNombre);
        EditText editText2 = findViewById(R.id.txtApellido);
        String texto = botonNav.getText().toString();
        botonNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hola mundo");
                System.out.println(editText.getText().toString());
                System.out.println(editText2.getText().toString());
            }
        });
    }
}
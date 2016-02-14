package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("Registro");
        Button registrar = (Button) findViewById(R.id.bRegistrar);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Usuario creado correctamente", Toast.LENGTH_SHORT).show();
                Intent n = new Intent(RegisterActivity.this, MenuAsignaturasActivity.class);
                startActivity(n);
            }
        });
    }

    public void pasar(View v) {
        Intent nuevo = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(nuevo);
    }
}
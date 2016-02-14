package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuAsignaturasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_asignaturas);
        setTitle("Menu Principal");
    }
    public void pasar(View v){
        RadioGroup rdgGrupo = (RadioGroup) findViewById(R.id.radioGroup);
        int i = rdgGrupo.getCheckedRadioButtonId();
        int a= R.id.radioButton11;
        if(i==a){
        Intent nuevo= new Intent(MenuAsignaturasActivity.this,EtseActivity.class);
        startActivity(nuevo);}
        else{
            Toast.makeText(getApplicationContext(), "No existe la Facultad", Toast.LENGTH_SHORT).show();}
    }
}

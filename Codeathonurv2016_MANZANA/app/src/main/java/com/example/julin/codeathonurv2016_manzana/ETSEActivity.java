package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EtseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etse);
        setTitle("ETSE");
    }
    public void toInformatic(View v){
        RadioGroup rdgGrupo = (RadioGroup) findViewById(R.id.radioGroup2);
        int i = rdgGrupo.getCheckedRadioButtonId();
        int a= R.id.radioButton15;
        System.out.println("VALOR DE RADIO GROUP: " + i);
        System.out.println("VALOR DE RADIO BUTTON: " + a);
        if(i==a){
            Intent nuevo= new Intent(EtseActivity.this,InformaticaActivity.class);
            startActivity(nuevo);}
        else{
            Toast.makeText(getApplicationContext(), "No existe el grado.", Toast.LENGTH_SHORT).show();}
    }
}

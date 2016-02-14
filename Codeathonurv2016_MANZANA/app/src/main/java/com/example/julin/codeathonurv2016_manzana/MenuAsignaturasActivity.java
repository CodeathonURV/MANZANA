package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuAsignaturasActivity extends AppCompatActivity {
    ListView lista;

    String[] a = {"Facultad de Química","Facultad de Letras", "Facultad de Medicina y Ciencias de la Salud", "Facultad de Ciencias de la Educación y Psicología", "Facultad de Ciencias Jurídicas", "Facultad de Economía y Empresa", "Facultad de Enología", "Facultad de Enfermería", "Facultad de Turismo y Geografia", "Escuelta Técnica Superior de Arquitectura", "Escuelta Técnica Superior de Ingeniería", "Escuelta Técnica Superior de Ingeniería Química"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_asignaturas);
        setTitle("Menu Principal");
        lista = (ListView)findViewById(R.id.listView5);
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, a);
        lista.setAdapter(aa);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (a[position].equals("Escuelta Técnica Superior de Ingeniería")) {
                    startActivity(new Intent(MenuAsignaturasActivity.this, EtseActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "No existe la Facultad o Escuela", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EtseActivity extends AppCompatActivity {
    ListView lista;
String [] a ={"Grado en Ingeniería Eléctrica - GEE", "Grado en Ingeniería Electrónica Industrial y Automática - GEEIiA", "Grado en Ingeniería Informática - GEI", "Grado en Ingeniería Telemática - GET", "Doble titulación de Grado de Biotecnología y de Ingeniería Informática", "Doble titulación de Grado de Ingeniería Eléctrica y Electrónica Industrial y Automática"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etse);
        setTitle("ETSE");
        lista = (ListView)findViewById(R.id.listView6);
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, a);
        lista.setAdapter(aa);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (a[position].equals("Grado en Ingeniería Informática - GEI")) {
                    startActivity(new Intent(EtseActivity.this, InformaticaActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "No existe el Grado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

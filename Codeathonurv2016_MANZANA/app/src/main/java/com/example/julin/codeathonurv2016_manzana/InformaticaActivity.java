package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InformaticaActivity extends AppCompatActivity {
    ListView lista;

    String[] a = {"Primero", "Segundo", "Tercero", "Cuarto"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informatica);
        setTitle("GEI");
        lista = (ListView)findViewById(R.id.listV);
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, a);
        lista.setAdapter(aa);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(a[position].equals("Primero")){
                    startActivity(new Intent(InformaticaActivity.this,PrimeroInformaticaActivity.class));
                }
                else {
                    Toast.makeText(getApplicationContext(), "No existe el curso", Toast.LENGTH_SHORT).show();}
            }
        });
    }
}

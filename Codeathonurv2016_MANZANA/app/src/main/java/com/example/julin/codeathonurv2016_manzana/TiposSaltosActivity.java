package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TiposSaltosActivity extends AppCompatActivity {
ListView listanueva;
    String[] listaS = {"JOSE: ¿Podeis explicarme la diferencia entre MOVEQ y un MOV con un BEQ despues?","ROBERTO: Dame cinco minutos y te explico","JOSE: Vale, gracias."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_saltos);
        setTitle("Tipos de Salto");
        listanueva = (ListView)findViewById(R.id.listVie99);
        ArrayAdapter<String> l= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaS);
        listanueva.setAdapter(l);
        
    }
}

package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.LinkedList;

public class TiposSaltosActivity extends AppCompatActivity {
ListView listanueva;
    public LinkedList<String> listaS = new LinkedList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        listaS.add("JOSE: ¿Podeis explicarme la diferencia entre MOVEQ y un MOV con un BEQ despues?");
        listaS.add("ROBERTO: Dame cinco minutos y te explico");
        listaS.add("JOSE: Vale, gracias.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_saltos);
        setTitle("Tipos de Salto");
        listanueva = (ListView)findViewById(R.id.listVie99);
        ArrayAdapter<String> l= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaS);
        listanueva.setAdapter(l);
        Button mon = (Button) findViewById(R.id.button5);
        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listaS.add(((AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4)).getText().toString());
                listanueva = (ListView)findViewById(R.id.listVie99);

                setContentView(R.layout.activity_tipos_saltos);
            }
        });

    }
}

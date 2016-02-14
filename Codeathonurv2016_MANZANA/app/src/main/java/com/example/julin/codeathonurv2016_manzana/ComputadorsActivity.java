package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class ComputadorsActivity extends AppCompatActivity implements Serializable{
    public ListView listanu;
    public ArrayAdapter<String> l;
    public String[] listaD = {"Tipos de Saltos", "Suma y resta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computadors);
        setTitle("Fonaments de Computadors");
        listanu = (ListView)findViewById(R.id.google);
        l= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaD);
        listanu.setAdapter(l);
        listanu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(listaD[position].equals("Tipos de Saltos")){
                    startActivity(new Intent(ComputadorsActivity.this, TiposSaltosActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(), "No existe la asignatura", Toast.LENGTH_SHORT).show();}
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == NuevoTema.RESULT_OK){
                String result=data.getStringExtra("result");
                l.add(result);
            }
            if (resultCode == NuevoTema.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }
    public void nuevoTema(View v) {
        Intent i = new Intent(ComputadorsActivity.this,NuevoTema.class);
        startActivityForResult(i, 1);

    }
    public void añadirTema(String tema){
        l.add(tema);
    }

}

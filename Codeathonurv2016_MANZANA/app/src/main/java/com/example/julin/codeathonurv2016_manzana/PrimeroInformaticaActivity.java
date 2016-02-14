package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Julián on 14/02/2016.
 */
public class PrimeroInformaticaActivity extends AppCompatActivity {
    ListView listanueva;
    String[] listaS = {"Fonaments de Computadors", "Fonaments de Programació", "Àlgebra Lineal", "Orientació Professional i Academica", "Anàlisis Matemàtic I", "Anàlisis Matemàtic II", "Física I", "Física II", "Economia", "Anglès Tècnic"};
protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_primero_informatica);
    setTitle("Primer Curso");
    listanueva = (ListView)findViewById(R.id.listV2);
    ArrayAdapter<String> l= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listaS);
    listanueva.setAdapter(l);
    listanueva.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if(listaS[position].equals("Fonaments de Computadors")){
                startActivity(new Intent(PrimeroInformaticaActivity.this,ComputadorsActivity.class));
            }
            else{
                Toast.makeText(getApplicationContext(), "No existe la asignatura", Toast.LENGTH_SHORT).show();}
        }
    });

}
}

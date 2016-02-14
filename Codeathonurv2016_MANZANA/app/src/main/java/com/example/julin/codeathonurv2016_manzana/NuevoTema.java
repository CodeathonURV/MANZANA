package com.example.julin.codeathonurv2016_manzana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class NuevoTema extends AppCompatActivity {
    private AutoCompleteTextView Tema;
    ComputadorsActivity obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_tema);
        setTitle("Nuevo Tema");
        Button but4 = (Button) findViewById(R.id.button4);
        Intent i = getIntent();
        obj=(ComputadorsActivity)i.getSerializableExtra("x");
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Tema = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
                Intent returnIntent = new Intent();
                String result=Tema.getText().toString();
                if(!(result.equals(""))){
                returnIntent.putExtra("result",result);
                setResult(NuevoTema.RESULT_OK,returnIntent);
                finish();
                }
                else{
                    setResult(NuevoTema.RESULT_CANCELED, returnIntent);
                    finish();}
            }
        });
    }
}

package com.example.julin.codeathonurv2016_manzana;

/**
 * Created by Julián on 13/02/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent nuevo= new Intent(this,LoginActivity.class);
        startActivity(nuevo);
    }
}

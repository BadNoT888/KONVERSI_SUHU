package com.example.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText celcius,kelvin,farenheit,reamur; //Deklarasi variable Button btn_konversi; //deklarasi varaibel
    private View btn_konversi;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celcius = findViewById(R.id.edtxt_celcius);
        kelvin = findViewById(R.id.edtxt_kelvin);
        farenheit = findViewById(R.id.edtxt_farenheit);
        reamur = findViewById(R.id.edtxt_reamur);
        btn_konversi =  findViewById(R.id.btn_konvert);
    }
    public void konversisuhu (View view){
        try {
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius+273.15;
            double nfarenheit = (ncelcius*9/5)+32;
            double nreamur = ncelcius*4/5;
            kelvin.setText(String.valueOf(nkelvin));
            farenheit.setText(String.valueOf(nfarenheit));
            reamur.setText(String.valueOf(nreamur));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void keluar(View view){
        finish();
    }
}
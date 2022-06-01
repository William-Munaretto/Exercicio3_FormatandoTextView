package com.example.exercicio_3_seletorcores;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private SeekBar seekBar;
    private EditText editText;
    private Button btnEnviar;
    private CheckBox cboxNegrito;
    private CheckBox cboxItalico;
    private CheckBox cboxMaiusculas;
    private RadioGroup radioGroup;
    private RadioButton rbVermelho;
    private RadioButton rbVerde;
    private RadioButton rbAzul;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarId);
        textView = findViewById(R.id.textViewId);
        editText = findViewById(R.id.edtText);
        btnEnviar = findViewById(R.id.btnEnviar);
        cboxNegrito = findViewById(R.id.negrito);
        cboxItalico = findViewById(R.id.italico);
        cboxMaiusculas = findViewById(R.id.maiusculas);
        radioGroup = findViewById(R.id.radioGroup);
        rbVermelho = findViewById(R.id.vermelho);
        rbVerde = findViewById(R.id.verde);
        rbAzul = findViewById(R.id.azul);

        btnEnviar.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

        @Override
        public void onClick(View v) {
            textView.setText(editText.getText().toString());

        }


        public void cboxClick(View view){

            if(cboxNegrito.isChecked()){
                textView.setTypeface(null,Typeface.BOLD);

            }

            if(cboxItalico.isChecked()){
                textView.setTypeface(null,Typeface.ITALIC);

            }

            if(cboxMaiusculas.isChecked()){
                textView.setAllCaps(true);
            }

        }

        public void radioClick(View view){

            if(rbVermelho.isChecked()){
                textView.setTextColor(Color.RED);
            }
            if(rbVerde.isChecked()){
                textView.setTextColor(Color.GREEN);
            }
            if(rbAzul.isChecked()){
                textView.setTextColor(Color.BLUE);
            }
        }

}
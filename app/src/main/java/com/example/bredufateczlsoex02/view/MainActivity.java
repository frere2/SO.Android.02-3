package com.example.bredufateczlsoex02.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bredufateczlsoex02.R;
import com.example.bredufateczlsoex02.controller.NumeroController;

public class MainActivity extends AppCompatActivity {

    protected Button calcButton;
    protected Button exibirMaiorButton;
    protected EditText AValor;
    protected EditText BValor;
    protected TextView ResultadoSoma;
    protected TextView ResultadoMaior;

    private final NumeroController numeroController = new NumeroController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        calcButton = findViewById(R.id.calcButton);
        exibirMaiorButton = findViewById(R.id.exibirMaiorButton);
        AValor = findViewById(R.id.AValor);
        BValor = findViewById(R.id.BValor);
        ResultadoSoma = findViewById(R.id.ResultadoSoma);
        ResultadoMaior = findViewById(R.id.ResultadoMaior);

        addActionListeners();
    }

    private void addActionListeners() {
        calcButton.setOnClickListener((View v) -> {
            int A = Integer.parseInt(AValor.getText().toString());
            int B = Integer.parseInt(BValor.getText().toString());
            String resultado = numeroController.soma(A, B);
            ResultadoSoma.setVisibility(View.VISIBLE);
            ResultadoSoma.setText(resultado);
        });

        exibirMaiorButton.setOnClickListener((View v) -> {
            int A = Integer.parseInt(AValor.getText().toString());
            int B = Integer.parseInt(BValor.getText().toString());
            String resultado = numeroController.maior(A, B);
            ResultadoMaior.setVisibility(View.VISIBLE);
            ResultadoMaior.setText(resultado);
        });

    }
}
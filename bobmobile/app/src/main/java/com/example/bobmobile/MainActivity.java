package com.example.bobmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText numeral1;
    private EditText numeral2;
    private TextView resposta_lb;


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
        resposta_lb = findViewById(R.id.resultado_lb);

        numeral1 = findViewById(R.id.numero1_field);

        numeral2 = findViewById(R.id.numero2_field);


    }

    public void somar()
    {
        double n1 = Double.parseDouble(numeral1.getText().toString());
        double n2 = Double.parseDouble(numeral2.getText().toString());
        String resposta = "A resposta e "+(n1+n2);
        resposta_lb.setText(resposta);
        resposta_lb.setVisibility(View.VISIBLE);
    }
}
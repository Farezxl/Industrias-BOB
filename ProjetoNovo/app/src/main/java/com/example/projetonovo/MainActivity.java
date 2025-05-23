package com.example.projetonovo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    /* public void entrarClicado(View v){
        EditText editLogin = findViewById(R.id.idLogin);
        String nome = editLogin.getText().toString();
        String sejaBemvindo = "Seja bem-vindo(a), " + nome;
        Toast.makeText(this, sejaBemvindo, Toast.LENGTH_SHORT).show();
    public void entrarClicado(View v){
        EditText editNome = findViewById(R.id.idName);
        String nome = editNome.getText().toString();
        EditText editAno = findViewById(R.id.idNumber);
        String number = editAno.getText().toString();
        int numero = Integer.parseInt(number);
        String calculo = String.valueOf(2025 - numero);
        Toast.makeText(this, "Nome: "+ nome +" Idade: " + calculo, Toast.LENGTH_SHORT).show();
    }
    public void entrarClicado(View v){
        EditText editNome = findViewById(R.id.idName);
        String nome = editNome.getText().toString();
        Intent loise = new Intent (this, Tela2.class);
        loise.putExtra("login", nome);
        startActivity(loise);
    }*/
    public void entrarClicado(View v) {

        Intent loise = new Intent(this, Tela2.class);

        EditText dado = findViewById(R.id.dado1);
        String



    }

}
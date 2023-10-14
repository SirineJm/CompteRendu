package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {
    private TextView textViewHello;
    private int currentNumber = 0;
    private TextView textViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        textViewHello = findViewById(R.id.textView_hello);
        textViewCounter=findViewById(R.id.textView_counter);

        // Récupérer la valeur du compteur depuis l'Intent
        currentNumber = getIntent().getIntExtra("CURRENT_NUMBER", 0);

        updateHelloText();
        updateCounterText(currentNumber);
    }

    // Méthode pour mettre à jour le texte affiché dans HelloActivity
    private void updateHelloText() {
        String message = "Hello!";
        textViewHello.setText(message);
    }
    private void updateCounterText(int number) {
        String count = String.valueOf(number);
        textViewCounter.setText(count);
    }
}

package com.example.gobus.Fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gobus.MainActivity;
import com.example.gobus.R;

public class Pembayaran extends AppCompatActivity {

    Button button;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("EditText", text.getText().toString());
                clipboard.setPrimaryClip(clip);


                Toast.makeText(Pembayaran.this, "Copied", Toast.LENGTH_SHORT).show();

            }
        });
    }
}

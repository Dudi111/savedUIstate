package com.example.saveuistates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView view;
    private EditText edhere;
    private Button mbtnbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.tvview);
        edhere=findViewById(R.id.ettype);
        mbtnbutton=findViewById(R.id.btnbutton1);

        edhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edhere.getText().toString().length()>=6){
                    Toast.makeText(MainActivity.this,edhere.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
        mbtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"ButtonClicked",Toast.LENGTH_LONG).show();
            }
        });

    }
}
package com.travelbee.guido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.textView5);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HelpDesk!!", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this,HelpDesk.class);
                startActivity(intent);
            }
        });

        textView=(TextView) findViewById(R.id.textView4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login Page For Visitor!!", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this,LoginVisitor.class);
                startActivity(intent);
            }
        });

        button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Register Successfully!!", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,LoginVisitor.class);
                startActivity(intent);
            }
        });
    }
    }

package com.travelbee.guido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginVisitor extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        textView =(TextView) findViewById(R.id.textView8);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login Page For Staff!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(LoginVisitor.this,LoginStaff.class);
                startActivity(intent);
            }
        });
        textView =(TextView) findViewById(R.id.textView10);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Help Desk!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(LoginVisitor.this,HelpDesk.class);
                startActivity(intent);
            }
        });
        textView =(TextView) findViewById(R.id.textView9);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Register Page For Visitor!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(LoginVisitor.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(LoginVisitor.this,HomescreenForVisitor.class);
                startActivity(intent);
            }
        });
    }
}
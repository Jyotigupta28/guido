package com.travelbee.guido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginStaff extends AppCompatActivity {
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginstaff);

        textView=(TextView)  findViewById(R.id.textView16);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Login Page For Visitor!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(LoginStaff.this,LoginVisitor.class);
                startActivity(intent);
            }
        });
        textView=(TextView)  findViewById(R.id.textView17);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Help Desk!!",Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(LoginStaff.this,HelpDesk.class);
                startActivity(intent);
            }
        });
    }
}
package com.travelbee.guido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomescreenForVisitor extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen_for_visitor);

        button= (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scan QR!!", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(HomescreenForVisitor.this,Scanner.class);
                startActivity(intent);
            }
        });
        button= (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Ticket Booking", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(HomescreenForVisitor.this,TicketBooking.class);
                startActivity(intent);
            }
        });
        button= (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(HomescreenForVisitor.this,Map_Page.class);
                startActivity(intent);
            }
        });
    }
}
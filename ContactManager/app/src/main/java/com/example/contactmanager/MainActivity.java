package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import com.data.DatabaseHandler;
import com.model.Contact;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button submit ;
    private Button show;
    private EditText gName, gContact;


    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit = findViewById(R.id.myBut);
        gName = findViewById(R.id.name);
        gContact = findViewById(R.id.contact);
        show = findViewById(R.id.myBut2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              // final DatabaseHandler db = null;
                Contact person = new Contact();
                person.setName(String.valueOf(gName));
                person.setPhoneNumber(String.valueOf(gContact));
               // db.addContact(person);

                Toast.makeText(MainActivity.this, "Contact registered with success", Toast.LENGTH_SHORT).show();

            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();


            }
        });



    }
}
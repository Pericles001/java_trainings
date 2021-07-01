package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.data.DatabaseHandler;
import com.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class shower extends AppCompatActivity {

    private ListView myView ;
    private ArrayList contactArrayList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);

        DatabaseHandler db2 = new DatabaseHandler(shower.this);
        contactArrayList = new ArrayList();
        myView =  findViewById(R.id.view);

        List <Contact> contactList = db2.getAllContacts();

        for (Contact contact : contactList ){
            Log.d("MainActivity", "onCreate: " + contact.getName() );
            contactArrayList.add(contact.getName() + " : " + contact.getPhoneNumber() );
        }

        arrayAdapter = new ArrayAdapter(
                this, android.R.layout
        )
    }
}
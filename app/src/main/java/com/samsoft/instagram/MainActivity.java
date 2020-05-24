package com.samsoft.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void cont_func(View view){
        EditText username = (EditText)findViewById(R.id.username);
        EditText email = (EditText)findViewById(R.id.email);
        EditText phone = (EditText)findViewById(R.id.phone);
        EditText address = (EditText)findViewById(R.id.address);
        EditText password = (EditText)findViewById(R.id.password);
        Log.i( "value",username.getText().toString());
        Log.i( "value",email.getText().toString());
        Log.i( "value",phone.getText().toString());
        Log.i( "value",address.getText().toString());
        Log.i( "value",password.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

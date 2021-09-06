package com.example.intro_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView first_txt = findViewById(R.id.FirstTxt);
        TextView last_txt = findViewById(R.id.LastTxt);
        TextView email_txt = findViewById(R.id.EmailTxt);

        EditText editFirstName = findViewById(R.id.user_name_txt);
        EditText editLastName = findViewById(R.id.last_name_txt);
        EditText editEmailName = findViewById(R.id.email_name_txt);


        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String emailName = editEmailName.getText().toString();

        first_txt.setText("First Name: " + firstName);
        last_txt.setText("Last Name: " + lastName);
        email_txt.setText("Email: " + emailName);
    }

}
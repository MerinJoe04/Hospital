package com.example.hospitalapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {

    EditText et3,et4,et5,et6,et7,et8,et9;
    Button b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        et3=(EditText) findViewById(R.id.uname);
        et4=(EditText) findViewById(R.id.adna);
        et5=(EditText) findViewById(R.id.pna);
        et6=(EditText) findViewById(R.id.mnam);
        et7=(EditText) findViewById(R.id.usname);
        et8=(EditText) findViewById(R.id.pname);
        et9=(EditText) findViewById(R.id.ussna);

    }
}
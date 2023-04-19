package com.example.castro_mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class smsSend extends AppCompatActivity {

    Button btnSend;
    Button btnClear;
    EditText txtPhone;
    EditText txtMessage;
    String phone;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_send);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnSend = (Button) findViewById(R.id.btnSend);
        txtPhone = (EditText) findViewById(R.id.txtPhoneNumber);
        txtMessage = (EditText) findViewById(R.id.txtMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    txtPhone.setText("");
                    txtMessage.setText("");
                    Toast.makeText(smsSend.this, "Cleared", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
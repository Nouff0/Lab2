package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button send_button;
    EditText send_text;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button= (Button) findViewById(R.id.send_button_id);
        send_text = (EditText) findViewById(R.id.send_text_id);

        String str;

        send_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String str;
                str = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("message_key",str);
                startActivity(intent);
            }
        });}



}

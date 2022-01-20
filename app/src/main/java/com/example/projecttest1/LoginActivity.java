package com.example.projecttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText et_id,et_pw;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setTitle("ORACLE");

        btn_login = (Button)findViewById(R.id.btn_login);
        et_id = (EditText)findViewById(R.id.et_id);
        et_pw = (EditText)findViewById(R.id.et_pw);

        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                try {
                    String result;
                    String id = et_id.getText().toString();
                    String pw = et_pw.getText().toString();


                    RegisterActivity task = new RegisterActivity();
                    result = task.execute(id, pw).get();
                } catch (Exception e) {
                    Log.i("DB test", ".....ERROR.....!");
                }
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }

        });


    }
}
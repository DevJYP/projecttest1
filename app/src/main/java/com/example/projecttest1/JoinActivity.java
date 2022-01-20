package com.example.projecttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {

    EditText et_id_j,et_pw_j,et_name,et_address,et_pn;

    Button btn_join_j,btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        et_id_j =findViewById(R.id.et_id_j);
        et_pw_j =findViewById(R.id.et_pw_j);
        et_name = findViewById(R.id.et_name);
        et_address = findViewById(R.id.et_address);
        et_pn = findViewById(R.id.et_pn);

        btn_join_j = findViewById(R.id.btn_join_j);
        btn_cancel =findViewById(R.id.btn_cancel);

    }
}
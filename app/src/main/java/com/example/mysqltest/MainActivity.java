package com.example.mysqltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edName ;
    private EditText edPass ;
    private Button btnSubmit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        edName = findViewById(R.id.etName);
        //edPass = findViewById(R.id.etPass);
    }


    public void btnSubmitOnClick(View view) {
        edPass = findViewById(R.id.etPass);

        String userName = "M" ;
        String userPass = "0595";

        if (!edName.getText().toString().equals(userName.trim())){
            Toast.makeText(this,"Wrong User Name",Toast.LENGTH_SHORT).show();
        }else if(!edPass.getText().toString().equals(userPass.trim())){
            Toast.makeText(this,"Wrong User Pass",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Yesssss",Toast.LENGTH_SHORT).show();
        }



    }
}
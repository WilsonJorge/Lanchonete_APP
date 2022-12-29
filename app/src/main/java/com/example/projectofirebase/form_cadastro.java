package com.example.projectofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class form_cadastro extends AppCompatActivity {
EditText username,password;
Button registar;
DB DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
        getSupportActionBar().hide();

        username=findViewById(R.id.edit_email);
        password=findViewById(R.id.edit_password);
        password.setTransformationMethod(new PasswordTransformationMethod());
        registar=findViewById(R.id.registo);
        DB=new DB(this);

        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                if (user.equals("")|| pass.equals(""))
                {
                    Toast.makeText(form_cadastro.this,"Please enter all the Field",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean insert=DB.inserirDados(user,pass);
                    if (insert==true)
                    {
                        Toast.makeText(form_cadastro.this,"Registered successfull",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(form_cadastro.this,FormLogin.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(form_cadastro.this,"Registered Faild",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
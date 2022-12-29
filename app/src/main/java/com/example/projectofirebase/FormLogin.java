package com.example.projectofirebase;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private Button btn_login;
    private EditText user_text,user_pass;
    private ProgressBar progressBar;
    DB DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        getSupportActionBar().hide();
        IniciarComponentes();
        IniciarComponentesDashboard();

        user_text=findViewById(R.id.edit_email);
        user_pass=findViewById(R.id.edit_senha);
        progressBar=findViewById(R.id.progressbar);
        user_pass.setTransformationMethod(new PasswordTransformationMethod());
        DB=new DB(this);
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(FormLogin.this,form_cadastro.class);
                startActivity(i);
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String user=user_text.getText().toString();
                String pass=user_pass.getText().toString();
                if (user.equals("")|| pass.equals(""))
                {
                    Toast.makeText(FormLogin.this,"Please enter all the Field",Toast.LENGTH_SHORT).show();
                }
                else {
                    boolean verificaruserpass=DB.verificarUserPassword(user,pass);
                    if (verificaruserpass==true)
                    {

                        progressBar.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent i= new Intent(FormLogin.this,MyDashboard.class);
                                startActivity(i);
                                finish();
                            }
                        },3000);

                    }
                    else
                    {
                        Toast.makeText(FormLogin.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


    private  void IniciarComponentes()
    {
        text_tela_cadastro=findViewById(R.id.tela_cadastro);
    }
    private  void IniciarComponentesDashboard()
    {
        btn_login=findViewById(R.id.bt_login);
    }
}
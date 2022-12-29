package com.example.projectofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MyDashboard extends AppCompatActivity {
    private FloatingActionButton fabpizza;
    private FloatingActionButton fabHamburguer,fabsanduiche,fabcocktail,fabcerveja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dashboard);
        getSupportActionBar().hide();

        fabpizza=findViewById(R.id.fab_pizza);
        fabpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             switch (view.getId())
             {
                 case R.id.fab_pizza: screnMenu();
                     break;
             }
            }
        });

        fabHamburguer=findViewById(R.id.fab_hamburguer);
        fabHamburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_hamburguer: screnMenuHamburguer();
                        break;
                }
            }
        });

        fabsanduiche=findViewById(R.id.fab_sanduiche);
        fabsanduiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_sanduiche: screnMenuSanduiche();
                        break;
                }
            }
        });

        fabcocktail=findViewById(R.id.fab_cok);
        fabcocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_cok: screnMenuCockTail();
                        break;
                }
            }
        });
        fabcerveja=findViewById(R.id.fab_bear);
        fabcerveja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_bear: screnMenuCerveja();
                        break;
                }
            }
        });
    }

    public void screnMenu()
    {
        Intent menuPizza=new Intent(this,PizzaMenu.class);
        startActivity(menuPizza);
    }

    public void screnMenuHamburguer()
    {
        Intent hamburguerMenu=new Intent(this,HamburguerMenu.class);
        startActivity(hamburguerMenu);
    }

    public void screnMenuSanduiche()
    {
        Intent hamburguerMenu=new Intent(this,SandwichMenu.class);
        startActivity(hamburguerMenu);
    }

    public void screnMenuCockTail()
    {
        Intent hamburguerMenu=new Intent(this,Cocktail.class);
        startActivity(hamburguerMenu);
    }

    public void screnMenuCerveja()
    {
        Intent hamburguerMenu=new Intent(this,CervejaMenu.class);
        startActivity(hamburguerMenu);
    }

}

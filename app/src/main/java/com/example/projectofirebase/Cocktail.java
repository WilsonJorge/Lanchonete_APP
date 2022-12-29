package com.example.projectofirebase;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class Cocktail extends AppCompatActivity {
    FloatingActionButton fabPizza1,fabHamburguer1;
    MaterialCardView cardPizza1,cardHamburguer1;
    TextView tvInforPizza1,tvInforHamburguer1;
    boolean flag=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cocktail);
        fabPizza1=findViewById(R.id.fab_cocktail);
        fabHamburguer1=findViewById(R.id.fab_cocktail_1);
        cardHamburguer1=findViewById(R.id.card_hamburguer_1);
        cardPizza1=findViewById(R.id.card_hamburguer_1);
        tvInforPizza1=findViewById(R.id.tv_info_pizza_1);
        tvInforHamburguer1=findViewById(R.id.tv_info_hamburguer_1);

        fabPizza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_cocktail:
                        if (flag==true)
                        {
                            RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams)cardPizza1.getLayoutParams();
                            layoutParams.height=600;
                            cardPizza1.setLayoutParams(layoutParams);
                            tvInforPizza1.setVisibility(View.VISIBLE);
                            tvInforPizza1.setText("Este Cocktail foi selecionado pra criar grande capacidade de vencer constipacoes e gripe ");
                            flag=false;
                        }
                        else {
                            flag=true;
                            RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams)cardPizza1.getLayoutParams();
                            layoutParams.height=300;
                            cardPizza1.setLayoutParams(layoutParams);
                            tvInforPizza1.setVisibility(View.GONE);

                        }

                }
            }
        });
        init();

        fabHamburguer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId())
                {
                    case R.id.fab_cocktail_1:_1:
                    if (flag==true)
                    {
                        RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams)cardHamburguer1.getLayoutParams();
                        layoutParams.height=600;
                        cardHamburguer1.setLayoutParams(layoutParams);
                        tvInforHamburguer1.setVisibility(View.VISIBLE);
                        tvInforHamburguer1.setText("Este foi selecionado pra criar sabores que agradacem a realeza e deixar o sistema circulatorio mais saudavel ");
                        flag=false;
                    }
                    else {
                        flag=true;
                        RelativeLayout.LayoutParams layoutParams= (RelativeLayout.LayoutParams)cardHamburguer1.getLayoutParams();
                        layoutParams.height=300;
                        cardHamburguer1.setLayoutParams(layoutParams);
                        tvInforHamburguer1.setVisibility(View.GONE);

                    }

                }
            }
        });
        init_hamburguer();

    }

    public void init()
    {
        tvInforPizza1.setVisibility(View.INVISIBLE);
    }

    public void init_hamburguer()
    {
        tvInforHamburguer1.setVisibility(View.INVISIBLE);
    }
}
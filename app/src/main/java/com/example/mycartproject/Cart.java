package com.example.mycartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent intent = getIntent(); //intent 받기


        TextView name6 = (TextView) findViewById(R.id.nobbk_name);
        TextView price6 = (TextView) findViewById(R.id.nobbk_price);


        String nameProduct6 = intent.getStringExtra("Namenobbk");
        String priceProduct6 = intent.getStringExtra("Pricenobbk");

        name6.setText(nameProduct6);
        price6.setText(priceProduct6);


        TextView nameSE = (TextView) findViewById(R.id.duckb_name);
        TextView priceSE = (TextView) findViewById(R.id.duckb_price);

        String nameProductSE = intent.getStringExtra("Nameduckb");
        String priceProductSE = intent.getStringExtra("Priceduckb");

        nameSE.setText(nameProductSE);
        priceSE.setText(priceProductSE);


        TextView name3 = (TextView) findViewById(R.id.hugcs_name);
        TextView price3 = (TextView) findViewById(R.id.hugcs_price);

        String nameProduct3 = intent.getStringExtra("Namehugcs");
        String priceProduct3 = intent.getStringExtra("Pricehugcs");

        name3.setText(nameProduct3);
        price3.setText(priceProduct3);

        //아무것도 담기지 않았을 때
        TextView nothing = (TextView) findViewById(R.id.nothing_TV);

        String noProduct = intent.getStringExtra("Nothing");

        nothing.setText(noProduct);

        //상품이 선택 안되었을때 체크박스 안보이게 만들기
        CheckBox chknobbk = (CheckBox) findViewById(R.id.chknobbk);
        CheckBox chkduckb = (CheckBox) findViewById(R.id.chkduckb);
        CheckBox chk3 = (CheckBox) findViewById(R.id.chkhugcs);
        if(nameProduct6 == null) {
            chknobbk.setVisibility(android.view.View.INVISIBLE);
        }
        if(nameProductSE == null) {
            chkduckb.setVisibility(android.view.View.INVISIBLE);
        }
        if(nameProduct3 == null) {
            chk3.setVisibility(android.view.View.INVISIBLE);
        }

        //홈화면 돌아가기
        Button homeButton = (Button) findViewById(R.id.home);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //결제창 넘어가기
        Button order = (Button) findViewById(R.id.order);

        order.setOnClickListener(new View.OnClickListener() {

            final CheckBox chk6 = (CheckBox) findViewById(R.id.chknobbk);
            final CheckBox chkse = (CheckBox) findViewById(R.id.chkduckb);
            final CheckBox chk3 = (CheckBox) findViewById(R.id.chkhugcs);

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Payment.class);

                if(chk6.isChecked()) {
                    intent.putExtra("Namenobbk", "[Dr.NOAH]대나무칫솔 basic kit ");
                    intent.putExtra("Pricenobbk", "13,000 원");
                }

                if(chkse.isChecked()) {
                    intent.putExtra("Nameduckb", "[덕분애] 대나무 칫솔");
                    intent.putExtra("Priceduckb", "5,000 원");
                }

                if(chk3.isChecked()) {
                    intent.putExtra("Namehugcs", "[EarthHug]옥수수 생분해 어린이용 빨대");
                    intent.putExtra("Pricehugcs", "6,600 원");
                }

                if(!chk6.isChecked() && !chkse.isChecked() && !chk3.isChecked()) {
                    intent.putExtra("Nothing", "결제할 상품이 없습니다.");
                }

                startActivity(intent);

                //돌아왔을 때 체크박스가 선택되어 있지 않도록 설정
                chk6.setChecked(false);
                chkse.setChecked(false);
                chk3.setChecked(false);
            }
        });

    }
}
package com.example.mycartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox chknobbk = (CheckBox) findViewById(R.id.chk_drnoah_brushbasickit);
        final CheckBox chknoblk = (CheckBox) findViewById(R.id.chk_drnoah_brushlitekit);
        final CheckBox chkduckb = (CheckBox) findViewById(R.id.chk_duckboonae_brush);
        final CheckBox chkducks = (CheckBox) findViewById(R.id.chk_duckboonae_sooaeme);
        final CheckBox chkduckst = (CheckBox) findViewById(R.id.chk_duckboonae_straw);
        final CheckBox chkducktea = (CheckBox) findViewById(R.id.chk_duckboonae_teaback);
        final CheckBox chkhugs = (CheckBox) findViewById(R.id.chk_earthhug_straw);
        final CheckBox chkhugcs = (CheckBox) findViewById(R.id.chk_earthhug_childstraw);
        final CheckBox chkringcb = (CheckBox) findViewById(R.id.chk_earthring_childbrush);
        final CheckBox chkrings2 = (CheckBox) findViewById(R.id.chk_earthring_soosaeme2);
        final CheckBox chkrings1 = (CheckBox) findViewById(R.id.chk_earthring_soosame1);
        final CheckBox chkrings = (CheckBox) findViewById(R.id.chk_earthring_straw);
        final CheckBox chkringt = (CheckBox) findViewById(R.id.chk_earthring_teaback);
        final CheckBox chkgb = (CheckBox) findViewById(R.id.chk_gee9_brush);
        final CheckBox chkgbc = (CheckBox) findViewById(R.id.chk_gee9_brushcover);


        Button cart_total = (Button) findViewById(R.id.cart_total);
        Button buy_total = (Button) findViewById(R.id.buy_total);

        //상품 선택 페이지에서 장바구니 버튼 눌렀을 때 작동
        cart_total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Cart.class); //장바구니 액티비티로 이동


                if(chknobbk.isChecked()) {
                    intent.putExtra("Namenobbk", "[Dr.NOAH]대나무칫솔 basic kit ");
                    intent.putExtra("Pricenobbk", "13,000 원");
                }


                if(chknoblk.isChecked()) {
                    intent.putExtra("Namenoblk", "drnoah_brushlitekit");
                    intent.putExtra("Pricenoblk", "5,800 원");
                }

                if(chkduckb.isChecked()) {
                    intent.putExtra("Nameduckb", "[덕분애]대나무 칫솔");
                    intent.putExtra("Priceduckb", "5,000 원");
                }

                if(chkducks.isChecked()) {
                    intent.putExtra("Nameducks", "duckboonae_sooaeme");
                    intent.putExtra("Priceducks", "4,000 원");
                }

                if(chkduckst.isChecked()) {
                    intent.putExtra("Nameduckst", "duckboonae_straw");
                    intent.putExtra("Priceduckst", "4,400 원");
                }

                if(chkducktea.isChecked()) {
                    intent.putExtra("Nameducktea", "duckboonae_teaback");
                    intent.putExtra("Priceducktea", "3,000 원");
                }

                if(chkhugcs.isChecked()) {
                    intent.putExtra("Namehugcs", "[EarthHug]옥수수 생분해 어린이용 빨대");
                    intent.putExtra("Pricehugcs", "6,600 원");
                }

                if(chkhugs.isChecked()) {
                    intent.putExtra("Namehugs", "earthhug_straw");
                    intent.putExtra("Pricehugs", "6,600 원");
                }

                if(chkringcb.isChecked()) {
                    intent.putExtra("Nameringcb", "earthring_childbrush");
                    intent.putExtra("Priceringcb", "490 원");
                }

                if(chkrings2.isChecked()) {
                    intent.putExtra("Namerings2", "earthring_soosaeme2");
                    intent.putExtra("Pricerings2", "700 원");
                }

                if(chkrings1.isChecked()) {
                    intent.putExtra("Namerings1", "earthring_soosaeme1");
                    intent.putExtra("Pricerings1", "2,500 원");
                }

                if(chkrings.isChecked()) {
                    intent.putExtra("Namerings", "earthring_straw");
                    intent.putExtra("Pricerings", "390 원");
                }

                if(chkringt.isChecked()) {
                    intent.putExtra("Nameringt", "earthring_teaback");
                    intent.putExtra("Priceringt", "1,500 원");
                }

                if(chkgb.isChecked()) {
                    intent.putExtra("Namegb", "gee9_brush");
                    intent.putExtra("Pricegb", "3,000 원");
                }

                if(chkgbc.isChecked()) {
                    intent.putExtra("Namegbc", "gee9_brushcover");
                    intent.putExtra("Pricegbc", "800 원");
                }


                //체크박스가 아무것도 선택되지 않았을 때
                if(!chknobbk.isChecked() && !chknoblk.isChecked() && !chkduckb.isChecked()&& !chkducks.isChecked()
                        && !chkduckst.isChecked()&& !chkducktea.isChecked()&& !chkhugcs.isChecked()
                        && !chkhugs.isChecked()&& !chkringcb.isChecked()&& !chkrings.isChecked()
                        && !chkrings1.isChecked()&& !chkrings2.isChecked()&& !chkringt.isChecked()
                        && !chkgb.isChecked()&& !chkgbc.isChecked()) {
                    intent.putExtra("Nothing", "장바구니에 담긴 상품이 없습니다.");
                }

                startActivity(intent); //액티비티 이동

                //돌아왔을 때 체크박스가 선택되어 있지 않도록 설정
                chknobbk.setChecked(false);
                chknoblk.setChecked(false);
                chkduckb.setChecked(false);
                chkducks.setChecked(false);
                chkduckst.setChecked(false);
                chkducktea.setChecked(false);
                chkhugcs.setChecked(false);
                chkhugs.setChecked(false);
                chkringcb.setChecked(false);
                chkrings.setChecked(false);
                chkrings1.setChecked(false);
                chkrings2.setChecked(false);
                chkringt.setChecked(false);
                chkgb.setChecked(false);
                chkgbc.setChecked(false);
            }
        });

        //상품 선택 페이지에서 바로구매 버튼 눌렀을 때 작동
        buy_total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Payment.class); //결제 액티비티로 이동

                if(chknobbk.isChecked()) {
                    intent.putExtra("Namenobbk", "drnoah_brushbasickit");
                    intent.putExtra("Pricenobbk", "13,000 원");
                }


                if(chknoblk.isChecked()) {
                    intent.putExtra("Namenoblk", "drnoah_brushlitekit");
                    intent.putExtra("Pricenoblk", "5,800 원");
                }

                if(chkduckb.isChecked()) {
                    intent.putExtra("Nameduckb", "duckboonae_brush");
                    intent.putExtra("Priceduckb", "5,000 원");
                }

                if(chkducks.isChecked()) {
                    intent.putExtra("Nameducks", "duckboonae_sooaeme");
                    intent.putExtra("Priceducks", "4,000 원");
                }

                if(chkduckst.isChecked()) {
                    intent.putExtra("Nameduckst", "duckboonae_straw");
                    intent.putExtra("Priceduckst", "4,400 원");
                }

                if(chkducktea.isChecked()) {
                    intent.putExtra("Nameducktea", "duckboonae_teaback");
                    intent.putExtra("Priceducktea", "3,000 원");
                }

                if(chkhugcs.isChecked()) {
                    intent.putExtra("Namehugcs", "earthhug_childstraw");
                    intent.putExtra("Pricehugcs", "6,600 원");
                }

                if(chkhugs.isChecked()) {
                    intent.putExtra("Namehugs", "earthhug_straw");
                    intent.putExtra("Pricehugs", "6,600 원");
                }

                if(chkringcb.isChecked()) {
                    intent.putExtra("Nameringcb", "earthring_childbrush");
                    intent.putExtra("Priceringcb", "490 원");
                }

                if(chkrings2.isChecked()) {
                    intent.putExtra("Namerings2", "earthring_soosaeme2");
                    intent.putExtra("Pricerings2", "700 원");
                }

                if(chkrings1.isChecked()) {
                    intent.putExtra("Namerings1", "earthring_soosaeme1");
                    intent.putExtra("Pricerings1", "2,500 원");
                }

                if(chkrings.isChecked()) {
                    intent.putExtra("Namerings", "earthring_straw");
                    intent.putExtra("Pricerings", "390 원");
                }

                if(chkringt.isChecked()) {
                    intent.putExtra("Nameringt", "earthring_teaback");
                    intent.putExtra("Priceringt", "1,500 원");
                }

                if(chkgb.isChecked()) {
                    intent.putExtra("Namegb", "gee9_brush");
                    intent.putExtra("Pricegb", "3,000 원");
                }

                if(chkgbc.isChecked()) {
                    intent.putExtra("Namegbc", "gee9_brushcover");
                    intent.putExtra("Pricegbc", "800 원");
                }

                if(!chknobbk.isChecked() && !chknoblk.isChecked() && !chkduckb.isChecked()&& !chkducks.isChecked()
                        && !chkduckst.isChecked()&& !chkducktea.isChecked()&& !chkhugcs.isChecked()
                        && !chkhugs.isChecked()&& !chkringcb.isChecked()&& !chkrings.isChecked()
                        && !chkrings1.isChecked()&& !chkrings2.isChecked()&& !chkringt.isChecked()
                        && !chkgb.isChecked()&& !chkgbc.isChecked()) {
                    intent.putExtra("Nothing", "결제할 상품이 없습니다.");
                }

                startActivity(intent); //액티비티 이동

                //돌아왔을 때 체크박스가 선택되어 있지 않도록 설정
                chknobbk.setChecked(false);
                chknoblk.setChecked(false);
                chkduckb.setChecked(false);
                chkducks.setChecked(false);
                chkduckst.setChecked(false);
                chkducktea.setChecked(false);
                chkhugcs.setChecked(false);
                chkhugs.setChecked(false);
                chkringcb.setChecked(false);
                chkrings.setChecked(false);
                chkrings1.setChecked(false);
                chkrings2.setChecked(false);
                chkringt.setChecked(false);
                chkgb.setChecked(false);
                chkgbc.setChecked(false);
            }
        });

    }
}
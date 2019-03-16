package com.example.gridlayout;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    ArrayList<Integer> lista = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        lista.add(R.drawable.img_1);
        lista.add(R.drawable.img_2);
        lista.add(R.drawable.img_3);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        int img = (int) (Math.random()*3);
        Log.i("id",viewId+" ");
        switch (viewId){
            case R.id.img1:

                img1.setImageResource(lista.get(img));


                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();

                break;
            case R.id.img2:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img2.setImageResource(lista.get(img));
                break;
            case R.id.img3:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img3.setImageResource(lista.get(img));
                break;
            case R.id.img4:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img4.setImageResource(lista.get(img));
                break;
            case R.id.img5:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img5.setImageResource(lista.get(img));
                break;
            case R.id.img6:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img6.setImageResource(lista.get(img));
                break;
            case R.id.img7:
                img7.setImageResource(lista.get(img));
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();

                break;
            case R.id.img8:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img8.setImageResource(lista.get(img));
                break;
            case R.id.img9:
                //Toast.makeText(MainActivity.this,color,Toast.LENGTH_LONG).show();
                img9.setImageResource(lista.get(img));
                break;

        }
    }

}

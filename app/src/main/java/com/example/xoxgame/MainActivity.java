package com.example.xoxgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    ImageView img1,img2, img3,img4,img5,img6,img7,img8,img9;
    int check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img1.setImageResource(R.drawable.cancel);
                }
                else {
                    img1.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img2.setImageResource(R.drawable.cancel);
                }
                else {
                    img2.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img3.setImageResource(R.drawable.cancel);
                }
                else {
                    img3.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img4.setImageResource(R.drawable.cancel);
                }
                else {
                    img4.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img5.setImageResource(R.drawable.cancel);
                }
                else {
                    img5.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img6.setImageResource(R.drawable.cancel);
                }
                else {
                    img6.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img7.setImageResource(R.drawable.cancel);
                }
                else {
                    img7.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img8.setImageResource(R.drawable.cancel);
                }
                else {
                    img8.setImageResource(R.drawable.o);
                }
                check++;
            }
        });img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check%2==0){
                    img9.setImageResource(R.drawable.cancel);
                }
                else {
                    img9.setImageResource(R.drawable.o);
                }
                check++;
            }
        });
    }
}
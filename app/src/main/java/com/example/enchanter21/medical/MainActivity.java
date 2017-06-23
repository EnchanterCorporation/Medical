package com.example.enchanter21.medical;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        v1=findViewById(R.id.view1);
        v2=findViewById(R.id.view2);
        v3=findViewById(R.id.view3);
        v4=findViewById(R.id.view4);
        v5=findViewById(R.id.view5);
        v6=findViewById(R.id.view6);
        v7=findViewById(R.id.view7);
        v8=findViewById(R.id.view8);
        v9=findViewById(R.id.view9);
        v10=findViewById(R.id.view10);
        t1=(TextView)findViewById(R.id.tx1);

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1.setVisibility(View.INVISIBLE);
                v2.setVisibility(View.VISIBLE);
                t1.setText("1");
                int[] location = new int[2];
                v1.getLocationOnScreen(location);
                int x = location[0];
                int y = location[1];
//                int i= (int) v1.getX();
//                int j= (int) v1.getY();
                String s1=Integer.toString(x);
                String s2=Integer.toString(y);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();

                Paint paint = new Paint();
                paint.setColor(Color.rgb(255, 0, 0));
                Canvas canvas=new Canvas();
                int startx=x;
                int starty=y;
                int endx=100;
                int endy=120;
                canvas.drawCircle(startx, starty, 20, paint);

                canvas.drawLine(startx,starty,endx,endy,paint);

            }
        });

        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2.setVisibility(View.INVISIBLE);
                v3.setVisibility(View.VISIBLE);
                t1.setText("2");
//                int i1= (int) v2.getX();
//                int j1= (int) v2.getY();

                int[] location = new int[2];
                v2.getLocationOnScreen(location);
                int x1 = location[0];
                int y1 = location[1];
                String s1=Integer.toString(x1);
                String s2=Integer.toString(y1);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v3.setVisibility(View.INVISIBLE);
                v4.setVisibility(View.VISIBLE);
                t1.setText("3");

                int[] location = new int[2];
                v3.getLocationOnScreen(location);
                int x2 = location[0];
                int y2 = location[1];
                String s1=Integer.toString(x2);
                String s2=Integer.toString(y2);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v4.setVisibility(View.INVISIBLE);
                v5.setVisibility(View.VISIBLE);
                t1.setText("4");
                int[] location = new int[2];
                v4.getLocationOnScreen(location);
                int x3 = location[0];
                int y3 = location[1];
                String s1=Integer.toString(x3);
                String s2=Integer.toString(y3);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v5.setVisibility(View.INVISIBLE);
                v6.setVisibility(View.VISIBLE);
                t1.setText("5");
                int[] location = new int[2];
                v5.getLocationOnScreen(location);
                int x4 = location[0];
                int y4 = location[1];
                String s1=Integer.toString(x4);
                String s2=Integer.toString(y4);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v6.setVisibility(View.INVISIBLE);
                v7.setVisibility(View.VISIBLE);
                t1.setText("6");
                int[] location = new int[2];
                v6.getLocationOnScreen(location);
                int x5 = location[0];
                int y5 = location[1];
                String s1=Integer.toString(x5);
                String s2=Integer.toString(y5);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v7.setVisibility(View.INVISIBLE);
                v8.setVisibility(View.VISIBLE);
                t1.setText("7");
                int[] location = new int[2];
                v7.getLocationOnScreen(location);
                int x6 = location[0];
                int y6 = location[1];
                String s1=Integer.toString(x6);
                String s2=Integer.toString(y6);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v8.setVisibility(View.INVISIBLE);
                v9.setVisibility(View.VISIBLE);
                t1.setText("8");
                int[] location = new int[2];
                v8.getLocationOnScreen(location);
                int x7 = location[0];
                int y7 = location[1];
                String s1=Integer.toString(x7);
                String s2=Integer.toString(y7);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v9.setVisibility(View.INVISIBLE);
                v10.setVisibility(View.VISIBLE);
                t1.setText("9");
                int[] location = new int[2];
                v9.getLocationOnScreen(location);
                int x8 = location[0];
                int y8 = location[1];
                String s1=Integer.toString(x8);
                String s2=Integer.toString(y8);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });
        v10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v10.setVisibility(View.INVISIBLE);
                //v2.setVisibility(View.VISIBLE);
                t1.setText("10");
                int[] location = new int[2];
                v10.getLocationOnScreen(location);
                int x9 = location[0];
                int y9 = location[1];
                String s1=Integer.toString(x9);
                String s2=Integer.toString(y9);
                Toast.makeText(getApplicationContext(),s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),s2,Toast.LENGTH_SHORT).show();
            }
        });

        }
    }

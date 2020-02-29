package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ug_departments extends AppCompatActivity {

    androidx.cardview.widget.CardView ugd1,ugd2,ugd3,ugd4,ugd5,ugd6,ugd7,ugd8,ugd9,ugd10,ugd11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_departments);

        ugd1=findViewById(R.id.ugd1);
        ugd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd1=new Intent(Ug_departments.this,Physics.class);
                startActivity(ugd1);
            }
        });

        ugd2=findViewById(R.id.ugd2);
        ugd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd2=new Intent(Ug_departments.this,Chemistry.class);
                startActivity(ugd2);
            }
        });


        ugd3=findViewById(R.id.ugd3);
        ugd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd3=new Intent(Ug_departments.this,Mathematics.class);
                startActivity(ugd3);
            }
        });

        ugd4=findViewById(R.id.ugd4);
        ugd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd4=new Intent(Ug_departments.this,Botany.class);
                startActivity(ugd4);
            }
        });


        ugd5=findViewById(R.id.ugd5);
        ugd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd5=new Intent(Ug_departments.this,Zoology.class);
                startActivity(ugd5);
            }
        });


        ugd6=findViewById(R.id.ugd6);
        ugd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd6=new Intent(Ug_departments.this,Statistics.class);
                startActivity(ugd6);
            }
        });

        ugd7=findViewById(R.id.ugd7);
        ugd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd7=new Intent(Ug_departments.this,Computer_science.class);
                startActivity(ugd7);
            }
        });


        ugd8=findViewById(R.id.ugd8);
        ugd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd8=new Intent(Ug_departments.this,Electronics.class);
                startActivity(ugd8);
            }
        });

        ugd9=findViewById(R.id.ugd9);
        ugd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd9=new Intent(Ug_departments.this,Microbiology.class);
                startActivity(ugd9);
            }
        });


        ugd10=findViewById(R.id.ugd10);
        ugd10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd10=new Intent(Ug_departments.this,Biotechnology.class);
                startActivity(ugd10);
            }
        });

        ugd11=findViewById(R.id.ugd11);
        ugd11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugd11=new Intent(Ug_departments.this,Languages.class);
                startActivity(ugd11);
            }
        });
    }
}

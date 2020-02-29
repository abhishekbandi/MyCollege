package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bsc extends AppCompatActivity {

    androidx.cardview.widget.CardView bsc1,bsc2,bsc3,bsc4,bsc5,bsc6,bsc7,bsc8,bsc9,bsc10,bsc11,bsc12,bsc13,bsc14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsc);

        bsc1=findViewById(R.id.bsc1);
        bsc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc1=new Intent(Bsc.this,Bsc_sem1.class);
                startActivity(bsc1);
            }
        });

        bsc2=findViewById(R.id.bsc2);
        bsc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc2=new Intent(Bsc.this,Bsc_sem2.class);
                startActivity(bsc2);
            }
        });


        bsc3=findViewById(R.id.bsc3);
        bsc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc3=new Intent(Bsc.this,Bsc_sem3.class);
                startActivity(bsc3);
            }
        });

        bsc4=findViewById(R.id.bsc4);
        bsc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc4=new Intent(Bsc.this,Bsc_sem4.class);
                startActivity(bsc4);
            }
        });


        bsc5=findViewById(R.id.bsc5);
        bsc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc5=new Intent(Bsc.this,Bsc_sem5.class);
                startActivity(bsc5);
            }
        });


        bsc6=findViewById(R.id.bsc6);
        bsc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc6=new Intent(Bsc.this,Bsc_sem6.class);
                startActivity(bsc6);
            }
        });

        bsc7=findViewById(R.id.bsc7);
        bsc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc7=new Intent(Bsc.this,Bsc_Statistics.class);
                startActivity(bsc7);
            }
        });


        bsc8=findViewById(R.id.bsc8);
        bsc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc8=new Intent(Bsc.this,Bsc_sugar_science.class);
                startActivity(bsc8);
            }
        });

        bsc9=findViewById(R.id.bsc9);
        bsc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc9=new Intent(Bsc.this,Bsc_computer_science.class);
                startActivity(bsc9);
            }
        });


        bsc10=findViewById(R.id.bsc10);
        bsc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc10=new Intent(Bsc.this,Bsc_kannada.class);
                startActivity(bsc10);
            }
        });

        bsc11=findViewById(R.id.bsc11);
        bsc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc11=new Intent(Bsc.this,Bsc_Dpc.class);
                startActivity(bsc11);
            }
        });

        bsc12=findViewById(R.id.bsc12);
        bsc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc12=new Intent(Bsc.this,Bsc_stat_optional.class);
                startActivity(bsc12);
            }
        });


        bsc13=findViewById(R.id.bsc13);
        bsc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc13=new Intent(Bsc.this,Bsc_IC.class);
                startActivity(bsc13);
            }
        });

        bsc14=findViewById(R.id.bsc14);
        bsc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bsc14=new Intent(Bsc.this,Bsc_Zoo_optional.class);
                startActivity(bsc14);
            }
        });



    }
}

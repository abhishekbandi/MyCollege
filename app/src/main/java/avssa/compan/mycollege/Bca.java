package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bca extends AppCompatActivity {
    androidx.cardview.widget.CardView sem1,sem2,sem3,sem4,sem5,sem6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        sem1=findViewById(R.id.sem1);
        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bcas1=new Intent(Bca.this,Bca_sem1.class);
                startActivity(bcas1);
            }
        });

        sem2=findViewById(R.id.sem2);
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bscs2=new Intent(Bca.this,Bca_sem2.class);
                startActivity(bscs2);
            }
        });


        sem3=findViewById(R.id.sem3);
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sem3=new Intent(Bca.this,Bca_sem3.class);
                startActivity(sem3);
            }
        });

        sem4=findViewById(R.id.sem4);
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sem4=new Intent(Bca.this,Bca_sem4.class);
                startActivity(sem4);
            }
        });


        sem5=findViewById(R.id.sem5);
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sem5=new Intent(Bca.this,Bca_sem5.class);
                startActivity(sem5);
            }
        });

        sem6=findViewById(R.id.sem6);
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sem6=new Intent(Bca.this,Bca_sem6.class);
                startActivity(sem6);
            }
        });

    }
}

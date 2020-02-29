package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pg_departments extends AppCompatActivity {

    androidx.cardview.widget.CardView msc1,msc2,msc3,msc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg_departments);


        msc1=findViewById(R.id.msc1);
        msc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msc1=new Intent(Pg_departments.this,Msc_CS.class);
                startActivity(msc1);
            }
        });

        msc2=findViewById(R.id.msc2);
        msc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msc2=new Intent(Pg_departments.this,Msc_mathematics.class);
                startActivity(msc2);
            }
        });


        msc3=findViewById(R.id.msc3);
        msc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msc3=new Intent(Pg_departments.this,Msc_Chemistry.class);
                startActivity(msc3);
            }
        });

        msc4=findViewById(R.id.msc4);
        msc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent msc4=new Intent(Pg_departments.this,Msc_physics.class);
                startActivity(msc4);
            }
        });


    }
}

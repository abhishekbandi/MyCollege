package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gymkhana extends AppCompatActivity {

    androidx.cardview.widget.CardView wec,sports,ncc,nss,sa,ca,cgapc,naturalclub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymkhana);

        wec=findViewById(R.id.wec);
        sports=findViewById(R.id.sports);
        ncc=findViewById(R.id.ncc);
        nss=findViewById(R.id.nss);
        sa=findViewById(R.id.sa);
        ca=findViewById(R.id.ca);
        cgapc=findViewById(R.id.cgpc);
        naturalclub=findViewById(R.id.naturalclub);



        wec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iwec=new Intent(Gymkhana.this,Women_empovernment_cell.class);
                startActivity(iwec);
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isp=new Intent(Gymkhana.this,Sports.class);
                startActivity(isp);
            }
        });


        ncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent incc=new Intent(Gymkhana.this,NCC.class);
                startActivity(incc);
            }
        });


        nss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inss=new Intent(Gymkhana.this,NSS.class);
                startActivity(inss);
            }
        });


        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isa=new Intent(Gymkhana.this,Science_association.class);
                startActivity(isa);
            }
        });

        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ica=new Intent(Gymkhana.this,Culttural_activities.class);
                startActivity(ica);
            }
        });


        cgapc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icgapc=new Intent(Gymkhana.this,Career_guidance.class);
                startActivity(icgapc);
            }
        });



        naturalclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nc=new Intent(Gymkhana.this,Natural_club.class);
                startActivity(nc);
            }
        });




    }
}

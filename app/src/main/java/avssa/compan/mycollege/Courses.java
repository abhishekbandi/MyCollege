package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Courses extends AppCompatActivity {

    androidx.cardview.widget.CardView coursea,courseb,coursec,coursed,coursee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        coursea=findViewById(R.id.pgprograms);
        coursea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pg=new Intent(Courses.this,Pg_programs.class);
                startActivity(pg);
            }
        });

        courseb=findViewById(R.id.ugprograms);
        courseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ug=new Intent(Courses.this,Ug_programs.class);
                startActivity(ug);
            }
        });


        coursec=findViewById(R.id.phdprograms);
        coursec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phd=new Intent(Courses.this,Ph_D_programs.class);
                startActivity(phd);
            }
        });

        coursed=findViewById(R.id.diploma);
        coursed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent di=new Intent(Courses.this,Diploma.class);
                startActivity(di);
            }
        });


        coursee=findViewById(R.id.certification);
        coursee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cer=new Intent(Courses.this,Certification_courses.class);
                startActivity(cer);
            }
        });

    }
}

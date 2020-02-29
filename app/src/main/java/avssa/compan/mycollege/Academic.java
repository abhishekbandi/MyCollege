package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Academic extends AppCompatActivity {

    androidx.cardview.widget.CardView eximanition,rc,library,ar,gc,attendance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);

        eximanition=findViewById(R.id.eximanition);
        rc=findViewById(R.id.rc);
        library=findViewById(R.id.library);
        ar=findViewById(R.id.ar);
        gc=findViewById(R.id.gc);
        attendance=findViewById(R.id.attendance);

        eximanition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exi=new Intent(Academic.this,Eximanition.class);
                startActivity(exi);
            }
        });


        rc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rc=new Intent(Academic.this,Remedical_committee.class);
                startActivity(rc);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lib=new Intent(Academic.this,Library.class);
                startActivity(lib);
            }
        });


        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ac=new Intent(Academic.this,Anti_ragging.class);
                startActivity(ac);
            }
        });

        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gc=new Intent(Academic.this,Grievance_cell.class);
                startActivity(gc);
            }
        });



        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent att=new Intent(Academic.this,Attendance.class);
                startActivity(att);
            }
        });
    }
}

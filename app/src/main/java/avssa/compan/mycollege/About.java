package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    androidx.cardview.widget.CardView aboutbvvs,aboutcollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutbvvs=findViewById(R.id.aboutbvvs);
        aboutcollege=findViewById(R.id.aboutcollege);
        aboutbvvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab=new Intent(About.this,About_bvvs.class);
                startActivity(ab);
            }
        });

        aboutcollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc=new Intent(About.this,About_college.class);
                startActivity(abc);
            }
        });

    }
}

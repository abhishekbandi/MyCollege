package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Syllabus extends AppCompatActivity {

    androidx.cardview.widget.CardView bca,bsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        bca=findViewById(R.id.syllabusbca);
        bsc=findViewById(R.id.syllabusbsc);
        bca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabusbca=new Intent(Syllabus.this,Bca.class);
                startActivity(syllabusbca);
            }
        });


        bsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent syllabusbsc=new Intent(Syllabus.this,Bsc.class);
                startActivity(syllabusbsc);
            }
        });
    }
}

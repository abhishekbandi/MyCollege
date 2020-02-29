package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IQAC extends AppCompatActivity {

    androidx.cardview.widget.CardView iqmessage,pl,iqmember,cpe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iqac);

        iqmessage=findViewById(R.id.iqacmessage);
        pl=findViewById(R.id.pl);
        iqmember=findViewById(R.id.iqacmember);
        cpe=findViewById(R.id.cpe);

        iqmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iqmess=new Intent(IQAC.this,Iqac_message.class);
                startActivity(iqmess);
            }
        });


        pl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pl=new Intent(IQAC.this,Principal_letter.class);
                startActivity(pl);
            }
        });


        iqmember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iqmemb=new Intent(IQAC.this,Iqac_members.class);
                startActivity(iqmemb);
            }
        });


        cpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cpe=new Intent(IQAC.this,CPE.class);
                startActivity(cpe);
            }
        });

    }
}

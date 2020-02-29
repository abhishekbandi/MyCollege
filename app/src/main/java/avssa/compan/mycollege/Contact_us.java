package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Contact_us extends AppCompatActivity {
    androidx.cardview.widget.CardView ccall,cmail,cweb,cloc;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        ccall=findViewById(R.id.ccall);
        cmail=findViewById(R.id.cmail);
        cweb=findViewById(R.id.cweb);

        ccall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+"08354220549"));
                startActivity(intent);

            }
        });

        cmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","bscbgk@yahoo.com",null));
                eli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                startActivity(eli1);
            }
        });



    }
}

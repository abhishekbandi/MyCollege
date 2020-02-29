package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Developers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        ImageView img= findViewById(R.id.dmail);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devp=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","teamcompan@gmail.com",null));
                devp.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                startActivity(devp);

            }
        });
    }
}

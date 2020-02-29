package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Microbiology extends AppCompatActivity {
    ListView list9;
    String item[]=new String[] {"Smt R.I.Soudagar","Shri.S.B.Basavanal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microbiology);
        list9=findViewById(R.id.list9);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list9.setAdapter(adapter);
        list9.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent mili1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    mili1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mili1);

                }
                if (i==1)
                {
                    Intent mili2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    mili2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mili2);
                }
            }
        });
    }
}

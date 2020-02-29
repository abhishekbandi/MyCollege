package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Languages extends AppCompatActivity {
    ListView list11;
    String item[]=new String[] {"Dr S.D.Kengalagutti(Kannada)","Smt .N.S.Telkar(English)","Dr. Arunkumar Nooli",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
        list11=findViewById(R.id.list11);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list11.setAdapter(adapter);
        list11.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent lli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","sajanandkengalagutti@gmail.com",null));
                    lli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(lli1);

                }
                if (i==1)
                {
                    Intent lli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," nirmalatelkar5571@gmail.com",null));
                    lli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(lli2);
                }
                if (i==2)
                {
                    Intent lli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","arunkumarnooli.9@gmail.com",null));
                    lli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(lli3);
                }
            }
        });
    }
}

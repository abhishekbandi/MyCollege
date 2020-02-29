package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Statistics extends AppCompatActivity {
    ListView list6;
    String item[]=new String[] {"Netravati Hireholi",""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        list6=findViewById(R.id.list6);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list6.setAdapter(adapter);
        list6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent sli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Netra.h.21@gmail.com",null));
                    sli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(sli1);

                }
            }
        });

    }
}

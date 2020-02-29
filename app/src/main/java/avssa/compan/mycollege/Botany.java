package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Botany extends AppCompatActivity {
    ListView list4;
    String item[]=new String[] {"Prof.M.K.Ganachari","Miss. S.R.Nandawadagi","Miss. T.P.Chavan","Tanuja Yandigeri"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botany);
        list4=findViewById(R.id.list4);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list4.setAdapter(adapter);
        list4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent boli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    boli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(boli1);

                }
                if (i==1)
                {
                    Intent boli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    boli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(boli2);
                }

                if (i==2)
                {
                    Intent boli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    boli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(boli3);
                }

                if (i==3)
                {
                    Intent boli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    boli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(boli4);
                }
            }
        });
    }
}

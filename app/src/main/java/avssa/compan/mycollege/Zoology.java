package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Zoology extends AppCompatActivity {
    ListView list5;
    String item[]=new String[] {"Smt.P.B.Rudrakshi","Smt.S.R.Sabarad","Dr.M.S.Bisnal","Smt.Surekha R.Deshpande","Smt.Gayatridevi G. Hiremath"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoology);
        list5=findViewById(R.id.list5);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list5.setAdapter(adapter);
        list5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent zoli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","parwatishirol@gmail.com",null));
                    zoli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(zoli1);

                }
                if (i==1)
                {
                    Intent zoli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","surekha1466@gmail.com",null));
                    zoli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(zoli2);
                }

                if (i==2)
                {
                    Intent zoli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    zoli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(zoli3);
                }

                if (i==3)
                {
                    Intent zoli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","bsc.zoo.srdeshpande@gmail.com",null));
                    zoli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(zoli4);
                }

                if (i==3)
                {
                    Intent zoli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shankarmath69@gmail.com",null));
                    zoli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(zoli5);
                }
            }
        });


    }
}

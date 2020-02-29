package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Msc_CS extends AppCompatActivity {

    ListView list1;
    String item[]=new String[] {"Smt.Shweta Patil","Praveen Akkimaradi","Dr.Guru Puranikmath","Dr.T.M.Girish","Dr.Ashok Koujalagi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msc__cs);

        list1=findViewById(R.id.cslist);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent mcsli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," shwetvp@gmail.com",null));
                    mcsli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli1);

                }
                if (i==1)
                {
                    Intent mcsli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    mcsli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli2);
                }

                if (i==2)
                {
                    Intent mcsli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","girishtmath@gmail.com",null));
                    mcsli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli3);
                }

                if (i==3)
                {
                    Intent mcsli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," girishtmath@gmail.com ",null));
                    mcsli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli4);
                }

                if (i==4)
                {
                    Intent mcsli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","koujalagi.ashok@gmail.com",null));
                    mcsli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli5);
                }

            }
        });
    }
}

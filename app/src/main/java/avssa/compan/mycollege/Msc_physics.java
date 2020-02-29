package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Msc_physics extends AppCompatActivity {
    ListView list1;
    String item[]=new String[] {"Smt. Pratibha Kanavi","Mr. Anand Teli","Ms. Soubhagya Badanur","Ms. Shobha Karjo","MMs. Alfaz Chaus","Ms.Soumya Gangur"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msc_physics);

        list1=findViewById(R.id.phylist);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent mcsli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","pratibharamgeri@gmail.com",null));
                    mcsli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli1);

                }
                if (i==1)
                {
                    Intent mcsli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","anandteli123@gmail.com",null));
                    mcsli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli2);
                }

                if (i==2)
                {
                    Intent mcsli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","soubhagyabadanur@gmail.com",null));
                    mcsli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli3);
                }

                if (i==3)
                {
                    Intent mcsli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shoba2191@gmail.com",null));
                    mcsli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli4);
                }

                if (i==4)
                {
                    Intent mcsli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","alfazchaus254@gmail.com",null));
                    mcsli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli5);
                }

                if (i==5)
                {
                    Intent mcsli6=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","soumyagangur@gmail.com",null));
                    mcsli6.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mcsli6);
                }
            }
        });
    }
}

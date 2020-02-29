package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Physics extends AppCompatActivity {
       ListView list1;
    String item[]=new String[] {"Prof.S.B.Goudar","Prof.K.B.Nagalikar","Prof.R.L.Kataraki","Prof.Smt.V.N.Vanakudre","Smt L.S.Ganjal","Shri. B. A. Khot","Mr. P V Koshti","Mr. Ramesh V. Anawal","Miss.S.M.Ganachari","Miss.Jyoti G.Polashi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        list1=findViewById(R.id.list1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent pli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," sbgoudarbgk@gmail.com",null));
                    pli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli1);

                }
                if (i==1)
                {
                    Intent pli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    pli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli2);
                }

                if (i==2)
                {
                    Intent pli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Katarakir@gmail.com",null));
                    pli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli3);
                }

                if (i==3)
                {
                    Intent pli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","vijayavn98@gmail.com",null));
                    pli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli4);
                }

                if (i==4)
                {
                    Intent pli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","lalitha_sq@rediffmail.com",null));
                    pli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli5);
                }

                if (i==5)
                {
                    Intent pli6=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," Bkhot796@gmail.com",null));
                    pli6.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli6);
                }

                if (i==6)
                {
                    Intent pli7=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," parappavkoshti@gmail.com",null));
                    pli7.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli7);
                }

                if (i==7)
                {
                    Intent pli8=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Rameshasimplydbest@gmail",null));
                    pli8.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli8);
                }
                if (i==8)
                {
                    Intent pli9=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","ganacharishridevi@gmail",null));
                    pli9.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli9);
                }

                if (i==9)
                {
                    Intent pli10=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","jyotipolashi@gmail",null));
                    pli10.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(pli10);
                }
            }
        });
    }
}

package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mathematics extends AppCompatActivity {
    ListView list3;
    String item[]=new String[] {"Sri.S.A.Bhusanurmath","Sri. S.B.Bhandari","Smt V.V.Wali","Miss.R.D.Pawar","Mr.Kartik Desai","Mrs.P.S.Muchandi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematics);
        list3=findViewById(R.id.list3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list3.setAdapter(adapter);
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent mli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","sabmath2011@gmail.com.in",null));
                    mli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli1);

                }
                if (i==1)
                {
                    Intent mli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","bsuresh89@gmail.com",null));
                    mli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli2);
                }

                if (i==2)
                {
                    Intent mli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Bsc.maths.vvwali@gmail.com",null));
                    mli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli3);
                }

                if (i==3)
                {
                    Intent mli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Reshmapawar36@gmail.com",null));
                    mli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli4);
                }

                if (i==4)
                {
                    Intent mli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","karthik.desai07@gmail.com",null));
                    mli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli5);
                }

                if (i==5)
                {
                    Intent mli6=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    mli6.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mli6);
                }

            }
        });
    }
}

package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Msc_mathematics extends AppCompatActivity {

    ListView list1;
    String item[]=new String[] {"Dr. SumangaladeviDinny","Mr. Basayya.B.Mathad","Dr.Guru Puranikmath","Mr. Chidanand D. Badiger","Miss.Nagaveni.Y.Neeralakeri","Dr.Manjunath.H.Jyoti"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msc_mathematics);

        list1=findViewById(R.id.matlist);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent mmli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","sumangaladevi.s@gmail.com",null));
                    mmli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mmli1);

                }
                if (i==1)
                {
                    Intent mmli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","bbmath.mathad@gmail.com",null));
                    mmli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mmli2);
                }

                if (i==2)
                {
                    Intent mmli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","girishtmath@gmail.com",null));
                    mmli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mmli3);
                }

                if (i==3)
                {
                    Intent mmli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Shriramchandra.148@gmail.com",null));
                    mmli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mmli4);
                }

                if (i==4)
                {
                    Intent mmli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","manjunath.jyoti5@gmail.com",null));
                    mmli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(mmli5);
                }

            }
        });
    }
}

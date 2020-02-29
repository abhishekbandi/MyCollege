package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Electronics extends AppCompatActivity {
    ListView list8;
    String item[]=new String[] {"Dr.Rajeshwari.S.Mathad","Dr.P.I. Mandi","Shri B.M. Karidyavannavar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        list8=findViewById(R.id.list8);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list8.setAdapter(adapter);
        list8.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent eli1=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","rmathod@gmail.com",null));
                    eli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(eli1);

                }
                if (i==1)
                {
                    Intent eli2=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","prabhumandi123@gmail.com",null));
                    eli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(eli2);

                }
                if (i==2)
                {
                    Intent eli3=new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto"," bhimappamk1@gmail.com",null));
                    eli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(eli3);

                }
            }
        });
    }
}

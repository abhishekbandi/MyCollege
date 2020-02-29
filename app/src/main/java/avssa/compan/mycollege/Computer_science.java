package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Computer_science extends AppCompatActivity {
    ListView list7;
    String item[]=new String[] {"Smt.Shweta Patil","Shri. Ravi.S Karabashetti","Shri. M.M Attar","Smt. Naina Kalyanshetti","Mr.Girish.Karehonna","Mr.Shridhar Pangi","Ms.Bharati Kuntoji","Smt. Roopa Tonashyal","Smt. Shama P","Mr. L. S. Shirol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_science);
        list7=findViewById(R.id.list7);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list7.setAdapter(adapter);
        list7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent csli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shwetvp@gmail.com",null));
                    csli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli1);

                }
                if (i==1)
                {
                    Intent csli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    csli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli2);
                }

                if (i==2)
                {
                    Intent csli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    csli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli3);
                }

                if (i==3)
                {
                    Intent csli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    csli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli4);
                }

                if (i==4)
                {
                    Intent csli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","Karehonna.Girish@gmail.com.com",null));
                    csli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli5);
                }

                if (i==5)
                {
                    Intent csli6=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    csli6.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli6);
                }

                if (i==6)
                {
                    Intent csli7=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    csli7.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli7);
                }

                if (i==7)
                {
                    Intent csli8=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","roopatonashyal@gmail.com",null));
                    csli8.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli8);
                }
                if (i==8)
                {
                    Intent csli9=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shm.san1@gmail.com",null));
                    csli9.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli9);
                }

                if (i==9)
                {
                    Intent csli10=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","leshappashirol1990@gmail.com",null));
                    csli10.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(csli10);
                }
            }
        });
    }
}

package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chemistry extends AppCompatActivity {

    ListView list2;
    String item[]=new String[] {"Dr. B.N.Kirasur","Smt. K. H. Kakaraddi","Smt. S. G. Hunasikai","Shri. S. M. Gaonkar","Smt. S. S. Karishankari","Smt. S. R. Kaladagi","Dr.Devappa Lamani","Miss S.M.Jalavadagi","Shri. P. S. Channappagol","Miss. L. R. Ankalagi","Shri. S. G. Badiger","Shri.V.R.Paraddi","Miss.Srinidhi Kulkarni","Miss.Roopa Mudnur","Miss.Archana S Joshi","Mr.Vinayak.S.Ranjanagi","Mr.Shivamalla.I.Balol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        list2=findViewById(R.id.list2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list2.setAdapter(adapter);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent cli1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","kirasurbn@gmail.com",null));
                    cli1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli1);

                }
                if (i==1)
                {
                    Intent cli2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," khk@Yahoo.com",null));
                    cli2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli2);
                }

                if (i==2)
                {
                    Intent cli3=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," sghunasikai@gmail.com",null));
                    cli3.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli3);
                }

                if (i==3)
                {
                    Intent cli4=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","amoghgaonkar50@gmail.com",null));
                    cli4.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli4);
                }

                if (i==4)
                {
                    Intent cli5=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shakuntalaskarishankari@gmail.com",null));
                    cli5.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli5);
                }

                if (i==5)
                {
                    Intent cli6=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," sumangalak.95@gmail.com",null));
                    cli6.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli6);
                }

                if (i==6)
                {
                    Intent cli7=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","",null));
                    cli7.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli7);
                }

                if (i==7)
                {
                    Intent cli8=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","JMSHAILASHREE@GMAIL.COM",null));
                    cli8.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli8);
                }
                if (i==8)
                {
                    Intent cli9=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto"," pchannappagol@gmail.com",null));
                    cli9.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli9);
                }
                if (i==9)
                {
                    Intent cli10=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","ankalagilaxmi1513@gmail.com",null));
                    cli10.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli10);

                }
                if (i==10)
                {
                    Intent cli11=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","srikantbadiger33@gmail.com",null));
                    cli11.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli11);
                }

                if (i==11)
                {
                    Intent cli12=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","vasudevparaddi@gmail.com",null));
                    cli12.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli12);
                }

                if (i==12)
                {
                    Intent cli13=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","srinidhikulkarni87@gmail.com",null));
                    cli13.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli13);
                }

                if (i==13)
                {
                    Intent cli14=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","roopamudnur@gmail.com",null));
                    cli14.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli14);
                }

                if (i==14)
                {
                    Intent cli15=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","jsarchana006@gmail.com",null));
                    cli15.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli15);
                }

                if (i==15)
                {
                    Intent cli16=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","vinnu.ranjanagi@gmail.com",null));
                    cli16.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli16);
                }
                if (i==16)
                {
                    Intent cli17=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","shivamallabalol@gmail.com",null));
                    cli17.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(cli17);
                }

            }
        });
    }
}

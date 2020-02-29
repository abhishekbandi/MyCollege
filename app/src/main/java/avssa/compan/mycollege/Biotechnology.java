package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Biotechnology extends AppCompatActivity {
    ListView list10;
    String item[]=new String[] {"Smt J.B.Uppin","Smt.M.B.Math"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biotechnology);
        list10=findViewById(R.id.list10);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,item);
        list10.setAdapter(adapter);
        list10.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                if (i==0)
                {
                    Intent bili1=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    bili1.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(bili1);

                }
                if (i==1)
                {
                    Intent bili2=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","rmathod@gmail.com",null));
                    bili2.putExtra(Intent.EXTRA_SUBJECT,"My College App:");
                    startActivity(bili2);
                }
            }
        });
    }
}

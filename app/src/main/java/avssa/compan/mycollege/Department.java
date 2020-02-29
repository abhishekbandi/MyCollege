package avssa.compan.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Department extends AppCompatActivity {

    androidx.cardview.widget.CardView pgdepartment,ugdepartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        pgdepartment=findViewById(R.id.pgdepartment);
        ugdepartment=findViewById(R.id.ugdepartment);
        pgdepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pgdept=new Intent(Department.this,Pg_departments.class);
                startActivity(pgdept);
            }
        });

        ugdepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ugdept=new Intent(Department.this,Ug_departments.class);
                startActivity(ugdept);
            }
        });
    }
}

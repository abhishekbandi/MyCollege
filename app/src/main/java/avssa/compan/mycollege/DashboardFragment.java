package avssa.compan.mycollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DashboardFragment extends Fragment {

    androidx.cardview.widget.CardView syllabus,about,courses,department,academic,iqac,gymkhana,alumni;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.f_dashboard,container,false);

        syllabus=rootView.findViewById(R.id.syllabus);
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent isyllabus=new Intent(getActivity(),Syllabus.class);
                startActivity(isyllabus);
            }
        });

        about=rootView.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iabout=new Intent(getActivity(),About.class);
                startActivity(iabout);
            }
        });


        courses=rootView.findViewById(R.id.courses);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icourses=new Intent(getActivity(),Courses.class);
                startActivity(icourses);
            }
        });

        department=rootView.findViewById(R.id.departments);
        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent idepartment=new Intent(getActivity(),Department.class);
                startActivity(idepartment);
            }
        });

        academic=rootView.findViewById(R.id.academic);
        academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iacademic=new Intent(getActivity(),Academic.class);
                startActivity(iacademic);
            }
        });

        iqac=rootView.findViewById(R.id.iqac);
        iqac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iiqac=new Intent(getActivity(),IQAC.class);
                startActivity(iiqac);
            }
        });

        gymkhana=rootView.findViewById(R.id.gymkhana);
        gymkhana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent igymkhana=new Intent(getActivity(),Gymkhana.class);
                startActivity(igymkhana);
            }
        });

        alumni=rootView.findViewById(R.id.alumni);
        alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ialumni=new Intent(getActivity(),Alumni.class);
                startActivity(ialumni);
            }
        });



        return rootView;



    }
}

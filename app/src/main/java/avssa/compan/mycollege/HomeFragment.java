package avssa.compan.mycollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    androidx.cardview.widget.CardView updates;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.f_home,container,false);
        updates=rootView.findViewById(R.id.aupdates);
        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent up=new Intent(getActivity(),Updates.class);
                startActivity(up);
            }
        });
        return rootView;
    }
}

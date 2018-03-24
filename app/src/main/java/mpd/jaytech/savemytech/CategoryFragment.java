package mpd.jaytech.savemytech;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class CategoryFragment extends Fragment {



    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Use this code to go from one fragment to another just change CatFragment to new fragment
//        Fragment newFragment = new CategoryFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//        transaction.replace(R.id.mainContainer, newFragment);
//        transaction.addToBackStack(null);
//        transaction.commit();


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        final Button coffeeBtn = (Button) view.findViewById(R.id.coffeeBtn);

        coffeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment newFragment = new CatPlacesFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.mainContainer, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        return view;
    }




}

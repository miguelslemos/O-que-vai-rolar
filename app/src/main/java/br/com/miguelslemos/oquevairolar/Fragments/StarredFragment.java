package br.com.miguelslemos.oquevairolar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.com.miguelslemos.oquevairolar.MainActivity;


public class StarredFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(br.com.miguelslemos.oquevairolar.R.layout.fragment_starred, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Inbox");

        Button buttonChangeText = (Button) view.findViewById(br.com.miguelslemos.oquevairolar.R.id.buttonFragmentStarred);

        final TextView textViewStarredFragment = (TextView) view.findViewById(br.com.miguelslemos.oquevairolar.R.id.textViewStarredFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewStarredFragment.setTextSize(40);
                textViewStarredFragment.setText("This is the Starred Fragment");
                textViewStarredFragment.setTextColor(getResources().getColor(br.com.miguelslemos.oquevairolar.R.color.md_green_800));

            }
        });

        return view;
    }

}

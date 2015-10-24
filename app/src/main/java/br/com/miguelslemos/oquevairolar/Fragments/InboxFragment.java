package br.com.miguelslemos.oquevairolar.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import br.com.miguelslemos.oquevairolar.MainActivity;


public class InboxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(br.com.miguelslemos.oquevairolar.R.layout.fragment_inbox, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Inbox");

        Button buttonChangeText = (Button) view.findViewById(br.com.miguelslemos.oquevairolar.R.id.buttonFragmentInbox);

         final TextView textViewInboxFragment = (TextView) view.findViewById(br.com.miguelslemos.oquevairolar.R.id.textViewInboxFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewInboxFragment.setText("This is the Inbox Fragment");
                textViewInboxFragment.setTextColor(getResources().getColor(br.com.miguelslemos.oquevairolar.R.color.md_yellow_800));

            }
        });

        return view;
    }

}

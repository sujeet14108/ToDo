package com.example.sujeet.todo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sujeet on 9/11/16.
 */

public class PageFragment extends Fragment {

    public static PageFragment newInstance(Student singleContact) {

        PageFragment pageFragment = new PageFragment();
        Bundle bundle = new Bundle();
      /*  bundle.putString("name", singleContact.getName());
        bundle.putString("phone", singleContact.getPhone());
        pageFragment.setArguments(bundle);*/

        bundle.putSerializable("contact", singleContact);
        pageFragment.setArguments(bundle);

        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);
        final TextView textView1 = (TextView) view.findViewById(R.id.textView1);
        final TextView textView2 = (TextView) view.findViewById(R.id.textView2);
        final TextView textView3 = (TextView) view.findViewById(R.id.textView7);

        Student cont= (Student) getArguments().getSerializable("contact");

        textView1.setText(cont.getname());
        textView2.setText(cont.getdes());
        textView3.setText(cont.getyear());
        Button btnClick=(Button) view.findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new  View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Clciked "+textView1.getText().toString(), Toast.LENGTH_SHORT).show();

            }
        });


        return view;
    }
}

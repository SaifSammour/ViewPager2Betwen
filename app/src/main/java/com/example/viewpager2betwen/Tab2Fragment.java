package com.example.viewpager2betwen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.viewpager2betwen.databinding.FragmentTab2Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tab2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class Tab2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    TextView tv;




    public static Tab2Fragment newInstance(String param1) {
        Tab2Fragment fragment = new Tab2Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv=view.findViewById(R.id.tv_View);

    }
    protected void display(String message){
        tv.setText(message);
    }
}
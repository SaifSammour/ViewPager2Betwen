package com.example.viewpager2betwen;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class TAb1Fragment extends Fragment {

SendMessage sendMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_t_ab1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button=view.findViewById(R.id.btn_insert);
        final EditText editText=view.findViewById(R.id.et_data);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String name=   editText.getText().toString();
                sendMessage.sendData(name);
            }
        });

    }
    interface SendMessage{
        void sendData(String massage);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            sendMessage= (SendMessage) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException("Error");
        }
    }
}
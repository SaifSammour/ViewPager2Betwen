package com.example.viewpager2betwen;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.viewpager2betwen.databinding.ActivityMainBinding;
import com.example.viewpager2betwen.databinding.FragmentTAb1Binding;
import com.example.viewpager2betwen.databinding.FragmentTab2Binding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements TAb1Fragment.SendMessage  {
    ActivityMainBinding binding;

    private ViewPager viewPager;
    private TabLayout tabLayout;
    ViewpagerAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewPager=findViewById(R.id.viewPager2);
        adapter=new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout=findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }

    @Override
    public void sendData(String massage) {
        String name="android:switcher:"+R.id.viewPager2+":"+1;
        Tab2Fragment fragment= (Tab2Fragment) getSupportFragmentManager().findFragmentByTag(name);
        fragment.display(massage);
    }
}
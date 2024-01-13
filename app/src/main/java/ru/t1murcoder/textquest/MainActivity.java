package ru.t1murcoder.textquest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ru.t1murcoder.textquest.databinding.ActivityMainBinding;
import ru.t1murcoder.textquest.fragment.FirstFragment;
import ru.t1murcoder.textquest.fragment.SecondFragment;
import ru.t1murcoder.textquest.fragment.ThirdFragment;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragmentManager = getSupportFragmentManager();
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.remove(fragmentManager.getFragments().get(0));
                fragmentTransaction.add(R.id.fragment1 , new SecondFragment());

                fragmentTransaction.commit();


            }
        });
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.remove(fragmentManager.getFragments().get(0));
                fragmentTransaction.add(R.id.fragment1 , new FirstFragment());
                fragmentTransaction.commit();


            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                fragmentTransaction.remove(fragmentManager.getFragments().get(0));
                fragmentTransaction.add(R.id.fragment1 , new ThirdFragment());
                fragmentTransaction.commit();


            }
        });



    }



}
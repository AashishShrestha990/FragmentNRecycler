package aashish.coventry.fragmentnrecycler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import aashish.coventry.fragmentnrecycler.adapter.ViewPagerAdapter;
import aashish.coventry.fragmentnrecycler.framents.LoginFragment;
import aashish.coventry.fragmentnrecycler.framents.SignupFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter((getSupportFragmentManager()));
        viewPagerAdapter.addFragment(new LoginFragment(),"Login");
        viewPagerAdapter.addFragment(new SignupFragment(),"Signup");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }



}

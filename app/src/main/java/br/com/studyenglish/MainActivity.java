package br.com.studyenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import br.com.studyenglish.fragments.BichosFragment;
import br.com.studyenglish.fragments.NumerosFragment;
import br.com.studyenglish.fragments.VogaisFragment;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewpagertab);
        viewPager = findViewById(R.id.viewpager);

        getSupportActionBar().setElevation(0);

        FragmentPagerItemAdapter pagerItemAdapter = new FragmentPagerItemAdapter(getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Bichos", BichosFragment.class)
                .add("Números", NumerosFragment.class)
                .create()
        );

        viewPager.setAdapter(pagerItemAdapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
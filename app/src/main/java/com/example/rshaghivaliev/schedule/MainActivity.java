package com.example.rshaghivaliev.schedule;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rshaghivaliev.schedule.fragments.Friday;
import com.example.rshaghivaliev.schedule.fragments.Monday;
import com.example.rshaghivaliev.schedule.fragments.Thursday;
import com.example.rshaghivaliev.schedule.fragments.Tuesday;
import com.example.rshaghivaliev.schedule.fragments.Wednesday;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<String> groups = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groups.add("IA1503");
        groups.add("IA1502");
        groups.add("I1502");


        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Monday(), "ПН");
        adapter.addFragment(new Tuesday(), "ВТ");
        adapter.addFragment(new Wednesday(), "СР");
        adapter.addFragment(new Thursday(), "ЧТ");
        adapter.addFragment(new Friday(), "ПТ");
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.filter) {
            AlertDialog.Builder customBuilder = new AlertDialog.Builder(this);
            LinearLayout linearLayout = new LinearLayout(getApplicationContext());
            linearLayout.setOrientation(LinearLayout.VERTICAL);
            linearLayout.setPadding(40, 10, 0,0);

            TextView textView = new TextView(getApplicationContext());
            textView.setText("");
            textView.setText("Выберите группу");
            textView.setTextColor(Color.parseColor("#000000"));

            Spinner spinnerGroup = new Spinner(this);
            ArrayAdapter<String> spinnerGroupArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, groups);
            spinnerGroup.setAdapter(spinnerGroupArrayAdapter);

            linearLayout.addView(textView);
            linearLayout.addView(spinnerGroup);
            customBuilder.setView(linearLayout);
            customBuilder.setTitle("ФИЛЬТРЫ");
            customBuilder.setPositiveButton("ПРИМЕНИТЬ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            customBuilder.setNegativeButton("ОТМЕНА", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });

            AlertDialog dialog = customBuilder.create();
            dialog.show();
            dialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(Color.parseColor("#052354"));
            dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(Color.parseColor("#052354"));
        }
        return super.onOptionsItemSelected(item);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}

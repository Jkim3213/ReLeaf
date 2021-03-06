package io.github.jkim3213.cowraiser;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadFragment(new HomeFragment());


    }

    @Override
    public void onBackPressed() {
        //do nothing on back press.
    }

    //load frag
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        Intent toStoreAct;
        Intent toVisualization;
        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_shop:
                fragment = new StoreFragment();
                break;

            case R.id.navigation_carbonVisualizations:

                fragment = new StatisticsFragment();
                break;

            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
            case R.id.navigation_challenges:
                //fragment = new SettingsFragment();
                fragment = new ChallengesPageFragment();
                break;
        }

        return loadFragment(fragment);
    }



}

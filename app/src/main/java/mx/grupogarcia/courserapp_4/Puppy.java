package mx.grupogarcia.courserapp_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


import mx.grupogarcia.courserapp_4.fragments.TopFragment;
import mx.grupogarcia.courserapp_4.fragments.PerrosFragment;
import mx.grupogarcia.courserapp_4.adapter.PageAdapter;


public  class Puppy extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_puppy);
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mTop:
                //aqui se lanzara el intento hacia la segunda actividad
                Intent intent = new Intent(this,TopActivity.class);
                startActivity(intent);
                break;
            case R.id.mContacto:
                Intent i = new Intent(this,Contacto.class);
                startActivity(i);
                break;
            case R.id.mAcerca:
                Intent in = new Intent(this,BioActivity.class);
                startActivity(in);
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    private ArrayList<Fragment> agregarFragments()
    {
        Log.e("MainActivity", "agregarFragments");
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new PerrosFragment());
        fragments.add(new TopFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.doghouse);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_name);


    }


}

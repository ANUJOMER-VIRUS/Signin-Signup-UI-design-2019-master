package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;


public class HomeActivity extends AppCompatActivity {


    MeowBottomNavigation bottomNavigation;
    ViewPager viewPager;
    ImageFragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_baseline_attach_money_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_baseline_add_circle_outline_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_baseline_chat_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_baseline_person_24));

       bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
           @Override
           public void onShowItem(MeowBottomNavigation.Model item) {

               Fragment fragment = null;

               switch (item.getId()){
                   case 1:
                       fragment = new HomeFragment();
                       break;

                   case 2:
                       fragment = new RedeemFragment();
                       break;

                   case 3:
                       fragment = new BookingFragment();
                       break;

                   case 4:
                       fragment = new ChatFragment();
                       break;

                   case 5:
                       fragment = new ProfileFragment();
                       break;
               }
               loadFragment(fragment);
           }
       });

       bottomNavigation.setCount(4,"10");
       bottomNavigation.show(1,true);

       bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
           @Override
           public void onClickItem(MeowBottomNavigation.Model item) {
               Toast.makeText(getApplicationContext()
               ,"You Clicked"+ item.getId()
                       ,Toast.LENGTH_SHORT).show();
           }
       });

       bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
           @Override
           public void onReselectItem(MeowBottomNavigation.Model item) {
               Toast.makeText(getApplicationContext()
               ,"You Reslected"+item.getId()
               ,Toast.LENGTH_SHORT).show();
           }
       });

    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
    }

}

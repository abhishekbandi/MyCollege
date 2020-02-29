package avssa.compan.mycollege;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        BottomNavigationView navView1 = findViewById(R.id.nav_view1);
        navView1.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragement_container,new HomeFragment()).commit();


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);




        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();

    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedfragement=null;

            switch (item.getItemId()) {

                case R.id.navigation_home:
                    selectedfragement=new HomeFragment();
                    break;



                case R.id.navigation_dashboard:
                    selectedfragement=new DashboardFragment();
                    break;


                case R.id.navigation_achivements:
                    selectedfragement=new AchivementsFragment();
                    break;

                case R.id.navigation_updates:
                    selectedfragement=new updatesn();
                    break;



            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragement_container,selectedfragement).commit();
            return true;
        }
    };





    //======================================================================================
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent navhome=new Intent(MainActivity.this,MainActivity.class);
            startActivity(navhome);


        } else if (id == R.id.nav_about) {
            Intent navabout=new Intent(MainActivity.this,About.class);
            startActivity(navabout);



        } else if (id == R.id.nav_syllabus) {
            Intent logout = new Intent(MainActivity.this,Syllabus.class);
            startActivity(logout);


        } else if (id == R.id.nav_courses) {
            Intent navcourses=new Intent(MainActivity.this,Courses.class);
            startActivity(navcourses);



        } else if (id == R.id.nav_department) {
            Intent navdepartment=new Intent(MainActivity.this,Department.class);
            startActivity(navdepartment);



        } else if (id == R.id.nav_academic) {
            Intent navacademic=new Intent(MainActivity.this,Academic.class);
            startActivity(navacademic);



        } else if (id == R.id.nav_iqac) {
            Intent naviqac=new Intent(MainActivity.this,IQAC.class);
            startActivity(naviqac);



        }
        else if (id == R.id.nav_gymkhana) {
            Intent navgymkhana=new Intent(MainActivity.this,Gymkhana.class);
            startActivity(navgymkhana);



        }
        else if (id == R.id.nav_alumni) {
            Intent navalumni=new Intent(MainActivity.this,Alumni.class);
            startActivity(navalumni);



        }

        else if (id == R.id.nav_send) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Here is the share content body";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        }

        else if (id == R.id.nav_contact_us) {
            Intent navcontactus=new Intent(MainActivity.this,Contact_us.class);
            startActivity(navcontactus);



        }
        else if (id == R.id.nav_logout) {
            Intent logout=new Intent(MainActivity.this,Logout.class);
            startActivity(logout);

        }

        else if (id == R.id.nav_developers) {
            Intent logout=new Intent(MainActivity.this,Developers.class);
            startActivity(logout);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }




}


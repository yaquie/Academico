package academico.upeu.edu.pe.academico;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

import fragmentos.CursosFragment;
import fragmentos.EvaluacionFragment;
import fragmentos.MainFragment;
import fragmentos.RendimientoFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
private DrawerLayout drawerLayout;
    TabHost tbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.frame_main,new MainFragment()).commit();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return  true;
        }
      //  if (id == R.id.action_settings) {
       //     return true;
       // }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fm=getSupportFragmentManager();
        int id = item.getItemId();

        if (id == R.id.navinicio) {
     fm.beginTransaction().replace(R.id.frame_main, new MainFragment()).commit();
        } else if (id == R.id.navcursos) {
            fm.beginTransaction().replace(R.id.frame_main,new CursosFragment()).commit();
        } else if (id == R.id.navrendimiento) {
            fm.beginTransaction().replace(R.id.frame_main,new RendimientoFragment()).commit();
        } else if (id == R.id.navevaluacion) {
            fm.beginTransaction().replace(R.id.frame_main,new EvaluacionFragment()).commit();
        } else if (id == R.id.navopciones) {
            fm.beginTransaction().replace(R.id.frame_main,new Evaluacion_satisfaccion()).commit();
        } else if (id == R.id.navsalir) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void seleccionarItem(MenuItem itemDrawer){
        switch (itemDrawer.getItemId()){
            case R.id.navinicio:

                break;
            case R.id.navcursos:
                break;
            case R.id.navrendimiento:
                break;
            case R.id.navevaluacion:
                break;
            case R.id.navopciones:
                break;
        }
       // if (fragmentGenerico!=null){
       //     fragmentManager.beginTransaction().replace(R.id.contenedor_principal,fragmentGenerico).commit();
       // }
        setTitle(itemDrawer.getTitle());
    }

}

package academico.upeu.edu.pe.academico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;

public class Cumplimiento_Silabo extends ActionBarActivity {
    TabHost tbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tbh=(TabHost)findViewById(R.id.tabHost);
        tbh.setup();
        TabHost.TabSpec unidad=tbh.newTabSpec("unidad");
        TabHost.TabSpec fecha=tbh.newTabSpec("fecha");
        TabHost.TabSpec tema=tbh.newTabSpec("tema");
        TabHost.TabSpec docente=tbh.newTabSpec("docente");
        TabHost.TabSpec observacion=tbh.newTabSpec("observacion");


        unidad.setIndicator("Unidad");
        unidad.setContent(R.id.Unidad);
        fecha.setIndicator("Fecha");
        fecha.setContent(R.id.Fecha);
        tema.setIndicator("Tema");
        tema.setContent(R.id.Tema);
        docente.setIndicator("Docente");
        docente.setContent(R.id.Docente);
        observacion.setIndicator("Observacion");
        observacion.setContent(R.id.Observacion);

        tbh.addTab(unidad);
        tbh.addTab(fecha);
        tbh.addTab(tema);
        tbh.addTab(docente);
        tbh.addTab(observacion);

        //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void  enviar(View view){
        Intent intent=new Intent(this,Evaluacion_satisfaccion.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package academico.upeu.edu.pe.academico;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Logueo extends AppCompatActivity {
    private EditText edtluser, edtlpass;
    private Button btnlingres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        edtluser=(EditText)findViewById(R.id.edtloginusuario);
        edtlpass=(EditText)findViewById(R.id.edtloginpass);
        btnlingres=(Button)findViewById(R.id.btnloginingresar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
   public  void  IngresarLogueo(View view){
       String user,pass;
       user=edtluser.getText().toString();
       pass=edtlpass.getText().toString();
       if (user.equals("jakie")&& pass.equals("1234")){
           Intent intent=new Intent(Logueo.this,MainActivity.class);
           startActivity(intent);
           Toast.makeText(this,"bienvenido", Toast.LENGTH_LONG).show();
       }else {
           Toast.makeText(this,"Ingrese de nuevo", Toast.LENGTH_LONG).show();
       }
   }
}

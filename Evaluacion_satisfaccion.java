package academico.upeu.edu.pe.academico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import DAO.ContactoDAO;
import fragmentos.EvaluacionFragment;
import fragmentos.MainFragment;
import modelo.Contacto;

public class Evaluacion_satisfaccion extends Fragment implements View.OnClickListener {
    private ContactoDAO con;
    private EditText txtNombre,txtTel, txtDireccion, txtCorreo,txtFecha;
    private Button btnSave;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.prueba_fragment,container,false);
        con= new ContactoDAO(getActivity());
        txtTel= (EditText) view.findViewById(R.id.txtTel);
        txtCorreo= (EditText) view.findViewById(R.id.txtCorreo);
        txtDireccion= (EditText) view.findViewById(R.id.txtDireccion);
        txtFecha= (EditText) view.findViewById(R.id.txtFecha);
        txtNombre= (EditText) view.findViewById(R.id.txtNombre);
        btnSave= (Button) view.findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSave:
        }
        }

}

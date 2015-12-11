package academico.upeu.edu.pe.academico;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import modelo.Rendimiento;

/**
 * Created by Usuario on 09/12/2015.
 */
public class AdaptadorInicio
        extends RecyclerView.Adapter<AdaptadorInicio.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
       public TextView edtid,edtapellido,edtporcentaje;
        public  ImageView imagen;

        public ViewHolder(View v) {
            super(v);
            edtid=(TextView) v.findViewById(R.id.idpersona);
            edtapellido=(TextView) v.findViewById(R.id.apellido_persona);
            edtporcentaje=(TextView) v.findViewById(R.id.porcentaje_persona);
            imagen=(ImageView) v.findViewById(R.id.mimiatura_promedio);
        }
    }

    public AdaptadorInicio() {
    }

    @Override
    public AdaptadorInicio.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AdaptadorInicio.ViewHolder holder, int i) {
 Rendimiento item=Rendimiento.NOTAS_GENER.get(i);
        Glide.with(holder.itemView.getContext())
                .load(item.getIdpersona()).centerCrop().into(holder.imagen);
        holder.edtid.setText(item.getIdpersona());
        holder.edtapellido.setText(item.getApellido());
        holder.edtporcentaje.setText(item.getGradoacademico());
    }

    @Override
    public int getItemCount() {
        return Rendimiento.RENDIMIENTO.size();
    }
}

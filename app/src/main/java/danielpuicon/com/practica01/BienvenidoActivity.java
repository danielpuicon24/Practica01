package danielpuicon.com.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BienvenidoActivity extends AppCompatActivity implements View.OnClickListener {

    TextView layout_usuario;
    Button layout_salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        layout_usuario = findViewById(R.id.layout_txtUsuario);
        layout_salir =findViewById(R.id.layout_botonSalir);
        layout_salir.setOnClickListener(this);

        int indexusuario = Datos.indexusuarios;
        String nombres = Datos.nombres[indexusuario];
        layout_usuario.setText(nombres);


    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}

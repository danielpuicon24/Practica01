package danielpuicon.com.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesion01 extends AppCompatActivity implements View.OnClickListener {

    EditText txtUsuario, txtPassword;
    Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion01);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtPassword = findViewById(R.id.txtPassword);
        btnEntrar = findViewById(R.id.layout_btnIniciar01);
        btnEntrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String User = txtUsuario.getText().toString();
        String Pass = txtPassword.getText().toString();
        boolean usuarioEncontrado = false;
        for(int i = 0; i < Datos.usuarios.length; i++){
            if (Datos.usuarios[i].equalsIgnoreCase(User))
            {
                if (Datos.contraseña[i].equalsIgnoreCase(Pass))
                {
                    // cambiar de actividad
                    usuarioEncontrado = true;
                    Toast.makeText(this, "Felicidades, Clave correcta" , Toast.LENGTH_SHORT).show();
                    Datos.indexusuarios = i;
                    Intent pantallaMostrarDatosLogin = new Intent(this, BienvenidoActivity.class);
                    //Indicarle los extras(parametros)
                    //Abrir el activity
                    startActivity(pantallaMostrarDatosLogin);
                    //Cerrar Main Activity
                    this.finish();
                }else {
                    Toast.makeText(this, "Password incorrecto", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
        if (!usuarioEncontrado){
            Toast.makeText(this, "Usuario incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}

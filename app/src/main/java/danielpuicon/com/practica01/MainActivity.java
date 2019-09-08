package danielpuicon.com.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaracion de variables
    Button btnIniciar01, btnIniciar02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIniciar01 = findViewById(R.id.btnIniciar01);
        btnIniciar02 = findViewById(R.id.btnIniciar02);

        btnIniciar01.setOnClickListener(this);
        btnIniciar02.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case (R.id.btnIniciar01):
            {
                Intent mostrarInicio01 = new Intent(this, IniciarSesion01.class);
                //Indicarle los extras(parametros)
                //Abrir el activity
                startActivity(mostrarInicio01);
                //Cerrar Main Activity
                this.finish();
                break;
            }
            case (R.id.btnIniciar02):
            {
                Intent mostrarInicio02 = new Intent(this, IniciarSesion02.class);
                //Indicarle los extras(parametros)
                //Abrir el activity
                startActivity(mostrarInicio02);
                //Cerrar Main Activity
                this.finish();
                break;
            }
        }
    }
}

package danielpuicon.com.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IniciarSesion02 extends AppCompatActivity implements View.OnClickListener {

    Integer[] Numeros = new Integer[]{1,2,3,4,5,6,7,8,9,0};

    Button act2_btn2, act2_btn3,act2_btn4,act2_btn5,act2_btn6,
            act2_btn7,act2_btn8,act2_btn9,act2_btn10,act2_btn11,act2_btn12, act2_btn13;
    EditText txtusuario_iniciar02;
    TextView txtclave_iniciar02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion02);

        act2_btn2 = findViewById(R.id.btn_01);
        act2_btn3 = findViewById(R.id.btn_02);
        act2_btn4 = findViewById(R.id.btn_03);
        act2_btn5 = findViewById(R.id.btn_04);
        act2_btn6 = findViewById(R.id.btn_05);
        act2_btn7 = findViewById(R.id.btn_06);
        act2_btn8 = findViewById(R.id.btn_07);
        act2_btn9 = findViewById(R.id.btn_08);
        act2_btn10 = findViewById(R.id.btn_09);
        act2_btn11 = findViewById(R.id.btn_10);
        act2_btn12 = findViewById(R.id.btn_11);
        act2_btn13 = findViewById(R.id.btn_12);

        txtusuario_iniciar02 = findViewById(R.id.act2_txtusuario);
        txtclave_iniciar02 = findViewById(R.id.act2_txtpassword);

        act2_btn2.setOnClickListener(this);
        act2_btn3.setOnClickListener(this);
        act2_btn4.setOnClickListener(this);
        act2_btn5.setOnClickListener(this);
        act2_btn6.setOnClickListener(this);
        act2_btn7.setOnClickListener(this);
        act2_btn8.setOnClickListener(this);
        act2_btn9.setOnClickListener(this);
        act2_btn10.setOnClickListener(this);
        act2_btn11.setOnClickListener(this);
        act2_btn12.setOnClickListener(this);
        act2_btn13.setOnClickListener(this);


        for (int i = 0; i < Numeros.length; i++ ){

            Collections.shuffle(Arrays.asList(Numeros));

            act2_btn2.setText(String.valueOf(Numeros[0]));
            act2_btn3.setText(String.valueOf(Numeros[1]));
            act2_btn4.setText(String.valueOf(Numeros[2]));
            act2_btn5.setText(String.valueOf(Numeros[3]));
            act2_btn6.setText(String.valueOf(Numeros[4]));
            act2_btn7.setText(String.valueOf(Numeros[5]));
            act2_btn8.setText(String.valueOf(Numeros[6]));
            act2_btn9.setText(String.valueOf(Numeros[7]));
            act2_btn10.setText(String.valueOf(Numeros[8]));
            act2_btn11.setText(String.valueOf(Numeros[9]));
        }
    }




    @Override
    public void onClick(View v) {

        String capturar_dato = txtclave_iniciar02.getText().toString();
        String User = txtusuario_iniciar02.getText().toString();

        boolean usuarioEncontrado = false;
        switch (v.getId()){
            case R.id.btn_01:
                capturar_dato = capturar_dato + act2_btn2.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_02:
                capturar_dato = capturar_dato + act2_btn3.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_03:
                capturar_dato = capturar_dato + act2_btn4.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_04:
                capturar_dato = capturar_dato + act2_btn5.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_05:
                capturar_dato = capturar_dato + act2_btn6.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_06:
                capturar_dato = capturar_dato + act2_btn7.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_07:
                capturar_dato = capturar_dato + act2_btn8.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_08:
                capturar_dato = capturar_dato + act2_btn9.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_09:
                capturar_dato = capturar_dato + act2_btn10.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_10:
                capturar_dato = capturar_dato + act2_btn11.getText();
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_11:
                capturar_dato = capturar_dato.substring(0, txtclave_iniciar02.length()-1);
                txtclave_iniciar02.setText(capturar_dato);
                break;
            case R.id.btn_12:
                for(int i = 0; i < Datos.usuarios.length; i++){
                    if (Datos.usuarios[i].equalsIgnoreCase(User))
                    {
                        if (Datos.contraseña[i].equalsIgnoreCase(capturar_dato))
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
}

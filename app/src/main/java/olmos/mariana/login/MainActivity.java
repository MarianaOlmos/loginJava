package olmos.mariana.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNombre, etPass;
    Button btnboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        //match con los widgets
        etNombre = findViewById(R.id.etnombre);//me dice que el elemento que declare se une al de la vista(vista es etnombre)(variable es etNombre)
        etPass = findViewById(R.id.etpass);//así se crea la union entre la vista y el objeto para que sean diferentes los ids
        btnboton = findViewById(R.id.btnEntrar);

        btnboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = etNombre.getText().toString();
                String password = etPass.getText().toString();
                if(nombreUsuario.isEmpty() || password.isEmpty()){//nombre de usuario vacio
                }else{
                    if(nombreUsuario.equals("Mariana") && password.equals("1234")){
                        mensajito("El usuario o contraseña estan vacios");//imprimir bienvenido
                    }else{
                        //imprimimos datos erroneos
                        mensajito("Los datos son erroneos");
                    }
                }
            }
        });
    }
    public void mensajito(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}

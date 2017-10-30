package cl.inacaptemuco.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button cero;
    private Button uno;
    private Button dos;
    private Button tres;
    private Button cuatro;
    private Button cinco;
    private Button seis;
    private Button siete;
    private Button ocho;
    private Button nueve;
    private Button sumar;
    private Button restar;
    private Button multiplicar;
    private Button dividir;
    private Button igual;
    private Button limpiar;
    private TextView info;
    private TextView resultado;
    private final char ADICION = '+';
    private final char SUSTRACCION = '-';
    private final char MULTIPLICACION = '*';
    private final char DIVISION = '/';
    private final char IGUAL = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACCION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupInterfaz();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            calcular();
                ACCION = ADICION;
                resultado.setText(String.valueOf(val1 + "+"));
                info.setText(null);
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
                ACCION = SUSTRACCION;
                resultado.setText(String.valueOf(val1 + "-"));
                info.setText(null);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
                ACCION = MULTIPLICACION;
                resultado.setText(String.valueOf(val1 + "*"));
                info.setText(null);
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
                ACCION = DIVISION;
                resultado.setText(String.valueOf(val1 + "/"));
                info.setText(null);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
                ACCION = IGUAL;
                resultado.setText(resultado.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (info.getText().length() > 0){
                    CharSequence nombre = info.getText().toString();
                    info.setText(nombre.subSequence(0, nombre.length()-1));

                    }
                    else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    resultado.setText(null);
                }
                }

        });

        }


    private void setupInterfaz () {
        cero = (Button)findViewById(R.id.btn0);
        uno = (Button)findViewById(R.id.btn1);
        dos = (Button)findViewById(R.id.btn2);
        tres = (Button)findViewById(R.id.btn3);
        cuatro = (Button)findViewById(R.id.btn4);
        cinco = (Button)findViewById(R.id.btn5);
        seis = (Button)findViewById(R.id.btn6);
        siete = (Button)findViewById(R.id.btn7);
        ocho = (Button)findViewById(R.id.btn8);
        nueve = (Button)findViewById(R.id.btn9);
        sumar = (Button)findViewById(R.id.btnSumar);
        restar = (Button)findViewById(R.id.btnRestar);
        multiplicar = (Button)findViewById(R.id.btnMultiplicar);
        dividir = (Button)findViewById(R.id.btnDividir);
        igual = (Button)findViewById(R.id.btnIgual);
        info = (TextView)findViewById(R.id.txvControl);
        resultado = (TextView)findViewById(R.id.txvResultado);
        limpiar = (Button)findViewById(R.id.btnLimpiar);
    }

        private void calcular(){
            if(!Double.isNaN(val1)){
                val2 = Double.parseDouble(info.getText().toString());

                switch(ACCION){
                    case ADICION:
                        val1 = val1 + val2;
                        break;
                    case SUSTRACCION:
                        val1 = val1 - val2;
                        break;
                    case MULTIPLICACION:
                        val1 = val1 * val2;
                        break;
                    case DIVISION:
                        val1 = val1 / val2;
                        break;
                    case IGUAL:
                        break;
                }
            }
            else{
                val1 = Double.parseDouble(info.getText().toString());
            }
        }
}

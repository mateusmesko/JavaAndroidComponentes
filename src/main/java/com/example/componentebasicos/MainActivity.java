package com.example.componentebasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView resultado;

    private CheckBox checkVermelho,checkAmarelo,checkAzul;
    private RadioButton opcao1,opcao2;
    private RadioGroup grupos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );



        //campo1
        campoNome       = findViewById( R.id.idNome );
        campoEmail      = findViewById( R.id.idEmail );
        resultado       = findViewById(R.id.resultado);

        //checkbox
        checkAmarelo    =findViewById( R.id.checkAmarelo );
        checkVermelho   =findViewById( R.id.checkVermelho );
        checkAzul       =findViewById( R.id.checkAzul );

        //radio buttom
        opcao1          =findViewById( R.id.radioB1 );
        opcao2          =findViewById( R.id.radioB2 );

        //radio groupe
        grupos          =findViewById( R.id.grupoRadio );

        radiobutton();
    }

    public void radiobutton(){

        grupos.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                    if (checkedId==R.id.radioB1){
                        resultado.setText( "opcao 1" );
                    }
                    else{
                        resultado.setText( "opcao 2" );
                    }
            }
        } );

        /*
        if(opcao1.isChecked()){
            resultado.setText( "masc" );
        }else{
            resultado.setText( "fem" );
        }
         */



    }

    public void checkBox(){
        String texto="";
        if(checkAmarelo.isChecked()){
            //String corSelecionada=checkAmarelo.getText().toString();
            //texto=corSelecionada;
            texto=texto+"Amarelo selecionado";
        }
        if(checkAzul.isChecked()){
            texto=texto+" Azul: selecionado";
        }
        if(checkVermelho.isChecked()){
            texto=texto+" Vermelho: selecionado";
        }
        resultado.setText(texto);
    }


    public void enviar(View view)
    {
        //checkBox();
        //radiobutton();
    /*
        String nome = campoNome.getText().toString();
        String email=campoEmail.getText().toString();
        resultado.setText("nome: "+nome+" email: "+email);

     */
    }

    public void limpar(View view){
        resultado.setText("Resultado");
    }


}

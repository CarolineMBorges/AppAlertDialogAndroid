package com.android.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void abrirAlerta(View view){

       AlertDialog.Builder dialog = new AlertDialog.Builder(this);

       //configuração título e mensagem
       dialog.setTitle("Título");
       dialog.setMessage("Mensagem de alerta");

       //configuração do cancelamento
       dialog.setCancelable(false);

       dialog.setIcon(android.R.drawable.ic_delete);

       //configuração de ações pra o botão sim ou não
       dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_SHORT).show();
           }
       });

       dialog.setNegativeButton("Não", new DialogInterface.OnClickListener () {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_SHORT).show();
           }
       });

       //Criar e exibir alert dialogo
       dialog.create();
       dialog.show();
   }
}

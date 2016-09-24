package com.example.joshuareno.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.support.v4.app.DialogFragment;
import java.lang.String;
import android.app.AlertDialog;
import android.widget.Button;
import android.content.DialogInterface;
import android.app.Dialog;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.plusButton);
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("plusButton");
                dialog.setContentView(R.layout.customdialog_layout);
                dialog.show();

                final EditText editText = (EditText)dialog.findViewById(R.id.editText2);
                Button cancelButton = (Button)dialog.findViewById(R.id.button_cancelling);
                Button studyButton = (Button)dialog.findViewById(R.id.button_planningToStudy);
                Button addEvent = (Button)dialog.findViewById(R.id.button_addingEvent);

                cancelButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText(getApplicationContext(), "Canceled", Toast.LENGTH_SHORT).show();

                        dialog.cancel();
                    }
                });

                studyButton.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText(getApplicationContext(), "Studying!", Toast.LENGTH_SHORT).show();

                        dialog.cancel();
                    }
                });

                addEvent.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText(getApplicationContext(), "New Event", Toast.LENGTH_SHORT).show();

                        dialog.cancel();
                    }
                });



            }
        });

    }




//    /** Called when the user clicks the Send button */
//    public void sendMessage(View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//
//    }





}

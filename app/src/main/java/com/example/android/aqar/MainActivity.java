package com.example.android.aqar;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buy = (Button)findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Inflate and set the layout for the dialog
                // Pass null as the parent view because its going in the dialog layout
                View view = getLayoutInflater().inflate(R.layout.dialogue_layout , null);
                final EditText visanum = v.findViewById(R.id.visaNum);
                final EditText visapassword = v.findViewById(R.id.visaPassword);


                builder.setView(view)
                        // Add action buttons
                        .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                            @Override
                  public void onClick(DialogInterface dialog, int id) {

                                    Toast.makeText(MainActivity.this , "Submit Successfully" ,
                                            Toast.LENGTH_SHORT).show();

                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog dialoge = builder.create();
                dialoge.show();
            }
        });
    }
}

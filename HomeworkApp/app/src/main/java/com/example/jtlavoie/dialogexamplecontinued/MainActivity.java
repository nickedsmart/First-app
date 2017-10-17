package com.example.jtlavoie.dialogexamplecontinued;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void open(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this );
        final String[] myArray;

        myArray = new String[]{"New Hamshire", "Massachusetts", "Connecticut", "Vermont", "Rhode Island", "Maine"};
        // Add the buttons
        builder.setTitle("NEW ENGLAND");
        builder.setItems(myArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which){
                TextView textView2 = (TextView)findViewById(R.id.textView2);
            textView2.setText(myArray[which]);
            }
        });
        /*
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
                finish();
            }
        });
        */
        AlertDialog dialog = builder.create();
        dialog.show();


    }
}

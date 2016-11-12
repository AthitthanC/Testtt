package com.example.athitthan.helloword;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import java.net.ContentHandler;

/**
 * Created by Athitthan on 12-Nov-16.
 */

public class MyAlert {
    //Explicit
    private Context context;
    private int anInt;
    private String titleString, messageString;

    //เป็นตัว setter ให้กับตัวแปร 4 ตัว
    public MyAlert(Context context, int anInt, String titleString, String messageString) {
        this.context = context;
        this.anInt = anInt;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public void myDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.show();
    } // myDialog

} // Main Class

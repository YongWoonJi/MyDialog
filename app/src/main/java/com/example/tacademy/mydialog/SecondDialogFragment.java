package com.example.tacademy.mydialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class SecondDialogFragment extends DialogFragment {
    public static SecondDialogFragment newInstance(String message) {
        SecondDialogFragment dialog = new SecondDialogFragment();
        Bundle b = new Bundle();
        b.putString("message", message);
        dialog.setArguments(b);
        return dialog;
    }

    String message;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (getArguments() != null) {
            message = getArguments().getString("message");
        }
        super.onCreate(savedInstanceState);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("title2");
        builder.setMessage("items: " + message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        return builder.show();
    }
}

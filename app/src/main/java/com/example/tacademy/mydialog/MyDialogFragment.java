package com.example.tacademy.mydialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;

/**
 * Created by Tacademy on 2016-08-02.
 */
public class MyDialogFragment extends DialogFragment {
    String[] items = {"item1", "item2", "item3", "item4", "item5"};

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("title");
        builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String message = items[i];
                SecondDialogFragment f = SecondDialogFragment.newInstance(message);
                Fragment old = getFragmentManager().findFragmentByTag("dialog");
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                if (old != null) {
                    ft.remove(old);
                }
                ft.addToBackStack(null);
                f.show(ft, "childfragment");
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        return builder.create();

    }
}

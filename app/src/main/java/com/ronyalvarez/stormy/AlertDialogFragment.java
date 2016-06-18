package com.ronyalvarez.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by ronyalvarez on 6/15/16.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contex = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(contex);
        builder.setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_button_text, null);

        AlertDialog dialog =  builder.create();
        return dialog;

    }
}

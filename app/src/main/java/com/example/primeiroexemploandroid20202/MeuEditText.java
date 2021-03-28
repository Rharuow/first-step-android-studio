package com.example.primeiroexemploandroid20202;

import androidx.appcompat.widget.AppCompatEditText;
import android.content.Context;
import android.text.InputType;

public class MeuEditText extends AppCompatEditText {
    public MeuEditText(Context context) {
        super(context);
        setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
    }
}

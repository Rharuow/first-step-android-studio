package com.example.primeiroexemploandroid20202;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Tela extends View implements Runnable {

    private float x = 500;
    private float y =  500;
    private float TAMANHO = 50;

    private float xC = 100, yC= 100;

    public Tela(Context context) {
        super(context);
    }

    public void onDraw(Canvas c) {
        super.onDraw(c);

        Paint p = new Paint();
        p.setColor(Color.BLUE);
        c.drawRect(x,y, x+ TAMANHO, y + TAMANHO, p);

        p.setColor(Color.GREEN);
        c.drawCircle(xC, yC, TAMANHO, p);
    }

    public boolean onTouchEvent(MotionEvent e) {
        x = e.getX();
        invalidate();
        return true;
    }

    @Override
    public void run() {
        while (true) {
            yC += 10;
            invalidate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.samsung.et10;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Rectangle extends View {
    Paint paint = new Paint();

    public Rectangle(Context context, int l) {
        super(context);

    }
    @Override
    public void onDraw(Canvas canvas) {
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6);
//      Rect rect = new Rect(getLeft(), 100, 620, 900);
        Rect rect = new Rect(getLeft()+(getRight()-getLeft())/4,
                getTop()+(getBottom()-getTop())/3,
                getRight()-(getRight()-getLeft())/4,
                getBottom()-(getBottom()-getTop())/3);
        canvas.save();

        canvas.drawRect(rect, paint);
    }
}
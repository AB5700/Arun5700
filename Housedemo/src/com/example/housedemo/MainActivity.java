package com.example.housedemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
MyView m;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		m=new MyView(this);
		setContentView(m);
	}
private class MyView extends View
{
	public MyView(Context context)
	{
		super(context);
	}
protected void onDraw(Canvas canvas){
super.onDraw(canvas);
Paint paint=new Paint();
paint.setStyle(Paint.Style.FILL);
paint.setColor(Color.WHITE);
canvas.drawPaint(paint);
paint.setColor(Color.BLUE);
canvas.drawLine(50, 100, 150, 100, paint);
canvas.drawLine(50,250,150,250, paint);
canvas.drawLine(100,50,250,50, paint);
paint.setColor(Color.BLACK);
canvas.drawLine(150,100,300,100, paint);
canvas.drawLine(150,250,300,250, paint);
paint.setColor(Color.BLACK);
canvas.drawLine(50,100,100,50, paint);
canvas.drawLine(150,100,100,50,paint);
canvas.drawLine(200,100,150,50, paint);
canvas.drawLine(250,100,200,50,paint);
canvas.drawLine(300,100,250,50,paint);
paint.setColor(Color.RED);
canvas.drawLine(50,100,50,250,paint);
canvas.drawLine(150,100,150,250,paint);
canvas.drawLine(300,100,300,250, paint);
canvas.drawLine(200,150,200,200,paint);
canvas.drawLine(250,150,250,200,paint);
paint.setColor(Color.BLUE);
canvas.drawLine(200,150,250,150, paint);
canvas.drawLine(200,200,250,200, paint);
paint.setColor(Color.BLACK);
canvas.drawLine(225,150,225,200, paint);
canvas.drawLine(200,175,250,175, paint);


canvas.restore();
}
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

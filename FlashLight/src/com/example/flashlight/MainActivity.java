package com.example.flashlight;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	Button bton, btof ;
	Camera camera ;

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if(camera!=null)
		{
			camera.release() ;
		}
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		bton=(Button)findViewById(R.id.button1) ;
		btof=(Button)findViewById(R.id.button2) ;
		camera = Camera.open();
		Parameters p = camera.getParameters();
		bton.setOnClickListener(this) ;
		btof.setOnClickListener(this) ;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Parameters p = camera.getParameters();
		switch(arg0.getId())
		{
		
		case R.id.button1:
			p.setFlashMode(Parameters.FLASH_MODE_TORCH);
            camera.setParameters(p);
			camera.startPreview() ;
			
			
			break ;
		case R.id.button2:
			p.setFlashMode(Parameters.FLASH_MODE_OFF);
			camera.setParameters(p);
			camera.stopPreview();
            break ;
		}
		
	}

}

package br.com.parkingalot;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SplashScreen extends Util {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		IncializaComponentsSplash();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.splash_screen, menu);
		return true;
	}
	
	private void IncializaComponentsSplash(){
		tv_carregando_splash = (TextView) findViewById(R.id.tv_carregando_splash);
		PoloFont(tv_carregando_splash);		
	}

}

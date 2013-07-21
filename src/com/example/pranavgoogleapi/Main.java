package com.example.pranavgoogleapi;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main extends FragmentActivity {

	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		map = ((SupportMapFragment) getSupportFragmentManager()
				.findFragmentById(R.id.map)).getMap();
		static final LatLng MELBOURNE = new LatLng(-37.81319, 144.96298);
		Marker melbourne = map.addMarker(new MarkerOptions()
		                          .position(MELBOURNE)
		                          .title("Melbourne")
		                          .snippet("Population: 4,137,400"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.idea:
			Toast.makeText(getBaseContext(), "Ideas ....", Toast.LENGTH_SHORT).show();
			break;
		
		case R.id.issues:
			Toast.makeText(getBaseContext(), "issues ....", Toast.LENGTH_SHORT).show();
			break;
		case R.id.suggest:
			Toast.makeText(getBaseContext(), "suggest ....", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		

		return super.onOptionsItemSelected(item);
	}

}

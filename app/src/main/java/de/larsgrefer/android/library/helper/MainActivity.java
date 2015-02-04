package de.larsgrefer.android.library.helper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import de.larsgrefer.android.library.injection.annotation.XmlLayout;
import de.larsgrefer.android.library.injection.annotation.XmlView;
import de.larsgrefer.android.library.ui.injection.InjectionActivity;

@XmlLayout(R.layout.activity_main)
public class MainActivity extends InjectionActivity {


	@XmlView(R.id.floatLabelButton)
	Button floatLabelButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		floatLabelButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(getApplicationContext(), FloatLabelActivity.class));
			}
		});
	}

}

package test.javareact;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	Handler handler = new Handler();
	ImageView image;
	TextView tv;
	ReactiveString react1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image = (ImageView) findViewById(R.id.carOk);
		tv = (TextView) findViewById(R.id.reactValue);
		new Thread(new ClientThread()).start();
	}

	class ClientThread implements Runnable, ReactiveListener {

		@Override
		public void run() {
			Consts.hostName = "android";
			react1 = ReactiveFactory.getString("Remote.obString.get()","");
			react1.addReactiveListener(this);
		}

		@Override
		public void notifyReactiveChange(final Value value) {
			runOnUiThread(new Runnable() {
			     @Override
			     public void run() {
			    	 tv.setText(value.stringVal());
			    	 
			    	 image.setImageResource(R.drawable.car_left_top);
			    }
			});
		}

		@Override
		public void notifyReactiveUpdate(Value value) {
			// TODO Auto-generated method stub

		}

	}

	

}

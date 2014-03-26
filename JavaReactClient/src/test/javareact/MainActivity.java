package test.javareact;

import test.javareact.common.Consts;
import test.javareact.common.types.reactive.ReactiveFactory;
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

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		image = (ImageView) findViewById(R.id.carOk);
		tv = (TextView) findViewById(R.id.reactValue);
		new Thread(new ClientThread()).start();
	}

	class ClientThread implements Runnable {

		@Override
		public void run() {
			Consts.hostName = "android";
			final ReactiveString react1 = ReactiveFactory.getString(
					"Remote.obString.get()", "vvvvvvvvv", "aaaaaa");
			
			
			 while (true) {
				 //System.out.println(react1.get());
				 handler.post(new Runnable() {
		                public void run() {
		                	tv.setText("Value is " + react1.get());
//							if (react1.get().compareTo("ciao")==0){
//			                	image.setImageResource(R.drawable.car_left_back);
//
//		                	}
//							else if (react1.get().compareTo("ciao1")==0){
//			                	image.setImageResource(R.drawable.car_left_top);
//
//		                	}
		                }
		            });
				 
			 try {
			 Thread.sleep(500);
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
			 }

		}

	}
	
//	TextView tv;
//	
//	@Override
//	public void onCreate(Bundle savedInstanceState){
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
//		tv = (TextView) findViewById(R.id.reactValue);
//	}

}


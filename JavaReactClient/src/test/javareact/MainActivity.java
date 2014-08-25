package test.javareact;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import test.javareact.common.types.reactive.ReactiveString;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ImageView image;
	ImageView tireLight1;
	ImageView tireLight2;
	ImageView tireLight3;
	ImageView tireLight4;
	TextView tireText1;
	TextView tireText2;
	TextView tireText3;
	TextView tireText4;
	ReactiveBool react1;
	ReactiveBool react2;
	ReactiveBool react3;
	ReactiveBool react4;
//	ReactiveBool reactBrake1;
//	ReactiveBool reactBrake2;
//	ReactiveBool reactBrake3;
//	ReactiveBool reactBrake4;
//	ReactiveBool reactStreet;
	public boolean tire1;
	public boolean tire2;
	public boolean tire3;
	public boolean tire4;
//	public boolean brake1;
//	public boolean brake2;
//	public boolean brake3;
//	public boolean brake4;
//	public boolean street;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// tToast("onCreate");
		// tire1 = true;
		// tire2 = true;
		// tire3 = true;
		// tire4 = true;
		setContentView(R.layout.activity_main);
		image = (ImageView) findViewById(R.id.carOk);
//		TireTv = (TextView) findViewById(R.id.reactValue);
//		BrakeTv = (TextView) findViewById(R.id.reactValue2);
//		StreetTv = (TextView) findViewById(R.id.reactValue3);
		tireText1 = (TextView) findViewById(R.id.tireText1);
		tireText2 = (TextView) findViewById(R.id.tireText2);
		tireText3 = (TextView) findViewById(R.id.tireText3);
		tireText4 = (TextView) findViewById(R.id.tireText4);
		tireLight1 = (ImageView) findViewById(R.id.tireLight1);
		tireLight2 = (ImageView) findViewById(R.id.tireLight2);
		tireLight3 = (ImageView) findViewById(R.id.tireLight3);
		tireLight4 = (ImageView) findViewById(R.id.tireLight4);
		new Thread(new ClientThread()).start();
	}

	
	class ClientThread implements Runnable {

		@Override
		public void run() {
			Consts.hostName = "TiresCondition";
			react1 = ReactiveFactory.getBool("((TirePressureAL.ObTirePressureAL.firstElement():ListDouble * 1.1) < TirePressureAL.ObTirePressureAL.lastElement():ListDouble) | ((TirePressureAL.ObTirePressureAL.firstElement():ListDouble * 0.8) > TirePressureAL.ObTirePressureAL.lastElement():ListDouble)", false, "WrongPressureAL");
			tire1 = react1.get();
			react1.addReactiveListener(new Tire(react1, 1));
			
			react2 = ReactiveFactory.getBool("((TirePressureAR.ObTirePressureAR.firstElement():ListDouble * 1.1) < TirePressureAR.ObTirePressureAR.lastElement():ListDouble) | ((TirePressureAR.ObTirePressureAR.firstElement():ListDouble * 0.8) > TirePressureAR.ObTirePressureAR.lastElement():ListDouble)", false, "WrongPressureAR");
			tire2 = react2.get();
			react2.addReactiveListener(new Tire(react2, 2));

			react3 = ReactiveFactory.getBool("((TirePressurePL.ObTirePressurePL.firstElement():ListDouble * 1.1) < TirePressurePL.ObTirePressurePL.lastElement():ListDouble) | ((TirePressurePL.ObTirePressurePL.firstElement():ListDouble * 0.8) > TirePressurePL.ObTirePressurePL.lastElement():ListDouble)", false, "WrongPressurePL");
			tire3 = react3.get();
			react3.addReactiveListener(new Tire(react3, 3));

			react4 = ReactiveFactory.getBool("((TirePressurePR.ObTirePressurePR.firstElement():ListDouble * 1.1) < TirePressurePR.ObTirePressurePR.lastElement():ListDouble) | ((TirePressurePR.ObTirePressurePR.firstElement():ListDouble * 0.8) > TirePressurePR.ObTirePressurePR.lastElement():ListDouble)", false, "WrongPressurePR");
			tire4 = react4.get();
			react4.addReactiveListener(new Tire(react4, 4));
		}

	}

	@Override
	public void onStart() {
		super.onStart();
		tToast("onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		tToast("onResume");
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
//			TireTv.setText("WARNING: Problem on " + extras.getString("Tire")
//					+ "Tire!");
			setImage(extras.getBoolean("Tire1"), extras.getBoolean("Tire2"),
					extras.getBoolean("Tire3"), extras.getBoolean("Tire4"));
		}
	}

	@Override
	public void onPause() {
		super.onPause();
		tToast("onPause");
	}

	@Override
	public void onRestart() {
		super.onRestart();
		tToast("onRestart");
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
//			TireTv.setText("WARNING: Problem on " + extras.getString("Tire")
//					+ "Tire!");
			setImage(extras.getBoolean("Tire1"), extras.getBoolean("Tire2"),
					extras.getBoolean("Tire3"), extras.getBoolean("Tire4"));
		}
	}

	

//	private class Street implements ReactiveListener {
//		private final ReactiveBool reactive;
//		
//		Street(ReactiveBool reactive){
//			this.reactive = reactive;
//		}
//
//		@Override
//		public void notifyReactiveChange(final Value value) {
//			runOnUiThread(new Runnable() {
//				@Override
//				public void run() {
//					//tv.setText(String.valueOf(value.boolVal()));
//						if (reactive.get() == true) {
//							StreetTv.setText("You are driving on a line");
//							
//						} else {
//							StreetTv.setText("Curve");
//							
//						}
//				}
//			});
//		}
//
//		@Override
//		public void notifyReactiveUpdate(Value value) {
//			// TODO Auto-generated method stub
//		}
//	}
	
	
	private class Tire implements ReactiveListener {
		private final ReactiveBool reactive;
		private final int n;

		Tire(ReactiveBool reactive, int n) {
			this.reactive = reactive;
			this.n = n;

		}

		@Override
		public void notifyReactiveChange(final Value value) {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					//tv.setText(String.valueOf(value.boolVal()));
					switch (n) {
					case 1:
						if (reactive.get() == true) {
							tireText1.setText("Anterior Left Tire WARNING!");
							tireLight1.setImageResource(R.drawable.red);
							tire1 = true;
							createNotification("Anterior Left", tire1, tire2,
									tire3, tire4);
						} else {
							tireText1.setText("Anterior Left Tire OK");
							tireLight1.setImageResource(R.drawable.green);
							tire1 = false;
						}
						break;
					case 2:
						if (reactive.get() == true) {
							tireText2.setText("Anterior Right Tire WARNING!");
							tireLight2.setImageResource(R.drawable.red);
							tire2 = true;
							createNotification("Anterior Right", tire1, tire2,
									tire3, tire4);
						} else {
							tireText2.setText("Anterior Right Tire OK");
							tireLight2.setImageResource(R.drawable.green);
							tire2 = false;
						}
						break;
					case 3:
						if (reactive.get() == true) {
							tireText3.setText("Posterior Left Tire WARNING!");
							tireLight3.setImageResource(R.drawable.red);
							tire3 = true;
							createNotification("Posterior Left", tire1, tire2,
									tire3, tire4);
						} else {
							tireText3.setText("Posterior Left Tire OK");
							tireLight3.setImageResource(R.drawable.green);
							tire3 = false;
						}
						break;
					case 4:
						if (reactive.get() == true) {
							tireText4.setText("Posterior Right Tire WARNING!");
							tireLight4.setImageResource(R.drawable.red);
							tire4 = true;
							createNotification("Posterior Right", tire1, tire2,
									tire3, tire4);
						} else {
							tireText4.setText("Posterior Right Tire OK");
							tireLight4.setImageResource(R.drawable.green);
							tire4 = false;
						}
						break;
					}

					setImage(tire1, tire2, tire3, tire4);
				}
			});
		}

	}
	
//	private class Brake implements ReactiveListener {
//		private final ReactiveBool reactive;
//		private final int n;
//
//		Brake(ReactiveBool reactive, int n) {
//			this.reactive = reactive;
//			this.n = n;
//
//		}
//
//		@Override
//		public void notifyReactiveChange(final Value value) {
//			runOnUiThread(new Runnable() {
//				@Override
//				public void run() {
//					//tv.setText(String.valueOf(value.boolVal()));
//					switch (n) {
//					case 1:
//						if (reactive.get() == true) {
//							BrakeTv.setText("WARNING: Problem on Anterior Left Brake!");
//							brake1 = true;
//							
////							createNotification("Anterior Left", brake1, brake2,
////									brake3, brake4);
//						} else {
//							BrakeTv.setText("");
//							brake1 = false;
//						}
//						break;
//					case 2:
//						if (reactive.get() == true) {
//							BrakeTv.setText("WARNING: Problem on Anterior Right Brake!");
//							brake2 = true;
////							createNotification("Anterior Right", brake1, brake2,
////									brake3, brake4);
//						} else {
//							brake2 = false;
//						}
//						break;
//					case 3:
//						if (reactive.get() == true) {
//							BrakeTv.setText("WARNING: Problem on Posterior Left Brake!");
//							brake3 = true;
////							createNotification("Posterior Left",  brake1, brake2,
////									brake3, brake4);
//						} else {
//							brake3 = false;
//						}
//						break;
//					case 4:
//						if (reactive.get() == true) {
//							BrakeTv.setText("WARNING: Problem on Posterior Right Brake!");
//							brake4 = true;
////							createNotification("Posterior Right",  brake1, brake2,
////									brake3, brake4);
//						} else {
//							brake4 = false;
//						}
//						break;
//					}
//
////					setImage(tire1, tire2, tire3, tire4);
//				}
//			});
//		}
//
//		@Override
//		public void notifyReactiveUpdate(Value value) {
//			// TODO Auto-generated method stub
//		}
//	}

	private void tToast(String s) {
		Context context = getApplicationContext();
		int duration = Toast.LENGTH_SHORT;
		Toast toast = Toast.makeText(context, s, duration);
		toast.show();
	}

	public void createNotification(String tire, boolean tire1, boolean tire2,
			boolean tire3, boolean tire4) {

		NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(
				this.getApplicationContext());
		notificationBuilder.setContentTitle("Warning");
		notificationBuilder.setContentText("There is a problem on " + tire
				+ " tire!");
		notificationBuilder.setTicker("Warning!!");
		notificationBuilder.setWhen(System.currentTimeMillis());
		notificationBuilder.setSmallIcon(R.drawable.icon_tire);

		Intent notificationIntent = new Intent(this.getApplicationContext(),
				this.getClass()).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
				| Intent.FLAG_ACTIVITY_SINGLE_TOP);
		notificationIntent.putExtra("Tire", tire);
		notificationIntent.putExtra("Tire1", tire1);
		notificationIntent.putExtra("Tire2", tire2);
		notificationIntent.putExtra("Tire3", tire3);
		notificationIntent.putExtra("Tire4", tire4);
		PendingIntent contentIntent = PendingIntent.getActivity(
				this.getApplicationContext(), (int) (Math.random() * 100),
				notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

		notificationBuilder.setContentIntent(contentIntent);

		// Impostiamo il suono, le luci e la vibrazione di default
		// notificationBuilder.setDefaults(Notification.DEFAULT_SOUND |
		// Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
		// System.out.println("sto per mostrare la notifica");

		NotificationManager notificationManager = (NotificationManager) this
				.getApplicationContext().getSystemService(
						this.getApplicationContext().NOTIFICATION_SERVICE);
		Notification notification = notificationBuilder.build();
		notification.flags = Notification.DEFAULT_LIGHTS
				| Notification.FLAG_AUTO_CANCEL;
		notificationManager.notify(0, notification);
		// System.out.println("notifica stampata");

	}

//	public void createNotification2(String string) {
//
//		Intent intent = new Intent(this, MainActivity.class);
//		PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, 0);
//
//		Notification noti = new Notification.Builder(this)
//				.setContentTitle("Warning")
//				.setContentText("There is a problem on " + string + " tire!")
//				.setSmallIcon(R.drawable.icon_tire).setContentIntent(pIntent)
//				.build();
//		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//		// hide the notification after its selected
//		noti.flags |= Notification.FLAG_AUTO_CANCEL;
//		notificationManager.notify(0, noti);
//
//	}

	public void setImageOld(boolean tire1, boolean tire2, boolean tire3,
			boolean tire4) {
		if (tire1 && tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car);
		} else if (!tire1 && tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car1);
		} else if (!tire1 && !tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car12);
		} else if (!tire1 && !tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car123);
		} else if (!tire1 && !tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car1234);
		} else if (!tire1 && !tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car124);
		} else if (!tire1 && tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car13);
		} else if (!tire1 && tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car134);
		} else if (!tire1 && tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car14);
		} else if (tire1 && !tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car2);
		} else if (tire1 && !tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car23);
		} else if (tire1 && !tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car234);
		} else if (tire1 && !tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car24);
		} else if (tire1 && tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car3);
		} else if (tire1 && tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car34);
		} else if (tire1 && tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car4);
		}
	}

	public void setImage(boolean tire1, boolean tire2, boolean tire3,
			boolean tire4) {
		if (!tire1 && !tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car);
		} else if (tire1 && !tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car1);
		} else if (tire1 && tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car12);
		} else if (tire1 && tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car123);
		} else if (tire1 && tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car1234);
		} else if (tire1 && tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car124);
		} else if (tire1 && !tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car13);
		} else if (tire1 && !tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car134);
		} else if (tire1 && !tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car14);
		} else if (!tire1 && tire2 && !tire3 && !tire4) {
			image.setImageResource(R.drawable.car2);
		} else if (!tire1 && tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car23);
		} else if (!tire1 && tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car234);
		} else if (!tire1 && tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car24);
		} else if (!tire1 && !tire2 && tire3 && !tire4) {
			image.setImageResource(R.drawable.car3);
		} else if (!tire1 && !tire2 && tire3 && tire4) {
			image.setImageResource(R.drawable.car34);
		} else if (!tire1 && !tire2 && !tire3 && tire4) {
			image.setImageResource(R.drawable.car4);
		}
	}
}

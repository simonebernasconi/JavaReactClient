package test.javareact;

import test.javareact.common.Consts;
import test.javareact.common.packets.content.Value;
import test.javareact.common.types.reactive.ReactiveBool;
import test.javareact.common.types.reactive.ReactiveFactory;
import test.javareact.common.types.reactive.ReactiveListener;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	ImageView image;
	TextView tv;
	ReactiveBool react1;
	ReactiveBool react2;
	ReactiveBool react3;
	ReactiveBool react4;
	boolean tire1 = true;
	boolean tire2 = true;
	boolean tire3 = true;
	boolean tire4 = true;

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
			react1 = ReactiveFactory.getBool("Tire1.obTire1.get()", true, "");
			react1.addReactiveListener(new Tire(react1, 1));

			react2 = ReactiveFactory.getBool("Tire2.obTire2.get()", true, "");
			react2.addReactiveListener(new Tire(react2, 2));

			react3 = ReactiveFactory.getBool("Tire3.obTire3.get()", true, "");
			react3.addReactiveListener(new Tire(react3, 3));

			react4 = ReactiveFactory.getBool("Tire4.obTire4.get()", true, "");
			react4.addReactiveListener(new Tire(react4, 4));
		}

	}

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
					switch (n) {
					case 1:
						if (reactive.get() == false) {
							tv.setText("WARNING: Problem on Anterior Left Tire!");
							tire1 = false;
							createNotification("Anterior Left");
						} else {
							tire1 = true;
						}
						break;
					case 2:
						if (reactive.get() == false) {
							tv.setText("WARNING: Problem on Anterior Right Tire!");
							tire2 = false;
							createNotification("Anterior Right");
						} else {
							tire2 = true;
						}
						break;
					case 3:
						if (reactive.get() == false) {
							tv.setText("WARNING: Problem on Posterior Left Tire!");
							tire3 = false;
							createNotification("Posterior Left");
						} else {
							tire3 = true;
						}
						break;
					case 4:
						if (reactive.get() == false) {
							tv.setText("WARNING: Problem on Posterior Right Tire!");
							tire4 = false;
							createNotification("Posterior Right");
						} else {
							tire4 = true;
						}
						break;
					}

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
			});
		}

		@Override
		public void notifyReactiveUpdate(Value value) {
			// TODO Auto-generated method stub
		}
	}

	public void createNotification(String string) {
		Notification noti = new Notification.Builder(this)
				.setContentTitle("Warning")
				.setContentText("There is a problem on " + string + " tire!")
				.setSmallIcon(R.drawable.icon_tire).build();
		NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		// hide the notification after its selected
		noti.flags |= Notification.FLAG_AUTO_CANCEL;
		notificationManager.notify(0, noti);

	}
}

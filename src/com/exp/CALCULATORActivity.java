package com.exp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CALCULATORActivity extends Activity {
	double a=0;
	double c=0;
	double b=0;
	double store=0;
	int y=0;
	private static EditText etxt1;
	private static TextView tv;
	private static Button btn1;
	private static Button btnn2;
	private static Button btnnmrc;
	private static Button btnnmem;
	private static Button btnn3;
	private static Button btnn4;
	private static Button btnn5;
	private static Button btnn6;
	private static Button btnn7;
	private static Button btnn8;
	private static Button btnn9;
	private static Button btnn0;
	private static Button btnnpl;
	private static Button btnneq;
	private static Button btnnpo;
	private static Button btnnst;
	private static Button btnndiv;
	private static Button btnnmin;
	private static Button btnncls;
	private final Button.OnClickListener btnDoneOnClick = new Button.OnClickListener() {
		public void onClick(View v) {
		if(v==btn1){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"1");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn2){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"2");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn3){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"3");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn4){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"4");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn5){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"5");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn6){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"6");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn7){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"7");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnnpo){
			String input = etxt1.getText().toString();
			etxt1.setText(input+".");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn8){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"8");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn9){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"9");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnn0){
			String input = etxt1.getText().toString();
			etxt1.setText(input+"0");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnnpl){
			y=1;
			a=Double.parseDouble(etxt1.getText().toString());
			  etxt1.setText("");
				etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnneq){
			 b=Double.parseDouble(etxt1.getText().toString());
			 if(y==1)
		        c=a+b;
			 else if(y==2)
				 c=a-b;
			 else if(y==3)
				 c=a*b;
			 else if(y==4)
				 c=a/b;
			 a=c;
		      etxt1.setText(Double.toString(c));
		}
		else if(v==btnnst){
			y=3;
			 a=Double.parseDouble(etxt1.getText().toString());
			 etxt1.setText("");
				etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnnmin){
			y=2;
			 a=Double.parseDouble(etxt1.getText().toString());
			 etxt1.setText("");
				etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnndiv){
			y=4;
			 a=Double.parseDouble(etxt1.getText().toString());
			 etxt1.setText("");
				etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnncls){
			y=0;
		   etxt1.setText("");
			etxt1.setSelection(etxt1.getText().length());
		}
		else if(v==btnnmem){
			tv.setText(tv.getText()+"M+");
			store=Double.parseDouble(etxt1.getText().toString());
			y=0;
		   etxt1.setText("");
			etxt1.setSelection(etxt1.getText().length());
		
		}
		else if(v==btnnmrc){
			tv.setText("BOSE.");
			  etxt1.setText(Double.toString(store));
				store=0;
				etxt1.setSelection(etxt1.getText().length());
		}
		}
		};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    	//Get pointers to the Views defined in main.xml
    	etxt1 = (EditText) findViewById(R.id.eTxtDemo);
    	    	btn1 = (Button) findViewById(R.id.btnDone);
    	    	btnn2 = (Button) findViewById(R.id.btn2);
    	    	btnn3 = (Button) findViewById(R.id.btn3);
    	    	btnn4 = (Button) findViewById(R.id.btn4);
    	    	btnn5 = (Button) findViewById(R.id.btn5);
    	    	btnn6 = (Button) findViewById(R.id.btn6);
    	    	btnn7 = (Button) findViewById(R.id.btn7);
    	    	btnn8 = (Button) findViewById(R.id.btn8);
    	    	btnn9 = (Button) findViewById(R.id.btn9);
    	    	btnn0 = (Button) findViewById(R.id.btn0);
    	    	btnnpl = (Button) findViewById(R.id.btnpl);
    	    	btnneq = (Button) findViewById(R.id.btneq);
    	    	btnnpo = (Button) findViewById(R.id.btnpo);
    	    	btnnst = (Button) findViewById(R.id.btnst);
    	    	btnndiv = (Button) findViewById(R.id.btndiv);
    	    	btnncls = (Button) findViewById(R.id.btncls);
    	    	btnnmin = (Button) findViewById(R.id.btnmin);
    	    	btnnmrc = (Button) findViewById(R.id.btnmrc);
    	    	btnnmem = (Button) findViewById(R.id.btnmem);
    	    	tv=(TextView) findViewById(R.id.tvw1);
    	//Set the string displayed in TextView1
    	//Set the OnClickListener for the Done button
    	btn1.setOnClickListener(btnDoneOnClick);
    	btnn9.setOnClickListener(btnDoneOnClick);
    	btnn8.setOnClickListener(btnDoneOnClick);
    	btnn7.setOnClickListener(btnDoneOnClick);
    	btnn6.setOnClickListener(btnDoneOnClick);
    	btnn5.setOnClickListener(btnDoneOnClick);
    	btnn4.setOnClickListener(btnDoneOnClick);
    	btnn3.setOnClickListener(btnDoneOnClick);
    	btnn2.setOnClickListener(btnDoneOnClick);
    	btnn0.setOnClickListener(btnDoneOnClick);
    	btnnpl.setOnClickListener(btnDoneOnClick);
    	btnneq.setOnClickListener(btnDoneOnClick);
    	btnnpo.setOnClickListener(btnDoneOnClick);
    	btnnst.setOnClickListener(btnDoneOnClick);
    	btnndiv.setOnClickListener(btnDoneOnClick);
    	btnncls.setOnClickListener(btnDoneOnClick);
    	btnnmin.setOnClickListener(btnDoneOnClick);
    	btnnmrc.setOnClickListener(btnDoneOnClick);
    	btnnmem.setOnClickListener(btnDoneOnClick);
    }

	
}
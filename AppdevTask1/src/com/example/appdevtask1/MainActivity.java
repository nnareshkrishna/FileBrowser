package com.example.appdevtask1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button btn1,btn2,btn3 ;
	TextView txt1,txt2 ;
	EditText edt ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn1=(Button)findViewById(R.id.button1) ;
		btn2=(Button)findViewById(R.id.button2) ;
		btn3=(Button)findViewById(R.id.button3) ;
		txt1=(TextView)findViewById(R.id.textView1) ;
		txt2=(TextView)findViewById(R.id.textView2) ;
		edt=(EditText)findViewById(R.id.editText1) ;
		btn1.setOnClickListener(this) ;
		btn2.setOnClickListener(this) ;
		btn3.setOnClickListener(this) ;
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
		switch(arg0.getId())
		{
		case R.id.button1:
			String str ;
			str=edt.getText().toString() ;
			txt1.setText(str) ;
			break ;
		case R.id.button2:
			String str1 ;
			str1=edt.getText().toString();
			char a[]=str1.toCharArray();
			int i=0;
			char temp ;
			int t=0 ;
			t=a.length ;
			int l=0 ;
			l=(int)Math.ceil(Math.random()*t) ;
			if(l<(t-1))
			{
				l+=1 ;
			}
			while(l>1)
			{
				temp=a[l-1] ;
				a[l-1]=a[l-2] ;
				a[l-2]=temp ;
				l-- ;
			}
			t=(t/2) ;
			for(i=0; i<=t; i++)
			{
				temp=a[i] ;
				a[i]=a[t-i] ;
				a[t-i]=temp ;
			}
			String srt=new String(a) ;
			txt2.setText(srt) ;
			i=0 ;
			l=0; t=0;
			break ;
		case R.id.button3:
			String str3, str2 ;
			str2="Input String" ;
			str3="Random String" ;
			txt1.setText(str2) ;
			txt2.setText(str3) ;
			String str4=null ;
			edt.setText(str4) ;
			break ;
		}
		
	}
}

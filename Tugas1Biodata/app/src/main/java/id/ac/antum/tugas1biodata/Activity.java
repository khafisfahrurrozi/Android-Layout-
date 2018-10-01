package id.ac.antum.tugas1biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
    }
    public void openalamat(View v){
        Uri uri = Uri.parse("geo:-6.980997, 110.407690?q="+ Uri.encode("Kos Nakula 1"));
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }
    public void opentelp(View v){
        TextView Phone = (TextView) findViewById(R.id.Phone);
        String phone =Phone.getText().toString();

        Uri uri = Uri.parse("tel:"+phone);
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }
    public void klikemail(View v){
        TextView email =(TextView) findViewById(R.id.email);
        String Email = email.getText().toString();

        Intent intent =new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,Email);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Android Layout");
        intent.putExtra(Intent.EXTRA_TEXT,"Sedang Belajar Android");
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an App"));
    }

}

package com.example.ericliu.playdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ericliu.playdagger2.repository.DBRepository;
import com.example.ericliu.playdagger2.repository.RemoteRepository;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    DBRepository dbRepository;

    @Inject
    RemoteRepository remoteRepository;

    private TextView tvMain, tvSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponents.INSTANCE.getComponent().inject(this);

        tvMain = (TextView) findViewById(R.id.tvMain);
        tvSecond = (TextView) findViewById(R.id.tvSecond);

        String msg = dbRepository.getData();

        tvMain.setText(msg);

        String remoteMsg = remoteRepository.getData();

        tvSecond.setText(remoteMsg);

    }
}

package com.als.ado.crushonu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import socket.Connection

class MainActivity : AppCompatActivity() {
    var connect = Connection.getConnection();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        connect.connect();

    }
}

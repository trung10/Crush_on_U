package socket;

import android.util.Log;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;

public class Connection {

    private static Connection instance;
    private Socket mSocket;

    private Connection(){
        try {
            mSocket = IO.socket("http://192.168.1.17:3000");

        }catch (URISyntaxException e){
            Log.e("ss", "Connection: " + e);
        }
    }

    public static Connection getConnection(){
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    public void connect(){
        mSocket.connect();
    }
}

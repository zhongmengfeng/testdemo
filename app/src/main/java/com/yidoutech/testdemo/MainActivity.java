package com.yidoutech.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    private String str= "123456";
    String publicKey = "";
    String privateKey = "";
    String ss ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("lenth",ss.length()+"");
        try {
            //用公钥加密
            byte[] keyBytes = Base64.decode(publicKey,0);
            byte[] encrypt = RSAUtils.encryptByPublicKey(str.getBytes(), keyBytes);
            String encode = Base64Util.encode(encrypt);
            Log.d("TAG", "加密后的数据：" + encrypt.length);
            Log.d("TAG", "加密后的数据：" + encode);

            //用私钥解密
            byte[] privateKey2 = Base64.decode(privateKey,0);
            byte[] decrypt = RSAUtils.decryptByPrivateKey(encrypt, privateKey2);
            Log.d("TAG", "解密后的数据：" + new String(decrypt, "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

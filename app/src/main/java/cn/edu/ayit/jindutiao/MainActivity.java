package cn.edu.ayit.jindutiao;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void click3(View v) {
           final ProgressDialog dialog=new ProgressDialog(this);
            dialog.setTitle("加载中");


            dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            //最后一步一定show出来
            dialog.show();
            new Thread(){public void run(){
                //设置进度最大值
                dialog.setMax(100);
                //设置当前进度
                for(int i=0;i<=100;i++){
                    dialog.setProgress(i);
                    SystemClock.sleep(50);
                }
                dialog.dismiss();
            }

            }.start();


        }
}

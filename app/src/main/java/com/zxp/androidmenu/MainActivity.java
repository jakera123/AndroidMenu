package com.zxp.androidmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_menu=(TextView)findViewById(R.id.tv_menu);
        registerForContextMenu(tv_menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater=new MenuInflater(this);
        inflater.inflate(R.menu.contextmenu,menu);
        menu.setHeaderIcon(R.drawable.umeng_socialize_laiwang_dynamic);
        menu.setHeaderTitle("请选择文字颜色：");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.color1:
                tv_menu.setTextColor(Color.RED);
                break;
            case R.id.color2:
                tv_menu.setTextColor(Color.GREEN);
                break;
            case R.id.color3:
                tv_menu.setTextColor(Color.BLUE);
                break;
            case R.id.color4:
                tv_menu.setTextColor(Color.YELLOW);
                break;
            default:
                tv_menu.setTextColor(Color.BLACK);
        }
        return true;
    }
}

package com.yl.demo.fcm.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import com.yl.demo.fcm.R;

/**
 * Created by Yee Lynn on 7/10/2016
 */
public abstract class MyBaseNaviMenuActivity extends MyBaseActivity {

    private DrawerLayout dl_drawerNavi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar tb_appbar = (Toolbar) findViewById(R.id.tb_appbar);
        setSupportActionBar(tb_appbar);

        dl_drawerNavi = (DrawerLayout) findViewById(R.id.dl_drawerNavi);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, dl_drawerNavi, tb_appbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();
    }

    public void setCurrentTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
}

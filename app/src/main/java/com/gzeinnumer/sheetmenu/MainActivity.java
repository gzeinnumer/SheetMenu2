package com.gzeinnumer.sheetmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import ru.whalemare.sheetmenu.SheetMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show(View view) {
        showMenu();
    }

    private void showMenu() {
        SheetMenu.with(this)
                .setTitle("Select option")
                .setMenu(R.menu.menu)
                .setClick(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId() == R.id.action_call)
                            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        else if(item.getItemId() == R.id.action_block)
                            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                }).show();
    }
}

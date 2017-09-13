package patrickstar.com.menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.show);
        registerForContextMenu(tv);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuinfo){
        MenuInflater inflator=new MenuInflater(this);
        inflator.inflate(R.menu.contextmenu,menu);
        menu.setHeaderIcon(R.drawable.ic_launcher);
        menu.setHeaderTitle("请选择文字颜色:");
    }
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.color1:
                tv.setTextColor(Color.rgb(255,0,0));
                break;
            case R.id.color2:
                tv.setTextColor(Color.rgb(0,255,0));
                break;
            case R.id.color3:
                tv.setTextColor(Color.rgb(0,0,255));
                break;
            case R.id.color4:
                tv.setTextColor(Color.rgb(255,180,0));
                break;
            default:tv.setTextColor(Color.rgb(255,255,255));
        }
        return true;
    }
}

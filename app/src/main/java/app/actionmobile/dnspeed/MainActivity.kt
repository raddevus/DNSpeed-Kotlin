package app.actionmobile.dnspeed

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
//import android.R
import android.text.method.TextKeyListener.clear
import android.util.Log


class MainActivity : AppCompatActivity() {
    var adapter: EntryAdapter? = null
    var entryList: MutableList<Entry> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val EntryViewRecyclerView = findViewById(R.id.entryRecyclerView) as RecyclerView
        val manager = LinearLayoutManager(this.baseContext)
        EntryViewRecyclerView.layoutManager = manager
        entryList.add(Entry(5,"test"));
        entryList.add(Entry(2,"garbage "));
        entryList.add(Entry(3,"more"));

        adapter = EntryAdapter(entryList)
        //adapter.allEntries.add(Entry(1,"test"));
        EntryViewRecyclerView.setAdapter(adapter);
        //getAllEntries(EntryViewRecyclerView)
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

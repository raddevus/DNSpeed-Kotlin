package app.actionmobile.dnspeed

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
//import android.R
import android.view.LayoutInflater

class EntryAdapter : RecyclerView.Adapter<EntryAdapter.ViewHolder> {
    override fun getItemCount(): Int {
        return allEntries.size
    }
    constructor(entryList: MutableList<Entry>){
        allEntries = entryList;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (!allEntries.get(position).title.equals("")){
            holder.entryTextView.setText(allEntries.get(position).title);
        }
        else {
            holder.entryTextView.setText(allEntries.get(position).id);
        }
        holder.entryTextView.setTag(allEntries.get(position).id);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false)
        return ViewHolder(view);

    }

    var allEntries: MutableList<Entry> = mutableListOf<Entry>();

    constructor() {
        allEntries.add(0,Entry(5,"tsst"))
    }

    public fun EntryAdapter( entryList : MutableList<Entry>)
    {
        allEntries = entryList
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var entryTextView : TextView  = itemView.findViewById (R.id.entryIdTextView) as TextView

    }
}
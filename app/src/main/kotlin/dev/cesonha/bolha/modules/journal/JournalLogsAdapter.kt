package dev.cesonha.bolha.modules.journal

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import dev.cesonha.bolha.R
import dev.cesonha.bolha.models.JournalLog

class JournalLogsAdapter : RecyclerView.Adapter<JournalLogViewHolder>() {

    private val journalLogs: MutableList<JournalLog> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JournalLogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_journal_log, parent, false)
        return JournalLogViewHolder(view)
    }

    override fun onBindViewHolder(holder: JournalLogViewHolder, position: Int) {
        holder.bind(journalLogs[position])
    }

    fun addItems(journalLogs: List<JournalLog>) {
        this.journalLogs.addAll(journalLogs)
        notifyDataSetChanged()
    }

    fun clear() {
        this.journalLogs.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return journalLogs.size
    }

}
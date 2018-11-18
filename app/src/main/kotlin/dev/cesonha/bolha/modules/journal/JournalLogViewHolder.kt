package dev.cesonha.bolha.modules.journal

import android.view.View
import dev.cesonha.bolha.common.BaseViewHolder
import dev.cesonha.bolha.models.JournalLog
import kotlinx.android.synthetic.main.item_journal_log.view.*

class JournalLogViewHolder : BaseViewHolder<JournalLog> {

    constructor(itemView: View): super(itemView)

    override fun bind(journalLog: JournalLog) {
        itemView.moodStatusTextView.text = journalLog.moodStatus
        itemView.createdAtTextView.text = journalLog.createdAt
    }
}
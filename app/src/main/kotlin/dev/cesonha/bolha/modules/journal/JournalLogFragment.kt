package dev.cesonha.bolha.modules.journal

import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.cesonha.bolha.R
import dev.cesonha.bolha.common.BaseFragment
import dev.cesonha.bolha.mocks.JournalLogMocks
import kotlinx.android.synthetic.main.fragment_journal.*

class JournalLogFragment : BaseFragment() {

    private val adapter : JournalLogsAdapter = JournalLogsAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_journal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        logsRecyclerView.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        logsRecyclerView.adapter = adapter
        adapter.addItems(JournalLogMocks.getJournalLogs())
    }

}
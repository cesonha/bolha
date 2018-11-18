package dev.cesonha.bolha.modules.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import dev.cesonha.bolha.R
import dev.cesonha.bolha.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_feed.*

class FeedFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabNewLog.setOnClickListener {
            Toast.makeText(context, "Testando FAB", Toast.LENGTH_SHORT).show()
        }
    }

}
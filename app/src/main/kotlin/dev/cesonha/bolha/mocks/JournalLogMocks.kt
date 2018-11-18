package dev.cesonha.bolha.mocks

import dev.cesonha.bolha.models.JournalLog

class JournalLogMocks {

    companion object Factory {
        fun getJournalLogs(): List<JournalLog> {
            val journalLogs = mutableListOf<JournalLog>()
            for (i in 1..3) {
               journalLogs.add(JournalLog("Bem humorado", "hoje"))
           }
            return journalLogs
        }
    }
}
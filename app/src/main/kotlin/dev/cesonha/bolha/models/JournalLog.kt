package dev.cesonha.bolha.models

class JournalLog() {

    var moodStatus : String = ""
    var createdAt : String = ""

    constructor(moodStatus : String, createdAt : String) : this() {
        this.moodStatus = moodStatus
        this.createdAt = createdAt
    }

}
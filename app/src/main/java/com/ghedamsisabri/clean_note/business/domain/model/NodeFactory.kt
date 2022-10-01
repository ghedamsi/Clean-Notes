package com.ghedamsisabri.clean_note.business.domain.model

import android.icu.text.CaseMap
import com.ghedamsisabri.clean_note.business.domain.util.DateUtil
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NodeFactory
@Inject
constructor(
    private val dateUtil: DateUtil
)
{
    fun createSingleNote(
        id:String?=null,
        title: String,
        body:String?=null
    ):Note{
        return Note(
            id=id?:UUID.randomUUID().toString(),
            title=title,
            body=body?:"",
            created_at = dateUtil.getCurrentTimestamp(),
            updated_at = dateUtil.getCurrentTimestamp()
        )
    }

    fun createNoteList(numNotes: Int):List<Note>{
        val list= mutableListOf<Note>()
        for (idx in 0 until numNotes)
            list.add(
                createSingleNote(
                    id=null,
                            title=UUID.randomUUID().toString(),
                    body=UUID.randomUUID().toString()
                )
            )

        return list
    }
}
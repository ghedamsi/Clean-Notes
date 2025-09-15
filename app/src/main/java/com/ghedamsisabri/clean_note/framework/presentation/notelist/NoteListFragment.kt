package com.ghedamsisabri.clean_note.framework.presentation.notelist
import android.os.Bundle
import android.view.*
import com.ghedamsisabri.clean_note.R
import com.ghedamsisabri.clean_note.framework.presentation.common.BaseNoteFragment


const val NOTE_LIST_STATE_BUNDLE_KEY = "com.ghedamsisabri.clean_note.framework.presentation.notelist.state"

class NoteListFragment : BaseNoteFragment(R.layout.fragment_note_list)
{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun inject() {
        TODO("prepare dagger")
    }

}

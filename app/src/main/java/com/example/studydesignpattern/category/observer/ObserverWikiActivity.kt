package com.example.studydesignpattern.category.observer

import android.os.Bundle
import android.util.Log
import com.example.studydesignpattern.BaseActivity
import com.example.studydesignpattern.R
import com.example.studydesignpattern.databinding.ActivityWikiObserverBinding

class ObserverWikiActivity :
    BaseActivity<ActivityWikiObserverBinding>(R.layout.activity_wiki_observer) {

    private val wikiObserverA: WikiObserver = WikiObserverA()
    private val wikiObserverB: WikiObserver = WikiObserverB()

    private val wikiSubject by lazy { WikiSubject() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        wikiSubject.registerObserver(wikiObserverA)
        wikiSubject.registerObserver(wikiObserverB)

        wikiSubject.notifyObservers()

    }
}


interface WikiObserver {
    fun update()
}

class WikiSubject {

    private val observerList = mutableListOf<WikiObserver>()

    fun registerObserver(wikiObserver: WikiObserver) {
        observerList.add(wikiObserver)
    }

    fun unregisterObserver(wikiObserver: WikiObserver) {
        observerList.remove(wikiObserver)
    }

    fun notifyObservers() {
        observerList.forEach { wikiObserver ->
            wikiObserver.update()
        }
    }

}

class WikiObserverA : WikiObserver {
    override fun update() {
        Log.d("결과", "WikiObserverA Update")
    }
}

class WikiObserverB : WikiObserver {
    override fun update() {
        Log.d("결과", "WikiObserverB Update")
    }
}
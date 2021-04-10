package com.example.studydesignpattern.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.studydesignpattern.R

class PracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)

        val redPen: Pen = HaveRedPen()
        redPen.drawing()

        val examProtoType = ExamProtoType()
        val cloneProtoType = examProtoType.clone()

        val tree: Tree = DecorateStar(DecorateBall(SimpleTree()))
        Log.d("결과", tree.getDescription())
    }
}



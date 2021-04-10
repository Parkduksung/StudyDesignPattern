package com.example.studydesignpattern.practice

import android.util.Log


class ExamProtoType : Cloneable {
    public override fun clone(): ExamProtoType {
        Log.d("결과", "cloneExamProtoType")
        return super.clone() as ExamProtoType
    }
}
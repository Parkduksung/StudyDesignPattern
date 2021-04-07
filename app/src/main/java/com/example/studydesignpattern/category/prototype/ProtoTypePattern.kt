package com.example.studydesignpattern.category.prototype

import android.util.Log

class ProtoTypePattern : Cloneable {

    public override fun clone(): ProtoTypePattern {
        Log.d("결과", "cloneProtoTypePattern")
        print("cloneProtoTypePattern")
        return super.clone() as ProtoTypePattern
    }
}






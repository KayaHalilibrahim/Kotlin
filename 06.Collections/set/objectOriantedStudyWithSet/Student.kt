package com.hkaya.collections.set.objectOriantedStudyWithSet

class Student (var studentNo:Int,var studentName:String,var studentClass:String){

    override fun hashCode(): Int {
        return this.studentNo
    }

    override fun equals(other: Any?): Boolean {
        if(this.studentNo== (other as Student).studentNo){
            return true
        }
        return false
    }

}
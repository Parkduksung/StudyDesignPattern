package com.example.studydesignpattern.category.visitor

import android.util.Log

class VisitorPattern {
}


interface ReportVisitable {
    fun <R> accept(visitor: ReportVisitor<R>): R
}

interface ReportVisitor<out R> {
    fun visit(contract: FixedPriceContract): R
    fun visit(contract: TimeAndMaterialsContract): R
    fun visit(contract: SupportContract): R
}

class FixedPriceContract(val costPerYear: Long) : ReportVisitable {
    override fun <R> accept(visitor: ReportVisitor<R>): R =
        visitor.visit(this)
}


class TimeAndMaterialsContract(val costPerYear: Long, val hours: Long) : ReportVisitable {
    override fun <R> accept(visitor: ReportVisitor<R>): R =
        visitor.visit(this)
}


class SupportContract(val costPerMonth: Long) : ReportVisitable {
    override fun <R> accept(visitor: ReportVisitor<R>): R =
        visitor.visit(this)
}


class MonthlyCostReportVisitor : ReportVisitor<Long> {

    override fun visit(contract: FixedPriceContract): Long {
        return contract.costPerYear / 12
    }

    override fun visit(contract: TimeAndMaterialsContract): Long {
        return contract.costPerYear * contract.hours
    }

    override fun visit(contract: SupportContract): Long {
        return contract.costPerMonth
    }
}

class YearlyReportVisitor : ReportVisitor<Long> {
    override fun visit(contract: FixedPriceContract): Long {
        return contract.costPerYear
    }

    override fun visit(contract: TimeAndMaterialsContract): Long {
        return contract.costPerYear * contract.hours
    }

    override fun visit(contract: SupportContract): Long {
        return contract.costPerMonth * 12
    }
}
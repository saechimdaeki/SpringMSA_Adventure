package com.food.ordering.system.domain.valueobject

import java.math.BigDecimal
import java.math.RoundingMode


class Money(val amount: BigDecimal) {


    fun isGreaterThanZero(): Boolean {
        return this.amount > BigDecimal.ZERO
    }

    fun isGreaterThan(money: Money): Boolean {
        return this.amount > money.amount
    }

    fun add(money: Money): Money {
        return Money(setScale(this.amount.add(money.amount)))
    }

    fun subtract(money: Money): Money {
        return Money(setScale(this.amount.subtract(money.amount)))
    }

    fun multiply(multiplier : Int) : Money {
        return Money(setScale(this.amount.multiply(BigDecimal(multiplier))))
    }

    private fun setScale(input: BigDecimal): BigDecimal {
        return input.setScale(2, RoundingMode.HALF_UP)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Money

        return amount == other.amount
    }

    override fun hashCode(): Int {
        return amount.hashCode()
    }
}
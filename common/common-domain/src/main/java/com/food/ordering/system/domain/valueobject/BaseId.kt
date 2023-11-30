package com.food.ordering.system.domain.valueobject

import java.util.*


abstract class BaseId<T> protected constructor(val value: T) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val baseId = o as BaseId<*>
        return value == baseId.value
    }

    override fun hashCode(): Int {
        return Objects.hash(value)
    }
}

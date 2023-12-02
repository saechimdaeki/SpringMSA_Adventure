package order.service.domain.entity

import com.food.ordering.system.domain.entity.BaseEntity
import com.food.ordering.system.domain.valueobject.Money
import com.food.ordering.system.domain.valueobject.OrderId
import order.service.domain.valuobject.OrderitemId


class OrderItem private constructor(builder: Builder) : BaseEntity<OrderitemId?>() {
    private val orderId: OrderId? = null
    private val product: Product?
    private val quantity: Int
    private val price: Money?
    private val subTotal: Money?

    init {
        super.id = builder.orderitemId
        product = builder.product
        quantity = builder.quantity
        price = builder.price
        subTotal = builder.subTotal
    }

    class Builder private constructor() {
        var orderitemId: OrderitemId? = null
        var product: Product? = null
        var quantity = 0
        var price: Money? = null
        var subTotal: Money? = null
        fun id(`val`: OrderitemId?): Builder {
            orderitemId = `val`
            return this
        }

        fun product(`val`: Product?): Builder {
            product = `val`
            return this
        }

        fun quantity(`val`: Int): Builder {
            quantity = `val`
            return this
        }

        fun price(`val`: Money?): Builder {
            price = `val`
            return this
        }

        fun subTotal(`val`: Money?): Builder {
            subTotal = `val`
            return this
        }

        fun build(): OrderItem {
            return OrderItem(this)
        }

        companion object {
            fun builder(): Builder {
                return Builder()
            }
        }
    }
}
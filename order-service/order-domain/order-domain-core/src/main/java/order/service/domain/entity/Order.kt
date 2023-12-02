package order.service.domain.entity

import com.food.ordering.system.domain.entity.AggregateRoot
import com.food.ordering.system.domain.valueobject.*
import order.service.domain.valuobject.StreetAddress
import order.service.domain.valuobject.TrackingId


class Order private constructor(builder: Builder) : AggregateRoot<OrderId?>() {
    private val customerId: CustomerId?
    private val restaurantId: RestaurantId?
    private val deliveryAddress: StreetAddress?
    private val price: Money?
    private val items: List<OrderItem>?
    private val trackingId: TrackingId?
    private val orderStatus: OrderStatus?
    private val failureMessages: List<String>?

    init {
        super.id = builder.orderId
        customerId = builder.customerId
        restaurantId = builder.restaurantId
        deliveryAddress = builder.deliveryAddress
        price = builder.price
        items = builder.items
        trackingId = builder.trackingId
        orderStatus = builder.orderStatus
        failureMessages = builder.failureMessages
    }

    class Builder private constructor() {
        var orderId: OrderId? = null
        var customerId: CustomerId? = null
        var restaurantId: RestaurantId? = null
        var deliveryAddress: StreetAddress? = null
        var price: Money? = null
        var items: List<OrderItem>? = null
        var trackingId: TrackingId? = null
        var orderStatus: OrderStatus? = null
        var failureMessages: List<String>? = null
        fun id(`val`: OrderId?): Builder {
            orderId = `val`
            return this
        }

        fun customerId(`val`: CustomerId?): Builder {
            customerId = `val`
            return this
        }

        fun restaurantId(`val`: RestaurantId?): Builder {
            restaurantId = `val`
            return this
        }

        fun deliveryAddress(`val`: StreetAddress?): Builder {
            deliveryAddress = `val`
            return this
        }

        fun price(`val`: Money?): Builder {
            price = `val`
            return this
        }

        fun items(`val`: List<OrderItem>?): Builder {
            items = `val`
            return this
        }

        fun trackingId(`val`: TrackingId?): Builder {
            trackingId = `val`
            return this
        }

        fun orderStatus(`val`: OrderStatus?): Builder {
            orderStatus = `val`
            return this
        }

        fun failureMessages(`val`: List<String>?): Builder {
            failureMessages = `val`
            return this
        }

        fun build(): Order {
            return Order(this)
        }

        companion object {
            fun builder(): Builder {
                return Builder()
            }
        }
    }
}

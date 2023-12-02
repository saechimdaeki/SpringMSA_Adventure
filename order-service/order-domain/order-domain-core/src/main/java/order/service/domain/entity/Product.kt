package order.service.domain.entity

import com.food.ordering.system.domain.entity.BaseEntity
import com.food.ordering.system.domain.valueobject.Money
import com.food.ordering.system.domain.valueobject.ProductId


class Product(productId: ProductId?, name: String, price: Money) : BaseEntity<ProductId?>() {
    private val name: String
    private val price: Money

    init {
        super.id = productId
        this.name = name
        this.price = price
    }
}

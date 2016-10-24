package lt.markmerkk.mock_app.mvp

import lt.markmerkk.mock_app.networking.entities.Product

/**
 * @author mariusmerkevicius
 * @since 2016-10-24
 */
interface ProductsView {
    fun showProgress()
    fun hideProgress()
    fun showProducts(products: List<Product>)
    fun appendProducts(additionalProducts: List<Product>)
    fun showEmptyState()
    fun showError(error: Throwable)
}
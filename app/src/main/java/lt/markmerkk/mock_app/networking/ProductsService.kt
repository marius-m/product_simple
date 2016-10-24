package lt.markmerkk.mock_app.networking

import lt.markmerkk.mock_app.networking.entities.Product
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

/**
 * @author mariusmerkevicius
 * @since 2016-10-24
 */
interface ProductsService {
    @GET("products.php")
    fun products(@Query("page") page: Int): Observable<List<Product>>
}
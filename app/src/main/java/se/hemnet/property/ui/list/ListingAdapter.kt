package se.hemnet.property.ui.list

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import se.hemnet.property.R
import se.hemnet.property.extensions.inflate
import se.hemnet.property.model.Listing

/**
 * Adapter for [listings][Listing]
 *
 * @param listings List of [listings][Listing] to be handled by the adapter.
 * */
class ListingAdapter(private val listings: List<Listing>) : RecyclerView.Adapter<ListingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = with(parent) {
        ListingViewHolder(inflate(R.layout.listing_item)) {
            //context.startActivity()
        }
    }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) = holder.bind(listings[position])

    override fun getItemCount() = listings.size
}
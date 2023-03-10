package com.gateway.gbot.adapter

import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.widget.LinearLayout
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.gateway.gbot.ChatItemClass
import com.gateway.gbot.R

class AdapterChat     // public constructor for this class
    (private val chatItemClassList: List<ChatItemClass>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // Override the getItemViewType method.
    // This method uses a switch statement
    // to assign the layout to each item
    // depending on the viewType passed

    override fun getItemViewType(position: Int): Int {
        return when (chatItemClassList[position].viewType) {
//            0 -> ChatItemClass.LayoutOne
            1 -> ChatItemClass.LayoutTwo
            2 -> ChatItemClass.LayoutFirstBotMessage
            3 -> ChatItemClass.LayoutFour
            4 -> ChatItemClass.LayoutFive
            5 -> ChatItemClass.LayoutSix
            6 -> ChatItemClass.LayoutFlight
            7 -> ChatItemClass.LayoutDomesticFlight
            8 -> ChatItemClass.LayoutRoundTrip
            9 -> ChatItemClass.LayoutAccomodation
            10 -> ChatItemClass.LayoutMap
            else -> -1
        }
    }


    // similarly a class for the  layout is also
    // created.
    internal inner class LayoutTwoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val text_one: TextView
        private val text_two: TextView
        val linearLayout: LinearLayout


        init {

            text_one = itemView.findViewById(R.id.text_one)
            text_two = itemView.findViewById(R.id.text_two)
            linearLayout = itemView.findViewById(R.id.itemCbBookingTypeLl)
        }

        fun setViews(
            textOne: String?,
            textTwo: String?,
        ) {

            text_one.text = textOne
            text_two.text = textTwo
        }
    }

    internal inner class LayoutThreeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.textthree)
            linearLayout = itemView.findViewById(R.id.itemCbMessageLlMain)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewe(textthree: String?) {
            textview.text = textthree
        }
    }


    internal inner class LayoutFourViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.textfour)
            linearLayout = itemView.findViewById(R.id.itemCbPrerequisiteslistLl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewFour(textfour: String?) {
            textview.text = textfour
        }
    }


    internal inner class LayoutFiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.btn_one_way)
            linearLayout = itemView.findViewById(R.id.itemCbTripTypeLl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewFive(textfive: String?) {
            textview.text = textfive
        }
    }

    internal inner class LayoutSixViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val constraintLayout: ConstraintLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.text_from_oneway)
            constraintLayout = itemView.findViewById(R.id.itemCbTripOptionOneWayCl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewSix(text_from_oneway: String?) {
            textview.text = text_from_oneway
        }
    }

    internal inner class LayoutFlightViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.btn_international_flight)
            linearLayout = itemView.findViewById(R.id.itemCbTripOptionInternationalLl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewFlight(btn_international_flight: String?) {
            textview.text = btn_international_flight
        }
    }


    internal inner class LayoutDomesticFlightViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.btn_domestic_flight)
            linearLayout = itemView.findViewById(R.id.itemCbTripOptionDomesticLl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewDomesticFlight(btn_domestic_flight: String?) {
            textview.text = btn_domestic_flight
        }
    }


    internal inner class LayoutRoundTripViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val constraintLayout: ConstraintLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.text_from_roundtrip)
            constraintLayout = itemView.findViewById(R.id.itemCbTripOptionRoundTripCl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewRoundTrip(text_from_roundtrip: String?) {
            textview.text = text_from_roundtrip
        }
    }

    internal inner class LayoutAccomodationViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.text_yes_for_accommodation)
            linearLayout = itemView.findViewById(R.id.itemCbAccommodationOptionLl)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewAccomodation(text_yes_for_accommodation: String?) {
            textview.text = text_yes_for_accommodation
        }
    }


    internal inner class LayoutMapViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textview: TextView
        val linearLayout: LinearLayout

        init {

            // Find the Views
            textview = itemView.findViewById(R.id.textMap)
            linearLayout = itemView.findViewById(R.id.itemCbMap)
        }

        // method to set the views that will
        // be used further in onBindViewHolder method.
        fun setViewMap(textMap: String?) {
            textview.text = textMap
        }
    }

    // In the onCreateViewHolder, inflate the
    // xml layout as per the viewType.
    // This method returns either of the
    // ViewHolder classes defined above,
    // depending upon the layout passed as a parameter.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
//            ChatItemClass.LayoutOne -> {
//                val layoutOne =
//                    LayoutInflater.from(parent.context)
//                        .inflate(R.layout.item_greeting_chatbot, parent, false)
//                LayoutOneViewHolder(layoutOne)
//
//            }
            ChatItemClass.LayoutTwo -> {
                val layoutTwo =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_booking_type_chatbot, parent, false)
                LayoutTwoViewHolder(layoutTwo)
            }
            ChatItemClass.LayoutFirstBotMessage -> {
                val layoutThree =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_chatbot_message, parent, false)
                LayoutThreeViewHolder(layoutThree)
            }

            ChatItemClass.LayoutFour -> {
                val layoutFour =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_prerequisites_list_chatbot, parent, false)
                LayoutFourViewHolder(layoutFour)
            }
            ChatItemClass.LayoutFive -> {
                val layoutFive =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_trip_option_chatbot, parent, false)
                LayoutFiveViewHolder(layoutFive)
            }
            ChatItemClass.LayoutSix -> {
                val layoutSix =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_trip_option_one_way_chatbot, parent, false)
                LayoutSixViewHolder(layoutSix)
            }
            ChatItemClass.LayoutFlight -> {
                val layoutFlight =
                    LayoutInflater.from(parent.context)
                        .inflate(
                            R.layout.item_travelling_option_international_chatbot,
                            parent,
                            false
                        )
                LayoutFlightViewHolder(layoutFlight)
            }
            ChatItemClass.LayoutDomesticFlight -> {
                val layoutDomesticFlight =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_travelling_option_domestic_chatbot, parent, false)
                LayoutDomesticFlightViewHolder(layoutDomesticFlight)
            }
            ChatItemClass.LayoutRoundTrip -> {
                val layoutRoundTrip =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_roundtrip_option_chatbot, parent, false)
                LayoutRoundTripViewHolder(layoutRoundTrip)
            }


            ChatItemClass.LayoutAccomodation -> {
                val layoutAccomodation =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_accomodation_option_chatbot, parent, false)
                LayoutAccomodationViewHolder(layoutAccomodation)
            }


            ChatItemClass.LayoutMap -> {
                val layoutMap =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_map_chatbot, parent, false)
                LayoutMapViewHolder(layoutMap)
            }
//
            else -> {

                val layoutTwo =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_booking_type_chatbot, parent, false)
                LayoutTwoViewHolder(layoutTwo)
            }

        }
    }

    // In onBindViewHolder, set the Views for each element
    // of the layout using the methods defined in the
    // respective ViewHolder classes.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (chatItemClassList[position].viewType) {
//            ChatItemClass.LayoutOne -> {
//                val text = chatItemClassList[position].text
//                (holder as LayoutOneViewHolder).setView(text)
//
//                // The following code pops a toast message
//                // when the item layout is clicked.
//                // This message indicates the corresponding
//                // layout.
//                holder.linearLayout.setOnClickListener { view ->
//                    Toast.makeText(view.context, "Hello from Layout One!", Toast.LENGTH_SHORT)
//                        .show()
//
//
//                }
//            }
            ChatItemClass.LayoutTwo -> {
                val text_one = chatItemClassList[position].text_one
                val text_two = chatItemClassList[position].text_two
                (holder as LayoutTwoViewHolder).setViews(text_one, text_two)
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Two!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
            ChatItemClass.LayoutFirstBotMessage -> {
                val text = chatItemClassList[position].textthree
                (holder as LayoutThreeViewHolder).setViewe(text)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout One!", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            ChatItemClass.LayoutFour -> {
                val text = chatItemClassList[position].textfour
                (holder as LayoutFourViewHolder).setViewFour(text)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Four!", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            ChatItemClass.LayoutFive -> {
                val text = chatItemClassList[position].textfive
                (holder as LayoutFiveViewHolder).setViewFive(text)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Five!", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            ChatItemClass.LayoutSix -> {
                val text_from_oneway = chatItemClassList[position].text_from_oneway
                (holder as LayoutSixViewHolder).setViewSix(text_from_oneway)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.constraintLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Six!", Toast.LENGTH_SHORT)
                        .show()


                }
            }

            ChatItemClass.LayoutFlight -> {
                val btn_international_flight = chatItemClassList[position].btn_international_flight
                (holder as LayoutFlightViewHolder).setViewFlight(btn_international_flight)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Flight!", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            ChatItemClass.LayoutDomesticFlight -> {
                val btn_domestic_flight = chatItemClassList[position].btn_domestic_flight
                (holder as LayoutDomesticFlightViewHolder).setViewDomesticFlight(btn_domestic_flight)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(
                        view.context,
                        "Hello from Layout Domestic flight!",
                        Toast.LENGTH_SHORT
                    )
                        .show()


                }
            }
            ChatItemClass.LayoutRoundTrip -> {
                val text_from_roundtrip = chatItemClassList[position].text_from_roundtrip
                (holder as LayoutRoundTripViewHolder).setViewRoundTrip(text_from_roundtrip)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.constraintLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Round Trip", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            ChatItemClass.LayoutAccomodation -> {
                val text_yes_for_accommodation =
                    chatItemClassList[position].text_yes_for_accommodation
                (holder as LayoutAccomodationViewHolder).setViewAccomodation(
                    text_yes_for_accommodation
                )

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(
                        view.context,
                        "Hello from Layout Accomodation",
                        Toast.LENGTH_SHORT
                    )
                        .show()


                }
            }


            ChatItemClass.LayoutMap -> {
                val textMap = chatItemClassList[position].textMap
                (holder as LayoutMapViewHolder).setViewMap(textMap)

                // The following code pops a toast message
                // when the item layout is clicked.
                // This message indicates the corresponding
                // layout.
                holder.linearLayout.setOnClickListener { view ->
                    Toast.makeText(view.context, "Hello from Layout Map!", Toast.LENGTH_SHORT)
                        .show()


                }
            }
            else ->
                return
        }
    }

    // This method returns the count of items present in the
    // RecyclerView at any given time.
    override fun getItemCount(): Int {
        return chatItemClassList.size
    }

}
package ru.floppastar.ontpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class CollegeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_college, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapView = view.findViewById<WebView>(R.id.mapView)
        mapView.settings.javaScriptEnabled = true
        mapView.loadUrl("https://www.google.ru/maps/place/Орский+нефтяной+техникум/@51.2451865,58.4622363,17.5z/data=!4m6!3m5!1s0x417ffa59cb175d9b:0xa3b3492ea4b9ea22!8m2!3d51.2452012!4d58.4624703!16s%2Fg%2F11b5pkjh_1?entry=ttu&g_ep=EgoyMDI0MTExOS4yIKXMDSoASAFQAw%3D%3D")
    }
}
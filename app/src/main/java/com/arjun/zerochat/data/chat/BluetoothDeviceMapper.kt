package com.arjun.zerochat.data.chat


import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.arjun.zerochat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}
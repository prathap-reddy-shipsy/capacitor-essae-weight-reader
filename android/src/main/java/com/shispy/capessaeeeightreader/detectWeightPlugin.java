package com.shispy.capessaeeeightreader;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.example.essaeweighingscale_2p00.EssaeWeighingScale;

import java.net.UnknownHostException;

@CapacitorPlugin(name = "detectWeight")
public class detectWeightPlugin extends Plugin {
    private EssaeWeighingScale scaleClass;
    @Override
    public void load() {
        // Initialize the scale class when the plugin is loaded
        scaleClass = new EssaeWeighingScale();
    }
    @PluginMethod
    public void mapSettings(PluginCall call) throws UnknownHostException {
        String deviceAddress = call.getString("deviceAddress");
        if (deviceAddress == null) {
            call.reject("Device address is required");
            return;
        }

        // Map settings for the Bluetooth connection
        scaleClass.EssaeScale_MapSettings("BLUETOOTH", deviceAddress, 0);
        call.resolve();
    }

    @PluginMethod
    public void getWeight(PluginCall call) {
        String deviceAddress = call.getString("deviceAddress");
        String deviceName = call.getString("deviceName");
        if (deviceAddress == null || deviceName == null) {
            call.reject("Device address and name are required");
            return;
        }

        try {
            // Check if the device is an ESSAE WS and get the weight
            if (deviceName.contains("ESSAE WS")) {
                String resultData = scaleClass.EssaeScale_GetWeight("BLUETOOTH", deviceAddress, 0);
                JSObject ret = new JSObject();
                ret.put("weight", resultData);
                call.resolve(ret);
            } else {
                call.reject("Selected device is not an ESSAE WS");
            }
        } catch (Exception e) {
            call.reject("Error getting weight: " + e.getMessage());
        }
    }

    @PluginMethod
    public void tareWeight(PluginCall call) {
        String deviceAddress = call.getString("deviceAddress");
        if (deviceAddress == null) {
            call.reject("Device address is required");
            return;
        }

        try {
            // Tare the weight on the scale
            scaleClass.EssaeScale_TareWeight("BLUETOOTH", deviceAddress, 0);
            call.resolve();
        } catch (Exception e) {
            call.reject("Error performing tare: " + e.getMessage());
        }
    }
}

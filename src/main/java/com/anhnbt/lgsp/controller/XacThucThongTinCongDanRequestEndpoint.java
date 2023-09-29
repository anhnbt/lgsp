package com.anhnbt.lgsp.controller;

import com.anhnbt.lgsp.congdan.XacThucThongTinCongDanRequest;
import com.anhnbt.lgsp.congdan.KetQuaXacThucResponse;
import com.anhnbt.lgsp.service.YourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class XacThucThongTinCongDanRequestEndpoint {

    private static final String NAMESPACE_URI = "http://dancuquocgia.bca";

    @Autowired
    private YourService yourService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "XacThucThongTinCongDanRequest")
    @ResponsePayload
    public KetQuaXacThucResponse xacThucThongTinCongDan(@RequestPayload XacThucThongTinCongDanRequest request) {
        return yourService.xacThucThongTinCongDan(request);
    }
}

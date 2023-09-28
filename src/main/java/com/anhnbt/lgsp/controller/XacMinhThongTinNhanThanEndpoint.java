package com.anhnbt.lgsp.controller;

import com.anhnbt.lgsp.request.XacMinhThongTinNhanThan;
import com.anhnbt.lgsp.response.XacMinhThongTinNhanThanResponse;
import com.anhnbt.lgsp.service.YourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class XacMinhThongTinNhanThanEndpoint {

    private static final String NAMESPACE_URI = "http://gtel.vn/qldc";

    @Autowired
    YourService yourService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "XacMinhThongTinNhanThan")
    @ResponsePayload
    public XacMinhThongTinNhanThanResponse xacMinhThongTinNhanThan(@RequestPayload XacMinhThongTinNhanThan request) {
        // Xử lý request và trả về response
        XacMinhThongTinNhanThanResponse response = yourService.xacMinhThongTinNhanThan(request);
        return response;
    }
}

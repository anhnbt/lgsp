package com.anhnbt.lgsp.service;

import com.anhnbt.lgsp.congdan.XacThucThongTinCongDanRequest;
import com.anhnbt.lgsp.congdan.KetQuaXacThucResponse;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

@Service
public class YourService {

    public KetQuaXacThucResponse xacThucThongTinCongDan(XacThucThongTinCongDanRequest request) {
        KetQuaXacThucResponse response = new KetQuaXacThucResponse();
        response.setTonTai(true);
        return response;
    }

    public static XMLGregorianCalendar createXMLGregorianCalendarFromDate(java.util.Date date) {
        try {
            // Tạo một đối tượng DatatypeFactory
            DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();

            // Tạo một đối tượng Calendar từ ngày
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);

            // Chuyển đổi từ Calendar sang XMLGregorianCalendar
            return dataTypeFactory.newXMLGregorianCalendar(calendar);
        } catch (DatatypeConfigurationException e) {
            // Xử lý ngoại lệ nếu cần thiết
            e.printStackTrace();
            return null;
        }
    }
}

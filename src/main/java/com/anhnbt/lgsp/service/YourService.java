package com.anhnbt.lgsp.service;

import com.anhnbt.lgsp.request.XacMinhThongTinNhanThan;
import com.anhnbt.lgsp.response.CongdanCollection;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

@Service
public class YourService {

    public CongdanCollection xacMinhThongTinNhanThan(XacMinhThongTinNhanThan request) {

        // Tạo một CongdanCollection mới
        CongdanCollection congDanCollection = new CongdanCollection();
        congDanCollection.setSoCongDan("1000");
        congDanCollection.setGhiChu("");
        // Tạo một ngày java.util.Date
        java.util.Date date = new java.util.Date();

        // Chuyển đổi thành XMLGregorianCalendar
        XMLGregorianCalendar xmlGregorianCalendar = createXMLGregorianCalendarFromDate(date);
        congDanCollection.setThoiDiemDuLieu(xmlGregorianCalendar);
        congDanCollection.setId("62919a48-a7e4-4188-83f8-df422fe36f49");

        // Tạo một CongDan mới
        CongdanCollection.CongDan congDan = new CongdanCollection.CongDan();
        congDan.setSoDinhDanh("100014869515");
        congDan.setSoCMND("");
        
        // Tạo một HoVaTen mới cho CongDan
        CongdanCollection.CongDan.HoVaTen hoVaTen = new CongdanCollection.CongDan.HoVaTen();
        hoVaTen.setHo("Vân");
        hoVaTen.setChuDem("Võ");
        hoVaTen.setTen("Hồ");
        congDan.setHoVaTen(hoVaTen);
        
        // Tạo một NgayThangNamSinh mới cho CongDan
        CongdanCollection.CongDan.NgayThangNamSinh ngayThangNamSinh = new CongdanCollection.CongDan.NgayThangNamSinh();
        ngayThangNamSinh.setNgayThangNam("19920509");
        congDan.setNgayThangNamSinh(ngayThangNamSinh);

        // Tạo một Cha mới cho CongDan
        CongdanCollection.CongDan.Cha cha = new CongdanCollection.CongDan.Cha();
        cha.setSoDinhDanh("100014869513");
        cha.setQuocTich("VN");

        // Tạo một HoVaTen mới cho Cha
        CongdanCollection.CongDan.Cha.HoVaTen hoVaTenCha = new CongdanCollection.CongDan.Cha.HoVaTen();
        hoVaTenCha.setHo("Vân");
        hoVaTenCha.setChuDem("Võ");
        hoVaTenCha.setTen("Đăng");
        cha.setHoVaTen(hoVaTenCha);

        congDan.setCha(cha);

        // Tạo một Me mới cho CongDan
        CongdanCollection.CongDan.Me me = new CongdanCollection.CongDan.Me();
        me.setSoDinhDanh("100014869514");
        me.setQuocTich("VN");

        // Tạo một HoVaTen mới cho Me
        CongdanCollection.CongDan.Me.HoVaTen hoVaTenMe = new CongdanCollection.CongDan.Me.HoVaTen();
        hoVaTenMe.setHo("Nguyễn");
        hoVaTenMe.setChuDem("Thị");
        hoVaTenMe.setTen("Bình");
        me.setHoVaTen(hoVaTenMe);

        congDan.setMe(me);

        // Thêm CongDan vào CongdanCollection
        congDanCollection.getCongDan().add(congDan);

        return congDanCollection;
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

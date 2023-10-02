package com.anhnbt.lgsp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoaiDanhMucType {
    @JsonProperty("LoaiDanhMuc")
    private int loaiDanhMuc;
    @JsonProperty("MaTinh")
    private String maTinh;
    @JsonProperty("MaBoNganh")
    private String maBoNganh;
    @JsonProperty("MaLoaiKhieuTo")
    private String maLoaiKhieuTo;

    public int getLoaiDanhMuc() {
        return loaiDanhMuc;
    }

    public void setLoaiDanhMuc(int loaiDanhMuc) {
        this.loaiDanhMuc = loaiDanhMuc;
    }

    public String getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(String maTinh) {
        this.maTinh = maTinh;
    }

    public String getMaBoNganh() {
        return maBoNganh;
    }

    public void setMaBoNganh(String maBoNganh) {
        this.maBoNganh = maBoNganh;
    }

    public String getMaLoaiKhieuTo() {
        return maLoaiKhieuTo;
    }

    public void setMaLoaiKhieuTo(String maLoaiKhieuTo) {
        this.maLoaiKhieuTo = maLoaiKhieuTo;
    }
}

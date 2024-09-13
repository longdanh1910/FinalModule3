package model;

import java.sql.Date;

public class MuonSach {
    private String maMuonSach;
    private String maHocSinh;
    private String maSach;
    private Date ngayMuon; // Sử dụng Date cho ngày mượn
    private Date ngayTra;  // Sử dụng Date cho ngày trả
    private boolean daTra;

    public MuonSach(String maMuonSach, String maHocSinh, String maSach, Date ngayMuon, Date ngayTra, boolean daTra) {
        this.maMuonSach = maMuonSach;
        this.maHocSinh = maHocSinh;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.daTra = daTra;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public boolean isDaTra() {
        return daTra;
    }

    public void setDaTra(boolean daTra) {
        this.daTra = daTra;
    }
}

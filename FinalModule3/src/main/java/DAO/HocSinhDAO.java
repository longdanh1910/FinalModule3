package DAO;

import model.HocSinh;
import java.util.ArrayList;
import java.util.List;

public class HocSinhDAO {

    private static List<HocSinh> hocSinhList = new ArrayList<>();

    static {
        hocSinhList.add(new HocSinh("HS001", "Nguyen Van A", "10A1"));
        hocSinhList.add(new HocSinh("HS002", "Tran Thi B", "11B2"));
    }

    public List<HocSinh> getAllHocSinh() {
        return hocSinhList;
    }

    public HocSinh getHocSinhByMaHocSinh(String maHocSinh) {
        for (HocSinh hocSinh : hocSinhList) {
            if (hocSinh.getMaHocSinh().equals(maHocSinh)) {
                return hocSinh;
            }
        }
        return null;
    }
}

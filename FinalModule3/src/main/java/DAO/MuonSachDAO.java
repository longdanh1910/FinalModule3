package DAO;

import model.MuonSach;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MuonSachDAO {

    private static List<MuonSach> muonSachList = new ArrayList<>();

    public List<MuonSach> getAllMuonSach() {
        return muonSachList;
    }

    public void addMuonSach(MuonSach muonSach) {
        muonSachList.add(muonSach);
    }

    public MuonSach getMuonSachByMaMuonSach(String maMuonSach) {
        for (MuonSach muonSach : muonSachList) {
            if (muonSach.getMaMuonSach().equals(maMuonSach)) {
                return muonSach;
            }
        }
        return null;
    }

    public void updateTraSach(String maMuonSach) {
        MuonSach muonSach = getMuonSachByMaMuonSach(maMuonSach);
        if (muonSach != null) {
            muonSach.setDaTra(true);
        }
    }
}

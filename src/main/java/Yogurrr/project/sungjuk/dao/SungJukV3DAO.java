package Yogurrr.project.sungjuk.dao;

import Yogurrr.project.sungjuk.model.SungJukVO;

import java.util.List;

public interface SungJukV3DAO {
    boolean saveSungJuk(SungJukVO sj);

    List<SungJukVO> loadSungJuk();
}

package Yogurrr.project.sungjuk.service;

import Yogurrr.project.sungjuk.model.SungJukVO;

public interface SungJukV1cService {

    void newSungJuk();
    void readSungJuk();
    void readOneSungJuk();
    void modifySungJuk();
    void removeSungJuk();

    void computeSungJuk(SungJukVO sj);

    int displayMenu();
    void processMenu(int menu);
}


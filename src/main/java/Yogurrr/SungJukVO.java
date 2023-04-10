package Yogurrr;

public class SungJukVO {
//    public static void main(String[] args) {
//        SungJukVO d1 = new SungJukVO("홍길동1", 100, 90, 97);
//        SungJukVO d2 = new SungJukVO("홍길동2", 50, 66, 43);
//        SungJukVO d3 = new SungJukVO("홍길동3", 73, 79, 88);
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
//    }

    private String names;
    private int kors;
    private int engs;
    private int mats;
    private int tots;
    private double avgs;
    private char grds;

    // 기본 생성자를 꼭 만들어야 함!!
    public SungJukVO() {
    }

    public SungJukVO(String names, int kors, int engs, int mats) {
        this.names = names;
        this.kors = kors;
        this.engs = engs;
        this.mats = mats;

        this.tots = (kors + engs + mats);
        this.avgs = tots / 3;
        if (avgs >= 90) this.grds = '수';
        else if (avgs >= 80) this.grds = '우';
        else if (avgs >= 70) this.grds = '미';
        else if (avgs >= 60) this.grds = '양';
        else this.grds = '가';
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getKors() {
        return kors;
    }

    public void setKors(int kors) {
        this.kors = kors;
    }

    public int getEngs() {
        return engs;
    }

    public void setEngs(int engs) {
        this.engs = engs;
    }

    public int getMats() {
        return mats;
    }

    public void setMats(int mats) {
        this.mats = mats;
    }

    public int getTots() {
        return tots;
    }

    public void setTots(int tots) {
        this.tots = tots;
    }

    public double getAvgs() {
        return avgs;
    }

    public void setAvgs(double avgs) {
        this.avgs = avgs;
    }

    public char getGrds() {
        return grds;
    }

    public void setGrds(char grds) {
        this.grds = grds;
    }

    @Override
    public String toString() {
        String fmt = "%s | %d | %d | %d | %d | %.1f | %c\n";
        return String.format(fmt, names, kors, engs, mats, tots, avgs, grds);
    }
}

package lesson10;

import java.util.Objects;

public class Guitar implements Instruments {
    private int crhordNum;

    public Guitar(int crhordNum) {
        this.crhordNum = crhordNum;
    }

    public int getCrhordNum() {
        return crhordNum;
    }

    public void setCrhordNum(int crhordNum) {
        this.crhordNum = crhordNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return crhordNum == guitar.crhordNum;
    }

    @Override
    public int hashCode() {

        return Objects.hash(crhordNum);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "crhordNum=" + crhordNum +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + getCrhordNum() + " струнами");
    }
}

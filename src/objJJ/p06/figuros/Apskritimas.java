package objJJ.p06.figuros;

import java.util.Objects;

public class Apskritimas extends Figura {

    private double spindulys;

    @Override    // anotuojam
    // perrasem is tevines klases metoda ir liepiam kad patikrintu ar tikrai overridintas
    // tikrina ar yra tevinej ir ar tipas double sutampa, jei ne pabrauks
    public double plotas () {
        return Math.PI*spindulys * spindulys;
    }

    //getset
    public double getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(double spindulys) {
        this.spindulys = spindulys;
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apskritimas that = (Apskritimas) o;
        return Double.compare(that.spindulys, spindulys) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(spindulys);
    }
}

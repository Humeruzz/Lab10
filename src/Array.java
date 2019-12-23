import java.util.Arrays;

public class Array <E> {
    E mass[];

    public Array(E[] mass) {
        this.mass = mass;
    }

    public E[] getMass() {
        return mass;
    }

    public void seOnIndex(int id, E num) {
        if ((id <= mass.length) && ( id >= 0)){
            mass[id] = num;
        }
    }

    @Override
    public String toString() {
        return "Array{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}

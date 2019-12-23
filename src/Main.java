public class Main {

    public static void main(String[] args) {
        Integer mass[] = new Integer[10];
        for (int i = 0; i < mass.length; i++){
            mass[i] = (int)((Math.random()*9)+1);
        }
        Array<Integer> obj1 = new Array<Integer>(mass);
        System.out.println(obj1);
        obj1.seOnIndex(2, 15);
        System.out.println(obj1);
        String mass1[] = new String[10];
        for (int i = 0; i < mass1.length; i++){
            mass1[i] = "num: "+i;
        }
        Array<String> obj2 = new Array<>(mass1);
        System.out.println(obj2);
        obj2.seOnIndex(2, "Num");
        System.out.println(obj2);
    }
}

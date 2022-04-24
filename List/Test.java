package Buoi3.List;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myArray = new MyArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);

        for (int i = 0; i < myArray.getSize(); i++) {
            System.out.println(myArray.get(i));
        }
    }
}

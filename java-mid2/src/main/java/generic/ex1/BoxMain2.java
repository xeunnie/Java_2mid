package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.set(10);

         Object object = objectBox.get();
         Integer integer = (Integer) object; //down casting

        Integer integer2 = (Integer) objectBox.get();

        System.out.println("integer" + integer2);
    }
}

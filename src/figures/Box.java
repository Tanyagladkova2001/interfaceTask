package figures;

public interface Box {

    void box();

    String EMPTY_BOX = "Empty box";


    default boolean add(Shape shape) {
        for (int i = 0; i < shape.getVolume(2.3); i++) {
            int add = 0;
            if (add < shape.getVolume(2.3)) {
                System.out.println("3");
            }

        }

        return false;
    }

}

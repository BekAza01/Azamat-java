public class fclass1 {
    public void show() {
        System.out.println("Это класс fclass1");
    }

    public static void main(String[] args) {
        fclass3 obj = new fclass3();
        obj.show();
    }
}

class fclass2 extends fclass1 {
    @Override
    public void show() {
        super.show(); // fclass1
        System.out.println("Это класс fclass2");
    }
}

class fclass3 extends fclass2 {
    @Override
    public void show() {
        super.show(); // fclass1 + fclass2
        System.out.println("Это класс fclass3");
    }
}
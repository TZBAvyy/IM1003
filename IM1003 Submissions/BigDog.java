public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wooow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Cow ngua = new Cow();
        ngua.sound();
        Duck donald = new Duck();
        donald.sound();
        Pig piglet = new Pig();
        piglet.sound();
        Owl hedwid = new Owl();
        hedwid.sound();
        Duck daisy = new PekingDuck();

        donald.swim();
        hedwid.fly();

        donald.clean(new Cow());
        donald.clean(ngua);
        daisy.clean(donald);
    }
}

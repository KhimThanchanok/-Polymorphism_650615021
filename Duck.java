public class Duck extends Animal implements Flyable {
    private static final String Duck = null;
    @Override
    void sound(){
        System.out.println("Quack quack!");
    }
    void swim(){
        System.out.println("ปุ๋ง");
    }
    public void glide(){
        System.out.println("เป็ดร่อน");
    }
    
    public void clean(Animal prey){
        System.out.println(Duck + " is cleaning " + prey);
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}
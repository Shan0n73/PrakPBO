
public class EncapTest {

    public static void main(String args[]) {
        EncapDemo encap1 = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        EncapDemo encap3 = new EncapDemo();
        
        encap1.setName("Xenon");
        encap1.setAge(40);

        encap2.setName("Diego");
        encap2.setAge(21);

        encap3.setName("Rachel");
        encap3.setAge(17);

        System.out.println("Name: " + encap1.getName());
        System.out.println("Age: " + encap1.getAge());

        System.out.println("Name: " + encap2.getName());
        System.out.println("Age: " + encap2.getAge());

        System.out.println("Name: " + encap3.getName());
        System.out.println("Age: " + encap3.getAge());

    }
}

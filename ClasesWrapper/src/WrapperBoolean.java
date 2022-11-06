public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > 2; // false
        Boolean objBoolean = Boolean.valueOf(primBoolean); // forma explicita // boxing
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("comparando dos objectos boolean: " + (objBoolean == objBoolean2) );
        System.out.println("comparando dos objectos boolean: " + (objBoolean.equals(objBoolean2)) );
        System.out.println("comparando dos objectos boolean: " + (objBoolean2 == objBoolean3) );
        System.out.println("comparando dos objectos boolean: " + (objBoolean == objBoolean3) );

        boolean primBoolean2 = objBoolean2.booleanValue(); //unboxing // explicita
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}

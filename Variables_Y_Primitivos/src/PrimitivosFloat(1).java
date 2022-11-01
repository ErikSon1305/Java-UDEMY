public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 2.12e3f;// = 2120f;
        System.out.println("realFloat = " + realFloat);

        float realFfloat = 1.5e-10f; // = 0.00000000015f;
        System.out.println("realFfloat = " + realFfloat);
        System.out.println("realFfloat corresponde en byte a = " + Float.BYTES);
        System.out.println("realFfloat corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para realFfloat = " + Float.MAX_VALUE);
        System.out.println("maximo valor para realFfloat = " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("double = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("maximo valor para double = " + Double.MIN_VALUE);
        
        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}

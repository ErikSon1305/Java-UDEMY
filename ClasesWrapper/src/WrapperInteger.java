public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjecto = Integer.valueOf(intPrimitivo); // Forma explicita de crear un objecto tipo integer
        Integer intObjecto2 = intPrimitivo; // Forma implicita
        System.out.println("intObjecto = " + intObjecto);

        int num = intObjecto;
        System.out.println("num = " + num);
        int num2 = intObjecto.intValue();
        System.out.println("num2 = " + num2);


        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short  shortObjecto = intObjecto.shortValue();
        System.out.println("shortObjecto = " + shortObjecto);

        Byte byteObjecto =  intObjecto.byteValue();
        System.out.println("byteObjecto = " + byteObjecto);

        Long longObjeto = intObjecto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}

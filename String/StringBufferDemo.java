public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());// 16 //default capacity
        StringBuffer str1 = new StringBuffer("abc");// 16+3=19
        System.out.println(str1.capacity());
        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.length());// length->0
        StringBuffer str3 = new StringBuffer(10);// changing default capacity according to me
        System.out.println(str3.capacity());
        System.out.println(str1);
        String str4 = new String();
        System.out.println(str4); // When reference call by string it give nothing just an space !
        StringBufferDemo sd = new StringBufferDemo();
        System.out.println(sd); // when reference call by constructor it give the hashcode
        System.out.println(str1.reverse());
    }
}

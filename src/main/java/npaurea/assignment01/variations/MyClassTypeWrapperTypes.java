package npaurea.assignment01.variations;

public class MyClassTypeWrapperTypes {

    public Boolean getLiteralBoolean() {
         return true;
     }

    public Byte getLiteralByte() {
         return 127;
    }

    public Character getLiteralChar() {
         return 'a';
    }

    public Short getLiteralShort() {
         return 32767;
    }

    public Integer getInt() {
         return 0x7fffffff;
    }

    public Long getLong() {
         return  0x7fffffffffffffffL;
    }

    public Float getFloat() {
         return  0x1.fffffeP+127f;
    }

    public Double getDouble() {
         return  0x1.fffffffffffffP+1023;
    }
}

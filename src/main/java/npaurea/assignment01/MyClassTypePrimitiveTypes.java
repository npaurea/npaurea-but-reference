package npaurea.assignment01;

public class MyClassTypePrimitiveTypes {

     public boolean getLiteralBoolean() {
         return true;
     }

    public byte getLiteralByte() {
         return 127;
    }

    public char getLiteralChar() {
         return 'a';
    }

    public short getLiteralShort() {
         return 32767;
    }

    public int getInt() {
         return 0x7fffffff;
    }

    public long getLong() {
         return  0x7fffffffffffffffL;
    }

    public float getFloat() {
         return  0x1.fffffeP+127f;
    }

    public double getDouble() {
         return  0x1.fffffffffffffP+1023;
    }
}

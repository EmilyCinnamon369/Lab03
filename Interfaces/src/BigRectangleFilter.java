import java.awt.*;

class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle){
            Rectangle r = (Rectangle) x;
            return (2*(r.getHeight()+r.getWidth()))>10;
        }
        return false;
    }}
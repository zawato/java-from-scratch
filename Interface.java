// インタフェースは、ある機能を実現するクラスが必ず実装するべきメソッドの名前や型といった作法のみを定義するもの
// 実装を行う際のプログラミングミスをチェックするのが、インタフェースの役目

interface InterfaceA {
    public abstract void methodA(String msg);
    public abstract void methodB(int x);
}

class InterfaceTest implements InterfaceA {
    public static void main(String[] args) {
        InterfaceTest o = new InterfaceTest();
        o.methodA("ABC");
        o.methodB(123);
    }
    public void methodA(String msg) {
        System.out.println(msg);
    }
    public void methodB(int x) {
        System.out.println(x);
    }
}

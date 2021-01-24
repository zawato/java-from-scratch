public class AccessTest1 {

    // public, protected, 無し, privateな値の定義
    public int publicValue;
    protected int protectedValue;
    /* 無し */ int normalValue;
    private int privateValue;

    public static void main(String[] args) {
    }

    // 自ファイル・自クラスからのアクセステスト
    public AccessTest1() {
        this.publicValue = 1;
        this.protectedValue = 2;
        this.normalValue = 3;
        this.privateValue = 4;
    }
}

class AccessTest2 extends AccessTest1 {
    // 自ファイル・サブクラスからのアクセステスト
    void AccessTest2() {
        this.publicValue = 1;
        this.protectedValue = 2;
        this.normalValue = 3;
        // this.privateValue = 4;  ← アクセスできない
    }
}

class AccessTest3 {
    // 自ファイル・他クラスからのアクセステスト
    void AccessTest3() {
        AccessTest1 o = new AccessTest1();
        o.publicValue = 1;
        o.protectedValue = 2;
        o.normalValue = 3;
        // o.privateValue = 4;  ← アクセスできない
    }
}

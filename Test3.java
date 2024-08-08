class Parent {
    void m1() {
        System.out.println("HII");
    }
}

class Test3 {
    Parent t;

    Test3(Parent t) {
        this.t = t;
    }

    void callParentM1() {
        t.m1();  // Correct way to call m1 on Parent instance
    }

    public static void main(String[] args) {
        Parent p = new Parent();  // Creating a Parent object
        Test3 testInstance = new Test3(p);  // Creating a Test3 object with the Parent object

        testInstance.callParentM1();  // Call the method that delegates to Parent's m1
    }
}

public class Foo {


    public  void debug() {
        System.out.println(a + "," + b + "," + c);
    }
    public static class  Builder{
        private int a;
        private String b;
        private boolean c;
        private float d;

        public Builder a(int value){
            this.a = value;
            return this;
        }

        public Builder b(String value){
            this.b = value;
            return this;
        }

        public Builder c(boolean value){
            this.c = value;
            return this;
        }

        public Builder d(float value){
            this.d = value;
            return this;
        }

        public Foo build(){
            return new Foo(this);
        }
    }

    public static void main(String[] args) {
        Foo foo = new Builder()
                .a(99)
                .b("z")
                .c(true)
                .build();
        foo.debug();
    }

}

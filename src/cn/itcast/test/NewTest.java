package cn.itcast.test;

public class NewTest {

        String str= "good";
        char [] ch={'a','b','c'};

        public static void main(String[] args) {
            NewTest ex=new NewTest();
            ex.change(ex.str, ex.ch);
            System.out.print(ex.str+"and");
            System.out.print(ex.ch);
        }

        public void change(String  str,char ch[]){
            str="test ok";
            ch[0]='g';
        }
    }


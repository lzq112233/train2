package org.example;

import org.junit.Assert;
import org.junit.Test;

public class AddNumberTest {

    @Test
    public void shouldAnswerWithTrue()
    {

        System.out.println("执行 AddNumber 类 add()方法");
        int n1 = 10;
        int n2 = 20;
        int res = 0;
        AddNumber app =new AddNumber();
        res = app.add(n1,n2);
        // 期望值，实际值
        Assert.assertEquals(30,res);
    }

    @Test
    public void testAddNumber2(){
        System.out.println("执行 AddNumber 类 add()方法");
        int n1 = 20;
        int n2 = 30;
        int res = 0;
        AddNumber test=new AddNumber();
        res = test.add(n1,n2);
        // 期望值，实际值
//        Assert.assertEquals(60,res);
        Assert.assertEquals(50,res);
    }


}

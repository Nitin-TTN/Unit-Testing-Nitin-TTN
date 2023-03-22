package com.demo.service;
import com.demo.domain.Order;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmailServiceTest {
   Order o1=new Order(3,"Colgate Family Pack",120.5);
   Order o2=new Order(6,"Brush",22.4);
   EmailService es=new EmailService();
   @Test(expected = RuntimeException.class)
   public void testSendEmail_withOneArguments() {
      es.sendEmail(o1);
   }
   @Test
   public void testSendEmail_withTwoArguments()
   {
      assertTrue(es.sendEmail(o2,"Notified"));
   }
}
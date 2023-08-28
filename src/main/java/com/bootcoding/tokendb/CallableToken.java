package com.bootcoding.tokendb;

import java.util.Random;

public class CallableToken {
     public static int callable(){
          Random random=new Random();
          int s=1+random.nextInt()*10;
          return s;
     }
}

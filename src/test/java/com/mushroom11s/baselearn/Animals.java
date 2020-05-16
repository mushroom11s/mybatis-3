package com.mushroom11s.baselearn;

/**
 * @author aries
 * @Description:
 * @date 2020/3/21 12:34 AM
 */
public class Animals {
  String name;

  Animals() {
    System.out.println("Super non argument structure method");
  }

  Animals(String name) {
    this.name = name;
    System.out.println("Super argument structure method");
  }

  public static void print(){
    System.out.println("Super static method");
  }

  static{
    System.out.println("Super static code block");
  }

  {
    System.out.println("Super normal code block");
  }
}

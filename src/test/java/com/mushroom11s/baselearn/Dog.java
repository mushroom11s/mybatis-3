package com.mushroom11s.baselearn;

/**
 * @author aries
 * @Description:
 * @date 2020/3/21 12:35 AM
 */
public class Dog extends Animals {

  static {
    System.out.println("Sub static code block");
  }

  Dog(String name) {
    super(name);
  }

  Dog() {
    System.out.println("Sub structure method");
  }

  {
    System.out.println("Sub normal code block");
  }
}

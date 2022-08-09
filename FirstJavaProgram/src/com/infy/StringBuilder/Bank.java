package com.infy.StringBuilder;

class Bank{
  public static void main(String[] args){
    StringBuilder sb=new StringBuilder("Sachin");
    String name=sb.append("Tendulkar").toString();
    System.out.println(name);
  }
}




package com.company;
class myEmployee{
    private int id;
    private String name;

    public void setName(String n){
       name = n;
    }
    public  String getName(){
        return name;
    }
    public  void setId(int i){
        id = i;
    }
    public  int getId(){
        return id;
    }
}
public class access_modifier_private {
    public static void main(String[] args) {
        myEmployee princy = new myEmployee();
        princy.setName("Patel Princy");
        System.out.println(princy.getName());
        princy.setId(233);
        System.out.println(princy.getId());

    }
}

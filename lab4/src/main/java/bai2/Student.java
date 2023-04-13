package bai2;

 class Student {
     private String name;
     private int age;
     private double mark;

     public Student(String name, int age, double mark) {
         this.name = name;
         this.age = age;
         this.mark = mark;
     }

     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public double getMark() {
         return mark;
     }

     public String toString() {
         return name + "\t" + age + "\t" + mark;

     }
 }



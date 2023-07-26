package com.sky.inputs;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private Profession profession;

    public Person(){};
    public void personForm(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter you age");
            age = sc.nextInt()/0;
            sc.nextLine();

            System.out.println("Enter you name");
            name = sc.nextLine();

            System.out.println("Choose the correct option for profession: \n1) Software Dev \n2) SRE \n3) DevOps Engineer");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    profession = Profession.SoftwareDeveloper;
                    break;
                case 2:
                    profession = Profession.SRE;
                    break;
                case 3:
                    profession = Profession.DevOpsEngineer;
                    break;
            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("You entered the wrong input buddy");
        }
        catch (Exception e){
            System.out.println("Don't really know");
        }
        finally {
            System.out.println("Thank you for your time. Here are your entered details \n {age: "+age+", name: "+name+",profession: "+profession+"}");
        }
    }

    @Override
    public String toString() {
        return String.format("age: %d, name: %s, profession: "+profession,age,name,profession);
    }
}

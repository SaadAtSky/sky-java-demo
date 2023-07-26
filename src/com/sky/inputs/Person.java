package com.sky.inputs;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private int age;
    private String name;
    private Profession profession;

    public Person(int age, String name, Profession profession){
        this.age = age;
        this.name = name;
        this.profession = profession;
    };
    public static Person personForm(){
        Scanner sc = new Scanner(System.in);
        boolean detailsEntered = false;
        while(!detailsEntered){
            try{
                System.out.println("Enter you age");
                int enteredAge = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter you name");
                String enteredName = sc.nextLine();

                System.out.println("Choose the correct option for profession: \n1) Software Dev \n2) SRE \n3) DevOps Engineer");
                Profession professionEntered;
                int option = sc.nextInt();
                switch (option){
                    case 1:
                        professionEntered = Profession.SoftwareDeveloper;
                        break;
                    case 2:
                        professionEntered = Profession.SRE;
                        break;
                    case 3:
                        professionEntered = Profession.DevOpsEngineer;
                        break;
                }
                detailsEntered = true;
                return new Person(enteredAge, enteredName, professionEntered);
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

    }

    @Override
    public String toString() {
        return String.format("age: %d, name: %s, profession: "+profession,age,name,profession);
    }
}

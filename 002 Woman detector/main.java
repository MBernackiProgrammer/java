package com.company;

import java.util.Scanner;

public class Main {

    public static boolean areYouAWoman(String name)
    {
        return name.endsWith("a");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your name");
        String name = scanner.nextLine();
        if(name.isEmpty())
        {
            if(areYouAWoman(name))
            {
                System.out.println("You are a woman");
            }
            else
            {
                System.out.println("You are a man");
            }
        }
        else
        {
            System.out.println("Please write name");
        }
    }
}
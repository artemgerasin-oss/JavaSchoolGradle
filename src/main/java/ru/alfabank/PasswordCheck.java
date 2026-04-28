package ru.alfabank;

import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Arrays;


public class PasswordCheck {


    public static void main(String[] args){

        String[] arrPassword = {"correctPassword", "1345z", "qwerty123"};

        //int minlengthpass = 8;
        String target_1 = "1";
        String target_z = "z";
        String target_1234 = "1234";
        String target_qwety = "qwerty";

        boolean found_1 = false;
        boolean found_z = false;
        boolean found_1234 = false;
        boolean found_qwety = false;

        boolean passwordCheck = false;

        for (int i=0; i < arrPassword.length; i++){

            if(arrPassword[i].startsWith("1")){
                //System.out.println("Пароль " + arrPassword[i] + " содержит 1 в начале");
                found_1 = true;
            }

            if(arrPassword[i].endsWith("z")){
                //System.out.println("Пароль" + arrPassword[i] + " содержит z в конце!");
                found_z = true;
            }

            if(arrPassword[i].contains("123")){
                //System.out.println("Пароль" + arrPassword[i] + " содержит 123 !");
                found_1234 = true;
            }

            if(arrPassword[i].contains("qwerty")){
                //System.out.println("Пароль" + arrPassword[i] + " содержит z в конце!");
                found_qwety = true;
            }
            if (found_1234 || found_1 || found_z || found_qwety){
                System.out.println("Пароль " + arrPassword[i] + " содержит недопустимые символы");
                continue;
            }else {System.out.println("Пароль " + arrPassword[i] + " корректный!");}


        }


        }

    }

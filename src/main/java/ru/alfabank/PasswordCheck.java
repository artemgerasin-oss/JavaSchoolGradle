package ru.alfabank;

import java.sql.PreparedStatement;
import java.sql.SQLOutput;
import java.util.Arrays;


public class PasswordCheck {


    public static void main(String[] args){

        String[] arrPassword = {"correctPassword", "1345z", "qwerty123"};

        int minlengthpass = 8;
        String target_1 = "1";
        String target_z = "z";
        String target_1234 = "1234";
        String target_qwety = "qwerty";

        boolean found_minLength = false;
        boolean found_1 = false;
        boolean found_z = false;
        boolean found_1234 = false;
        boolean found_qwety = false;


        boolean passwordCheck = false;

        for (int i=0; i < arrPassword.length; i++){

            if(arrPassword[i].length() < minlengthpass){
                found_minLength = true;
            }

            if(arrPassword[i].startsWith("1")){

                found_1 = true;
            }

            if(arrPassword[i].endsWith("z")){
                found_z = true;
            }

            if(arrPassword[i].contains("123")){
                found_1234 = true;
            }

            if(arrPassword[i].contains("qwerty")){
                found_qwety = true;
            }

            if (found_minLength || found_1234 || found_1 || found_z || found_qwety){
                System.out.println("Пароль " + arrPassword[i] + " содержит недопустимые символы или длинну");
                continue;
            }else {System.out.println("Пароль " + arrPassword[i] + " корректный!");}


        }


        }

    }

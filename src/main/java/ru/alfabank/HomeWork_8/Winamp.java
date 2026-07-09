package ru.alfabank.HomeWork_8;

import java.util.ArrayList;

public class Winamp {

    public static void main(String[] args) {

    Playlist rock = new Playlist("Rock");

     rock.addSong("0_Vasya poet pesny",0);
     rock.addSong("1_Petrovich na cepi",1);
     rock.addSong("2_Vashi pesni govno",2);
     rock.addSong("3_Ssal y podezda pidor",3);

        System.out.println("========================");

        rock.getSongByIndex(0);
        rock.getSongByIndex(1);
        rock.getSongByIndex(2);
        rock.getSongByIndex(3);

        System.out.println("========================");

    rock.deleteSongByIndex(3);

        System.out.println("========================");


    rock.getSongByIndex(0);
    rock.getSongByIndex(1);
    rock.getSongByIndex(2);
    rock.getSongByIndex(3);



    }




}

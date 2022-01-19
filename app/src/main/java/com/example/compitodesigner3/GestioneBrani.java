package com.example.compitodesigner3;

import java.util.ArrayList;

public class GestioneBrani {
    ArrayList<Brano> ListaBrani;
    public GestioneBrani()
    {
        ListaBrani = new ArrayList();
    }
    public void visualizzaBrani()
    {



    }

    public void addBrano(String titolo)
    {
      Brano br = new Brano(titolo);
      ListaBrani.add(br);



    }



}

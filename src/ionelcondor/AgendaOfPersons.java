package ionelcondor;

/**
 * Created by condor on 07/11/15.
 */

import java.util.Scanner;

public class AgendaOfPersons {

    //crearea vectorului pentru inregistrari
    private Person[] nameAgenda = new Person[5];

    //adaug un index ca sa stiu unde am ajuns
    private int index;


    public static void main(String[] args) {
        System.out.println("AgendaTa versiunea 2.0");
        AgendaOfPersons m = new AgendaOfPersons();

        do {
            m.printMenu(); // afisseaza optiuni
            int option = 0;
            option = m.readMenuOption(); // citste optiunea
            switch (option) {
                case 1:
                    m.listAgenda();
                    break;
                case 2:
                    m.searchAgendaAndDisplay();
                    break;
                case 3:
                    m.createItem();
                    break;
                case 4:
                    m.updateItem();
                    break;
                case 5:
                    m.deleteItem();
                    break;
                case 6:
                    m.daBunaZiua();
                    break;

                case 9:
                    m.exitOption();
                    break;
                default:
                    m.defaultOption();
                    break;
            }
        } while (true);

    }


    private void printMenu() {
        System.out.println("1. List");
        System.out.println("2. Search");
        System.out.println("3. Create");
        System.out.println("4. Update");
        System.out.println("5. Delete");
        System.out.println("6. Da buna ziua");

        System.out.println("9. Exit");
    }

    private void exitOption() {
        System.out.println("Bye, bye...the content not saved will now be erased");
        System.exit(0);
    }

    private void defaultOption() {
        System.out.println("This option does not exist. Pls take another option");
    }

    private String readAString(String label) {
        Scanner s = new Scanner(System.in);
        System.out.print(label);
        String name = s.nextLine();
        return name;
    }

    private  int readMenuOption() {
        Scanner s = new Scanner(System.in);
        System.out.print("Option: ");
        int option = s.nextInt();
        return option;
    }


    private void daBunaZiua() {
        System.out.println("buna ziua");
    }

    private void createItem() {
        //daca nu am ajuns la 50
        //citire
        //adaugare in array daca nu am ajuns la 50

        boolean done=false;
        //String val = readName();
        Person val= new Person();

        String name= readAString("Name:");
        String phone= readAString("Phone");

        val.setName(name);
        val.setPhone(phone);


        for (int i=0; i<nameAgenda.length; i++){

            if (nameAgenda[i]==null){
                nameAgenda[i]=val;
                done=true;
                break;


        }
            }

        if (index<nameAgenda.length && !done) {
                nameAgenda[index] = val;
        index++;


        }


        }




    private void updateItem() {

/*
        String numeCurent= readName();

        for (int i=0; i<nameAgenda.length; i++) {

            // trebuie comparat obiectul sa nu fie null
            if (nameAgenda[i] != null) {
                if ((nameAgenda[i]).equals(numeCurent)) {
                    System.out.println("S-a gasit o valoare egala");

                    String newValue = readName();
                    nameAgenda[i] = newValue;
                    break;


                } else {
                    System.out.println("Nu s-a putut gasi string-ul respectiv");

                }
            }
        }
*/
    }


    private void deleteItem() {
        String numeCurent= readAString("Stergere");

        for (int i=0; i<nameAgenda.length; i++) {

            // trebuie comparat obiectul sa nu fie null
            if (nameAgenda[i] != null) {
                if ((nameAgenda[i]).equals(numeCurent)) {
                    System.out.println("S-a gasit o valoare egala");


                    nameAgenda[i] = null;
                    break;


                } else {
                    System.out.println("Nu s-a putut gasi string-ul respectiv");
                    break;

                }
            }
        }

    }


    /* returns the index where the name was found or -1 if the name is not in the agenda*/
    private int searchAgenda() {
        int index = 0;
        return index;
    }

    /* returns the index where the name was found or -1 if the name is not in the agenda */
    private void searchAgendaAndDisplay() {
        String numeCautat= readAString("Cautare");

        for (int i=0; i<nameAgenda.length; i++){
            if(nameAgenda[i]!=null){
                if(numeCautat.equals(nameAgenda[i])){
                    System.out.println("S-a gasit numele cautat pe pozitia "+ i+1);
                    break;
                }

            }
            else {
                System.out.println("Nu s-a gasit numele cautat");
                break;
            }
        }



    }


    private void listAgenda() {
        System.out.println("aici as lista agenda");
        int counter = 0;
        for (int i = 0; i < nameAgenda.length; i++) {
            if (nameAgenda[i] != null) {

                Person p=nameAgenda[i];

                System.out.println(p.getName());
                System.out.println(p.getPhone());
                counter++;
            }

           // }
        }
        if (counter == 0)
            System.out.println("Agenda este goala");

    }
}
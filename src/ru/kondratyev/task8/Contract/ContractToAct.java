package ru.kondratyev.task8.Contract;


public class ContractToAct {

    public static void ContractToAct() {
        Contract C = new Contract();
        Act A = new Act();
        C.setND(30, "30/01/20");
        C.setND("one", "two", "three");
        System.out.printf("%nContract: Number %s, date %s %nList:%n", C.getNumber(), C.getDate());
        for (int i = 0; i < C.getList().length; i++) {
            System.out.println(C.getList()[i]);
        }
        A.setND(C.getNumber(), C.getDate());
        A.setND(C.getList()[0], C.getList()[1], C.getList()[2]);
        System.out.printf("%nContractToAct: Number %s, date %s %nList:%n", C.getNumber(), C.getDate());
        System.out.printf("%s%n%s%n%s", A.getList()[0], A.getList()[1], A.getList()[2]);
    }

    public static void main(String[] args) {
        Act A = new Act();
        A.setND(10, "10/10/19");
        System.out.printf("Act: Number %s, date %s %nList:%n", A.getNumber(), A.getDate());
        A.getList()[0] = "apple";
        A.getList()[1] = "lemon";
        A.getList()[2] = "melon";
        for (int i = 0; i < A.getList().length; i++) {
            System.out.println(A.getList()[i]);
        }

        Contract C = new Contract();
        C.setND(20, "20/01/20");
        System.out.printf("%nContract: Number %s, date %s %nList:%n", C.getNumber(), C.getDate());
        C.getList()[0] = "bol";
        C.getList()[1] = "table";
        C.getList()[2] = "pen";
        for (int i = 0; i < A.getList().length; i++) {
            System.out.println(A.getList()[i]);
        }
        ContractToAct();
    }

}

//номер, дата, список товаров (массив строк) Написать класс со статическим методом конвертации договора в акт
//(на вход передавать договор, на выходе получаем акт).
package ru.kondratyev.task8.Contract;


public class ContractToActConverter {

    static Act convert(Contract contract) {
        return new Act(contract.getNumber(), contract.getDate(), contract.getList());
    }

    public static void main(String[] args) {
        String[] list = new String[]{"a", "b", "s"};
        System.out.println(new Act(10, "10.10.20", new String[]{"a", "b", "s"}));
        System.out.println(new Contract(11, "11.11.11", new String[]{"k", "l", "m"}));
        System.out.println(convert(new Contract(1, "01.01.01", new String[]{"z", "x", "c"})));
    }
}

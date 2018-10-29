package com.company;

public class Main {

    public static void main(String[] args) {
        String lin = "Ещё вчера я думал, что завтра - наступит сегодня. Можно подумать - я был не прав.";
        int one = lin.indexOf("д");      // Составить 2 варианта исполнения программы:
        int two = lin.indexOf("е");
        int three = lin.indexOf("н");
        int four = lin.indexOf("ь");
        char ar = lin.charAt(one);        // TODO используя класс String
        char ar2 = lin.charAt(two);
        char ar3 = lin.charAt(three);
        char ar4 = lin.charAt(four);
        System.out.println(ar+" "+ar2+" "+ar3+" "+ar4);
        System.out.println(one+" "+two+" "+three+" "+four+" - Порядковый номер символа в строке соответственно.");


        StringBuffer lin2 = new StringBuffer("Ещё вчера я думал, что завтра - наступит сегодня. Можно подумать - я был не прав.");
        int o = lin2.indexOf("д");
        int t = lin2.indexOf("е");
        int th = lin2.indexOf("н");
        int f = lin2.indexOf("ь");           // TODO используя класс StringBuffer
        char aro = lin2.charAt(o);
        char art = lin2.charAt(t);
        char arth = lin2.charAt(th);
        char arf = lin2.charAt(f);
        System.out.println(aro+" "+art+" "+arth+" "+arf);
        System.out.println(o+" "+t+" "+th+" "+f+" - Порядковый номер символа в строке соответственно.");
    }
}

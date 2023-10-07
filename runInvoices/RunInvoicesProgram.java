package runInvoices;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RunInvoicesProgram {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();
        LocalDate aug5 = LocalDate.of(2023, Month.AUGUST, 5);
        LocalDate aug3 = LocalDate.of(2023, Month.AUGUST, 3);
        LocalDate aug2 = LocalDate.of(2023, Month.AUGUST, 2);
        System.out.println("today = " + today);
        System.out.println("aug 2 = " + aug2);
        System.out.println("aug 3 = " + aug3);
        System.out.println("aug 5 = " + aug5);
        Invoice invoice101 = new Invoice(aug2, 101);
        Invoice invoice102 = new Invoice(aug3, 102);
        Invoice invoice103 = new Invoice(aug5, 103);
        System.out.println("total on invoice " + invoice101.getInvoiceNumber() + " = " + invoice101.getTotal());
        System.out.println("total on invoice " + invoice102.getInvoiceNumber() + " = " + invoice102.getTotal());
        System.out.println("total on invoice " + invoice103.getInvoiceNumber() + " = " + invoice103.getTotal());
        System.out.println("------------------\n");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        double priceA = 100.09;
        double priceB = 87.65;
        double diffPrice = priceA - priceB;
        System.out.println("priceA - priceB = " + diffPrice);
        String[] euhhlist = { "anuht", "cpcrlg", "eaueo", "bueans", "dshtn" };
        System.out.println("euhhlist = " + Arrays.toString(euhhlist));
        Arrays.sort(euhhlist);
        System.out.println("euhhlist = " + Arrays.toString(euhhlist));
        ArrayList<String> htnslist = new ArrayList<String>();
        htnslist.add("jkq");
        htnslist.add("xmbw");
        htnslist.add("cygf");
        htnslist.add("idht");
        htnslist.add("euid");
        System.out.println("htnslist = " + htnslist.toString());
        htnslist.add(2, "jeo");
        System.out.println("htnslist = " + htnslist.toString());
        System.out.println("htnslist[3] = " + htnslist.get(3));
        System.out.println("htnslist.size() = " + htnslist.size());
        String removedS = htnslist.remove(htnslist.size() - 1);
        System.out.println("removed " + removedS + "  now htnslist.size() = " + htnslist.size());
        System.out.println("htnslist = " + htnslist.toString());
        System.out.println("------------------\n");
        HashMap<String, Integer> rcgfMap = new HashMap<String, Integer>();
        rcgfMap.put("crg", 223);
        rcgfMap.put("aok", 233);
        rcgfMap.put("hdi", 123);
        rcgfMap.put("xjb", 983);
        rcgfMap.put("jqo", 963);
        System.out.println("rcfgMap = " + rcgfMap.toString());
        System.out.println("rcfgMap[\"xjb\"] = " + rcgfMap.get("xjb"));
        System.out.println("rcfgMap.keySet() = " + rcgfMap.keySet().toString());
        System.out.println("rcfgMap.values() = " + rcgfMap.values().toString());
        System.out.println("rcfgMap.size() = " + rcgfMap.size());

        rcgfMap.remove("hdi");
        rcgfMap.put("xjb", 111);
        System.out.println("after changing xjb value and removing hdi rcfgMap = " + rcgfMap.toString());
        System.out.println("rcfgMap.size() = " + rcgfMap.size());
        System.out.println("rcfgMap[\"xjb\"] = " + rcgfMap.get("xjb"));

    }

}

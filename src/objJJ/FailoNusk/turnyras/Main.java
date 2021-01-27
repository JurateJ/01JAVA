package objJJ.FailoNusk.turnyras;
/*     Turnyras:
        Zaidejas:
            Zmones
            Pora:
                1) Zmogus + Zmogus
                2) Poros laimetojas + Zmogus
                3) Poros laimetojas + Poros laimetojas
 */

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Prad duom:" + args.length);
//        if (args.length > 0) {
//            for (String a : args) System.out.println(a);
//        }

        if (args.length == 1) {
            fileMode(args[0]);
        } else {
            System.err.println("Klaida - nera failo");
        }
        System.out.println("Pabaiga");

//        Zmogus z1 = new Zmogus("Jonas");
//        Zmogus z2 = new Zmogus("Ona");
//        Pora p1 = new Pora(z1, z2);
//        Pora p2 = new Pora(p1, new Zmogus("Kazys"));
//        Pora p3 = new Pora(p1, p2);
//
//        System.out.println(z1.getNumber() + ". " + z1.vardasPoroje());
//        System.out.println(z2.getNumber() + ". " + z2.vardasPoroje());
//        System.out.println(p1.getNumber() + ". " + p1.vardasPoroje());
//        System.out.println(p2.getNumber() + ". " + p2.vardasPoroje());
//        System.out.println(p3.getNumber() + ". " + p3.vardasPoroje());
//
//        Zaidejas a1 = z1; //
//        Zaidejas a2 = p1;

        Zaidejas[] zaidejai = pradiniaiDuomenys();
        int etapas = 1;

        do {
            zaidejai = etapas(zaidejai);
            printEtapas(etapas, zaidejai);
            etapas++;
        } while (zaidejai.length > 1);

        // Zaidejas zzz = new Zaidejas();

    }

    private static void fileMode(String filename) {
        // patikrinam ar failas is viso yra
        try {
            Reader reader = new FileReader(filename, StandardCharsets.UTF_8);

            String filenameOut = filename + ".out";
            Writer writer = new FileWriter(filenameOut);

            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                if (c == '\n') {                           //jei eil pabaiga
                    // System.out.println("Eil pabaiga");
                    writer.write(sb.toString() + "\n");
                    sb = new StringBuilder();             // sukuriam nauja
                } else {    // nesibaige eil
                    sb.append((char) c);                          // dadedam nuskaityta simboli
                }
            }
            reader.read();

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // 1 atidaryt ivedimo faila skaitymui
        // 2 atidaryt isvedimo faila rasymui
        // 3 kol nesibaige ivedimo failas
        //      skaityti 1 eilute is failo
        //      irasyti rez i isvedimo faila
        // pabaiga
    }

    static Zaidejas[] pradiniaiDuomenys() {
        Zaidejas[] zaidejai = new Zaidejas[] {
                new Zmogus("A1"),
                new Zmogus("A2"),
                new Zmogus("A3"),
                new Zmogus("A4"),
                new Zmogus("A5"),
                new Zmogus("A6"),
                new Zmogus("A7"),
                new Zmogus("A8")
        };
        System.out.println("Zaidejai: ");
        for (Zaidejas z : zaidejai) {
            System.out.println("  " + z.getNumber() + ". " + z.laimetojas());
        }
        return zaidejai;
    }

    static Zaidejas[] etapas(Zaidejas[] zaidejai) {
        Zaidejas[] naujas = new Zaidejas[zaidejai.length / 2];

        for (int i = 0; i < naujas.length; i++) {
            int x = 2 * i;
            naujas[i] = new Pora(zaidejai[x], zaidejai[x + 1]);
        }

        return naujas;
    }

    static void printEtapas(int nr, Zaidejas[] zaidejai) {
        System.out.println("Ratas " + nr);
        for (Zaidejas z : zaidejai) {
            System.out.println("  " + z.getNumber() + ". " + z.vardasPoroje());
        }
    }
}

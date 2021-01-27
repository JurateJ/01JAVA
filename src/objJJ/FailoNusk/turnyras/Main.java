package objJJ.FailoNusk.turnyras;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {

        if (args.length == 1) {
            fileMode(args[0]);
        } else {
            System.err.println("Klaida - nera failo");
        }
        System.out.println("Pabaiga");

        Zaidejas[] zaidejai = pradiniaiDuomenys();
        int etapas = 1;

        do {
            zaidejai = etapas(zaidejai);
            printEtapas(etapas, zaidejai);
            etapas++;
        } while (zaidejai.length > 1);
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
                if (c == '\n') {
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

package objJJ.p06.figuros;

public class Main {
    public static void main(String[] args) {
        Apskritimas apskritimas = new Apskritimas();
        apskritimas.setSpindulys(10);

        System.out.println(apskritimas);

        Apskritimas apskritimas2 = new Apskritimas();
        apskritimas2.setSpindulys(10);

        System.out.println(apskritimas == apskritimas2);
        System.out.println(apskritimas.equals(apskritimas2));
    }

}

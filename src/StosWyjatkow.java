public class StosWyjatkow {
    public void metoda1(){
        System.out.println("Metoda 1");
        try {
            metoda2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void metoda2() throws Exception{
        System.out.println("Metoda 2");
        metoda3();
    }

    public void metoda3() throws Exception{
        System.out.println("Metoda 3");
        throw new Exception("expection ss");
//        metoda4();
    }

    public void metoda4(){
        System.out.println("Metoda 4");
        throw new RuntimeException("LLLLL");

    }
}

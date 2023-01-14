class TestEnceinte {

    Enceinte[] enceintes = new Enceinte[] {
            new Cercle(5.0),
            new Carre(10.0)
    };

    void test() {
        for (Enceinte e : enceintes)
            System.out.printf("surface = %.1f, périmètre = %.1f\n",
                    e.surface(), e.perimetre());

    }
    public static void main(String[] args) {
        new TestEnceinte().test();
    }
}
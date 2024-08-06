public class Main {
    public static void main(String[] args) {
        Adulto responsavel = new Adulto("Carlos", 35, "C001", "123.456.789-00");
        Crianca crianca1 = new Crianca("João", 8, "C002", "223.456.789-01", responsavel);
        Crianca crianca2 = new Crianca("Maria", 5, "C003", "323.456.789-02", responsavel);
                   
        Brinquedo CasaDoHorror = new Brinquedo("Casa dos Gritos", 8, 12);
        Brinquedo MontanhaRussa = new Brinquedo("Montanha Russa", 12, 45);
        Brinquedo RodaGigante = new Brinquedo("Roda Gigante", 5, 10);
        Brinquedo Carrosel = new Brinquedo("Carrosel", 10, 15);

        Pacote pacoteTempo = new PacoteTempo(crianca1, 5);
        Pacote pacoteBrinquedo = new PacoteBrinquedo(crianca2, 10);
        

        pacoteTempo.usarBrinquedo(CasaDoHorror);
        pacoteTempo.usarBrinquedo(RodaGigante);
        pacoteTempo.usarBrinquedo(MontanhaRussa);
        pacoteTempo.usarBrinquedo(Carrosel);


        pacoteBrinquedo.usarBrinquedo(CasaDoHorror);
        pacoteBrinquedo.usarBrinquedo(RodaGigante);
        pacoteBrinquedo.usarBrinquedo(MontanhaRussa);
        pacoteBrinquedo.usarBrinquedo(Carrosel);
    }
}

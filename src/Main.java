public class Main {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new BankAccount(300);
        accounts[1] = new BankAccount(300);
        accounts[2] = new BankAccount(300);
        accounts[3] = new BankAccount(300);
        accounts[4] = new BankAccount(300);
        System.out.println(accounts[0].getData());


        Country[] countries = new Country[5];
        countries[0] = new Country(500);
        countries[1] = new Country(500);
        countries[2] = new Country(500);
        countries[3] = new Country(500);
       countries[4] = new Country(500);
   System.out.println(countries[0].getData());




        Measurer meas = new Measurer();
        System.out.println(meas.summer(accounts));
       System.out.println("This is for Banks: "+ meas.average(accounts));
       System.out.println("This is for Countries: "+ meas.average(countries));
       System.out.println(meas.summer(countries));

        System.out.println("**************************************************************************");
        Minimarket[] markets = new Minimarket[7];
        for (int i = 0; i <markets.length; i++) {
            markets[i] = new Minimarket( (100)+ (100)* i +3);
        }
        System.out.println(meas.summer(markets));
        System.out.println(meas.average(markets));
        System.out.println(markets[0].getData());
    }
}

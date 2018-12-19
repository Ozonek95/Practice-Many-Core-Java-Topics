package pl.sda.exceptions;

import java.util.Random;

public class RandomExceptionApp {
    public static void main(String[] args) {

        RandomExceptionApp randomExceptionApp = new RandomExceptionApp();
        try {
            randomExceptionApp.thrower();
        } catch (FirstException e) {
            System.out.println(e.getMessage()+" "+e.getErrorCode());
        } catch (SecondException e) {
            System.out.println(e.getMessage()+" "+e.getErrorCode());
        } catch (ThirdException e) {
            System.out.println(e.getMessage()+" "+e.getErrorCode());
        }

    }


    public void thrower() throws FirstException,SecondException,ThirdException{
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (randomNumber){
            case 0:
                throw new FirstException("Pierwszy wyjątek rzucam",1);
            case 1:
                throw new SecondException("Drugi wyjątek rzucam",2);
            case 2:
                throw new ThirdException("Rzucam trzeci wyjątek",3);


        }

    }
}


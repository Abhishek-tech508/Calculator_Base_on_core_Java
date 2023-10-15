public class Calculator {
        public double add=0;
        public double subtract=0;
        public double multiplication=0;
        public double division=0;
        public void addition(double a,double b){
            if (a>5000||a<-5000||b>5000||b<-5000){
                System.out.println("You can't add because maximum input is 5000" );
                if (a>5000){
                    System.out.println("First number is greater than 5000");
                }

                if (b>5000){
                    System.out.println("Second Number is greater than 5000");
                }
                if (a<-5000){
                    System.out.println("First Number is less than -5000 ");
                }
                if (b<-5000){
                    System.out.println("Second Number is less than -5000 ");
                }

            }

            else {
                add += a + b;
                System.out.println("The addition will be "+"\n" + ""+a+" + "+b+" = "+add);
            }

        }
        public void subtraction(double a,double b){
            if (a<=-10000||a>=10000||b<-10000||b>=10000){
                System.out.println("You can't Subtract because maximum input is 10000" );
                if (a>10000){
                    System.out.println("First number is greater than 10000");
                }

                if (b>10000){
                    System.out.println("Second Number is greater than 10000");
                }

            }
            else {
                subtract += a-b;
                System.out.println("The subtraction will be "+"\n" + ""+a+" - "+b+" = "+subtract);
            }
        }
        public void multiplication(double a,double b){
            if (a<=-5000||a>=5000||b<-5000||b>=5000){
                System.out.println("You can't Subtract because maximum input is 5000" );
                if (a>5000){
                    System.out.println("First number is greater than 5000");
                }

                if (b>5000){
                    System.out.println("Second Number is greater than 5000");
                }

            }
            else {
                multiplication += a*b;
                System.out.println("The multiplication will be "+"\n" + ""+a+" * "+b+" = "+multiplication);
            }
        }
        public void division(double a,double b){
            if (b==0){
                System.out.println("you can't divide by 0");
            }
            else {
                division += a/b;
                System.out.println("The division will be "+"\n" + ""+a+" / "+b+" = "+division);
            }
        }

}

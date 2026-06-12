public class Day7_p {
    class Payment {
        String name;

        void transfer() {
            System.out.println("Payment successfull");
        }
    }

    class Upipayment extends Payment {
        @Override
        void transfer() {
            System.out.println("Upipayment successfull");
        }
    }

    class Cardpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("Cardpayment successfull");
        }
    }

    class NBpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("NBpayment successfull");
        }
    }

    void main(String[] args) {
        Upipayment upipayment = new Upipayment();
        upipayment.transfer();

        Cardpayment cardpayment = new Cardpayment();
        cardpayment.transfer();

        NBpayment nBpayment = new NBpayment();
        nBpayment.transfer();
    }
}


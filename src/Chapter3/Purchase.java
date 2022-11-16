package Chapter3;

    public class Purchase {


        public int productOf(int copy) {
            int price = 2000;
            if (copy <= 4) {
            }
            return copy * price;
        }

        public int product2Of(int copy) {
            if (copy <= 9) {
            }
            int price = 1800;
            return copy * price;
        }

        public int product3Of(int copy) {
            if (copy <= 29) {
            }
            int price = 1600;
            return copy * price;
        }

        public int product4Of(int copy) {
            if (copy <= 49) {
            }
            int price = 1500;
            return copy * price;
        }

        public int product5Of(int copy) {
            if (copy <= 99) {
            }
            int price = 1300;
            return copy * price;
        }

        public int product6Of(int copy) {
            if (copy <= 199) {
            }
            int price = 1200;
            return copy * price;
        }

        public int product7Of(int copy) {
            if (copy <= 499) {
            }
            int price = 1100;
            return copy * price;

        }

        public int product8Of(int copy) {
            if (copy >= 500) {
            }
            int price = 1000;
            return copy * price;


        }
    }

}

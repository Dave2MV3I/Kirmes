public class MainControl {

    public static void main(String[] args) {
        new MainControl();
    }

    // Attribute

    // Referenzen
        private Attraction attraction1, attraction2, attraction3;
        private Visitor visitor1, visitor2, visitor3;

    // Konstruktor
        public MainControl() {
            attraction1 = new Attraction("Karussell", 2);
            attraction2 = new Attraction("Achterbahn", 5);
            attraction3 = new Attraction("Schiessbude", 3);
            visitor1 = new Visitor("Mickey", 15);
            visitor2 = new Visitor("Dagobert", 4000);
            visitor3 = new Visitor("Kevin", 8);
            simulateVisitors();
            printState();
        }

    // Methoden
        public void simulateVisitors(){
            visitor1.visitAttraction(attraction1);
            visitor2.visitAttraction(attraction1);
            visitor3.visitAttraction(attraction3);

            visitor1.visitAttraction(attraction3);
            visitor2.visitAttraction(attraction2);
            visitor3.visitAttraction(attraction1);

            getPossibleAttractions(visitor1);
        }

        public void printState(){
            System.out.println("Besucher 1, 2 und 3 haben " + visitor1.getState() + " €, " + visitor2.getState() + " €, " + visitor3.getState() + " € übrig.");
        }

        private void getPossibleAttractions(Visitor visitor){
            if ( visitor.getMoney() >= attraction1.getPrice()) System.out.println(visitor.getName()+" kann Attraktion "+attraction1.getName()+ " besuchen.");
            if ( visitor.getMoney() >= attraction2.getPrice()) System.out.println(visitor.getName()+" kann Attraktion "+attraction2.getName()+ " besuchen.");
            if ( visitor.getMoney() >= attraction3.getPrice()) System.out.println(visitor.getName()+" kann Attraktion "+attraction3.getName()+ " besuchen.");
        }
}

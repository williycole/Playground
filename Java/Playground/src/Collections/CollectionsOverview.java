package Collections;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class CollectionsOverview {
//    public static void MiscPuzzles.ShiftToLeft(String[] args) {
//        Theatre theatre = new Theatre("Olympian", 8, 12);
////        theatre.getSeats();
////        if(theatre.reserveSeat("H11")) {
////            System.out.println("Please pay");
////        } else {
////            System.out.println("Seat is taken.");
////        }
//        ////This is an example of a shallow copy, aka its the same data that's getting modified
//        List<Theatre.Seat> listOfSeats = new ArrayList<>(theatre.seats);
//        printList(listOfSeats);
//        listOfSeats.get(1).reserved();
//        if (theatre.reserveSeat("A02")){
//            System.out.println("Please pay for A02..");
//        } else {
//            System.out.println(".....Seat already reserved");
//        }
////        Collections.reverse(listOfSeats);
//        Collections.shuffle(listOfSeats);
//        System.out.println("Printing theater.seat");
//        printList(listOfSeats);
//
//        Theatre.Seat minSeat = Collections.min(listOfSeats);
//        Theatre.Seat maxSeat = Collections.max(listOfSeats);
//        System.out.println("minSeat: " + minSeat.getSeatNumber() + ", maxSeat: " + maxSeat.getSeatNumber());
//        sortList(listOfSeats);
//        System.out.println("Printing sorted listOfSeats");
//        printList(listOfSeats);
//
//        ////Wonky Collections method that doesn't really work very well
//        ////List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        ////Collections.copy(newList, theatre.seats);
//    }
//    public static void printList(List<Theatre.Seat> seatList){
//        for (Theatre.Seat seat : seatList) {
//            System.out.print(" " + seat.getSeatNumber());
//        }
//        System.out.println();
//        System.out.println("===========================END");
//    }
//    ////Custom sort method, Collections has a builtin sort Method
//    public static void sortList(List<? extends  Theatre.Seat> sortedList) {
//        for (int i = 0; i < sortedList.size() -1; i++) {
//            for (int j = i + 1; j < sortedList.size(); j++) {
//                if (sortedList.get(i).compareTo(sortedList.get(j)) > 0){
//                    Collections.swap(sortedList, i, j);
//                }
//            }
//        }
//    }
//
//
//    //Made static to use MiscPuzzles.ShiftToLeft here
//    public static class Theatre {
//        private final String theatreName;
//        public List<Seat> seats = new ArrayList<>();
//
//        public Theatre(String theatreName, int numRows, int seatsPerRow) {
//            this.theatreName = theatreName;
//
//            int lastRow = 'A' + (numRows - 1);
//            for (char row = 'A'; row <= lastRow; row++) {
//                for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
//                    Seat seat = new Seat(row + String.format("%02d", seatNum));
//                    seats.add(seat);
//                }
//            }
//        }
//
//        public String getTheatreName() {
//            return theatreName;
//        }
//
//        public boolean reserveSeat(String seatNumber) {
//            Seat requestedSeat = new Seat(seatNumber);
//            int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//            if(foundSeat >= 0){
//                return seats.get(foundSeat).reserved();
//            } else{
//                System.out.println("there is no seat " + seatNumber);
//                return false;
//            }
//////            This is the brute force way of searching through the array as compared to the implements Comparable that is currently being used and is way more efficient
//////            for (Seat seat : seats) {
//////                System.out.print(".");
//////                if (seat.getSeatNumber().equals(seatNumber)) {
//////                    requestedSeat = seat;
//////                    break;
//////                }
//////            }
//////            if (requestedSeat == null) {
//////                System.out.println("There is no seat " + seatNumber);
//////                return false;
//////            }
//////            return requestedSeat.reserved();//true or false value from methods below
//        }
//
//        public void getSeats() {
//            for (Seat seat : seats) {
//                System.out.println(seat.getSeatNumber());
//            }
//        }
//
//        public class Seat implements Comparable<Seat>{
//            private final String seatNumber;
//            private boolean reserved = false;
//
//            public Seat(String seatNumber) {
//                this.seatNumber = seatNumber;
//            }
//
//            public String getSeatNumber() {
//                return seatNumber;
//            }
//
//            @Override
//            public int compareTo(Seat seat) {
//                return this.seatNumber.compareTo(seat.getSeatNumber());
//            }
//
//            public boolean reserved() {
//                if (!this.reserved) {
//                    this.reserved = true;
//                    System.out.println("Seat " + seatNumber + " reserved.");
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//
//            public boolean cancel() {
//                if (this.reserved) {
//                    this.reserved = false;
//                    System.out.println("Reservation of seat " + seatNumber + " canceled. ");
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        }
//    }
}

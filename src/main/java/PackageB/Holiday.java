package PackageB;

import PackageA.Trip;

public class Holiday {
    public static void main(String[] args) {
        Trip trip_1 = new Trip();
        Trip trip_2 = new Trip();
        Trip trip_3 = new Trip();

        trip_1.noOfPlannedDays=2;
        trip_1.location="Eiffel Tower";

        trip_2.noOfPlannedDays=1;
        trip_2.location="Notre Dame Cathedral";

        trip_3.noOfPlannedDays=5;
        trip_3.location="Louvre Museum";

        System.out.println("Trip 1 : location - " +trip_1.location+ " and planned number of days "+trip_1.noOfPlannedDays+" | Trip 2 : location - "+trip_2.location+" and planned number of days "+trip_2.noOfPlannedDays+" | Trip 3 : location - "+trip_3.location+" and planned number of days "+trip_3.noOfPlannedDays);

    }
}

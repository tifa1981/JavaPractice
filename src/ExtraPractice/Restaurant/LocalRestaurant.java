package ExtraPractice.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {



        Server server1 = new Server("Dave", 2311, 15, true);
        Server server2 = new Server("Nancy",2312, 15, false);
        Server server3 = new Server("Nathen", 2313, 13.5, true);
        Server server4 = new Server("Alex",2314, 15, false);
        Server server5 = new Server("Sophia", 2315, 14.5, true);


        Server[] servers ={server1,server2,server3,server4,server5};
        System.out.println(Arrays.toString(servers));
        System.out.println("============================================");


        Chef chef1 = new Chef("McFay", 2356, 45, true);
        Chef chef2 = new Chef("Bob", 2357, 56,false);
        Chef chef3 = new Chef("Michael", 2358, 60, true);

       Chef[] chefs = {chef1,chef2,chef3};
        System.out.println(Arrays.toString(chefs));
        System.out.println("===============================================");

        Restaurant restaurant1 = new Restaurant("Tifa", "Arlington",5);

        restaurant1.hireChef(chefs);
        restaurant1.hireServer(servers);
        System.out.println(restaurant1);










    }
}

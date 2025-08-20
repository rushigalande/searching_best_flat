package com.flat.search;

public class Calculat {


    public int flatA(int rent,int travel_cost, int time_cost, int location_advantage){

        int t_cost = travel_cost * 10 * 20 * 2;
        int time = time_cost * 5 * 20 * 2;

        return  rent + t_cost + time - location_advantage;
    }

    public int flatB(int rent,int travel_cost, int time_cost, int location_advantage){

        int t_cost = travel_cost * 10 * 20 * 2;
        int time = time_cost * 5 * 20 * 2;

        return  rent + t_cost + time - location_advantage;
    }

    public int flatC(int rent,int travel_cost, int time_cost, int location_advantage){

        int t_cost = travel_cost * 10 * 20 * 2;
        int time = time_cost * 5 * 20 * 2;

        return  rent + t_cost + time - location_advantage;
    }

}

import com.flat.search.Calculat;

public class Main {
    public static void main(String[] args) {


        Calculat calculat = new Calculat();

        int total_cost_flat_a = calculat.flatA(10000,2,15,500);

        int total_cost_flat_b = calculat.flatB(12000,1,15,100);

        int total_cost_flat_c = calculat.flatC(11000,4,20,1500);


        System.out.println("Total cost of flat A is : " + total_cost_flat_a);
        System.out.println("Total cost of flat B is : " + total_cost_flat_b);
        System.out.println("Total cost of flat C is : " + total_cost_flat_c);
        System.out.println();





        if(total_cost_flat_a < total_cost_flat_b && total_cost_flat_a < total_cost_flat_c){

            System.out.println("Best choice is Flat A with total cost = Rs. " + total_cost_flat_a);

        } else if (total_cost_flat_b < total_cost_flat_a && total_cost_flat_b < total_cost_flat_c) {

            System.out.println("Best choice is Flat B with total cost = Rs. " + total_cost_flat_b);
        }else {

            System.out.println("Best choice is Flat C with total cost = Rs. " + total_cost_flat_c);
        }


    }
}
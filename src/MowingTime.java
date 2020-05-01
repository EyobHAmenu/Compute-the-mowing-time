import java.util.Scanner;

public class MowingTime {
    public static void main(String[] args) {

        /*
            Prompt operator for block_length, block_width
            Get block_length, block_width
            block_area = block_length * block_width
            Prompt operator for house_length, house_width
            Get house_length, house_width
            house_area = house_length * house_width
            mowing_area = block_area – house_area
            mowing _time = mowing_area/2
            Output mowing_time to screen
            END
         */
        double block_length;
        double block_width;
        double block_area;
        double house_length;
        double house_width;
        double house_area;
        double mowing_area;
        double mowing_time;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter block length: ");
        block_length = in.nextDouble();
        System.out.print("Enter block width: ");
        block_width = in.nextDouble();
        block_area = block_length * block_width;

        System.out.print("Enter house length: ");
        house_length = in.nextDouble();
        System.out.print("Enter house width: ");
        house_width = in.nextDouble();
        house_area = house_length * house_width;

        mowing_area = block_area - house_area;
        mowing_time = mowing_area / 2;
        System.out.println(mowing_time);

    }
}

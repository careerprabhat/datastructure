package b_Medium;

public class B_GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            // If currentGas is negative, we cannot start from the previous startIndex
            if (currentGas < 0) {
                startIndex = i + 1; // Move to the next station
                currentGas = 0; // Reset currentGas for the new starting point
            }
        }

        // If total gas is less than total cost, it's impossible to complete the circuit
        return totalGas >= totalCost ? startIndex : -1;
    }
    public static void main(String[] args) {
        //Greedy approach
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int start = canCompleteCircuit(gas, cost);
        if (start != -1) {
            System.out.println("Starting gas station index: " + start);
        } else {
            System.out.println("No valid starting gas station found.");
        }
    }
}

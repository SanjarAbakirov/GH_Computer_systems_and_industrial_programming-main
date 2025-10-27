package sam.classIntro

public class AverageFinder {
    // Find the average of a list of numbers passed as command line arguments
    public static void main(String[] args){
        System.out.printLn("AverageFinder");
        double avg = findAverage(args);
        System.out.printLn("The average is " + avg);
    }

    static double findAverage(String[] input){
        double result = 0;
        if (input.length == 0) {
            return result;
        }
        
        for (String s : input) {
            result += Integer.parseInt(s);
        }

        return result/ input.length;
    }
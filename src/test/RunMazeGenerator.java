package test;
import algorithms.mazeGenerators.*;
import jdk.jfr.Unsigned;

import java.io.ByteArrayOutputStream;

public class RunMazeGenerator {
    public static void main(String[] args) throws Exception {
        testMazeGenerator(new EmptyMazeGenerator());
        testMazeGenerator(new SimpleMazeGenerator());
        testMazeGenerator(new MyMazeGenerator());
    }
    private static void testMazeGenerator(IMazeGenerator mazeGenerator) throws Exception {
// prints the time it takes the algorithm to run System.out.println(String.format("Maze generation time(ms): %s", mazeGenerator.measureAlgorithmTimeMillis(100/*rows*/,100/*columns*/)));
// generate another maze
        Maze maze = mazeGenerator.generate(10/*rows*/, 10/*columns*/);
// prints the maze
        maze.print();
// get the maze entrance
        Position startPosition = maze.getStartPosition();
// print the start position
        System.out.println(String.format("Start Position: %s", maze.getStartPosition())); // format "{row,column}"
// prints the maze exit position
        System.out.println(String.format("Goal Position: %s", maze.getGoalPosition()));

        byte[] x = maze.toByteArray();
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]&0xff);
        }
    }
}
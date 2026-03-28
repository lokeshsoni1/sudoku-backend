package com.lokesh.sudoku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Radha Swami" +
                "Hello Lokesh Bhai 🔥, Ye mera First Backend Project haiii";
    }

    @PostMapping("/solve")
    public int[][] solve(@RequestBody SudokuRequest request) {

        int[][] board = request.getBoard();
        Solver solver = new Solver();
        solver.solve(board);

        return board;
    }
}

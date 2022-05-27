package benchmarks;

import impl.RedBlackTree;
import impl.RedBlackTreeImpl;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.util.UUID;

public class Benchmarks {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void addIntegerBenchmark() {
        RedBlackTree tree = new RedBlackTreeImpl();
        for (int i = 0; i < 1000000; i++) {
            tree.add(i);
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void addUUIDBenchmark() {
        RedBlackTree tree = new RedBlackTreeImpl();
        for (int i = 0; i < 1000000; i++) {
            tree.add(UUID.randomUUID());
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1, warmups = 1)
    public void addStringBenchmark() {
        RedBlackTree tree = new RedBlackTreeImpl();
        for (int i = 0; i < 1000000; i++) {
            tree.add(UUID.randomUUID().toString());
        }
    }
}

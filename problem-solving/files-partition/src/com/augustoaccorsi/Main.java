package com.augustoaccorsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] parent = {-1,0,0,0};
        int[] files = {10,11,10,10};
        List<Integer> parentList = Arrays.stream(parent).boxed().toList();
        List<Integer> filesList = Arrays.stream(files).boxed().toList();

        System.out.println(mostBalancedPartition(parentList, filesList));
    }

    public static int mostBalancedPartition(List<Integer> parent, List<Integer> fileSizes) {
        DirectedGraph graph = new DirectedGraph();
        for (int index = 0 ; index < parent.size() ; index++) {
            graph.addVertex(index, fileSizes.get(index));
            if (index != 0) {
                graph.addEdge(parent.get(index), index);
            }
        }
        return graph.mostBalancedPartition();
    }

    private static class DirectedGraph {
        Map<Integer, Vertex> vertices = new HashMap<>();
        private long diskSize;

        private static class Vertex {
            private final int fileSize;
            private long totalMemoryRequired;
            Set<Vertex> edges = new HashSet<>();

            Vertex(int fileSize) {
                this.fileSize = fileSize;
            }

            void addEdge(Vertex to) {
                this.edges.add(to);
            }
        }

        public void addVertex(int data, int fileSize) {
            vertices.put(data, new Vertex(fileSize));
        }

        public void addEdge(int from, int to) {
            Vertex fromVertex = vertices.get(from);
            fromVertex.addEdge(vertices.get(to));
        }

        int mostBalancedPartition() {
            computeFileDataDistribution();
            return mostBalancedPartition(vertices.get(0));
        }

        private void computeFileDataDistribution() {
            diskSize = computeFileDataDistribution(vertices.get(0));
        }

        private long computeFileDataDistribution(Vertex current) {
            long totalMemoryRequired = current.fileSize;
            for (Vertex child : current.edges) {
                totalMemoryRequired += computeFileDataDistribution(child);
            }
            current.totalMemoryRequired = totalMemoryRequired;
            return current.totalMemoryRequired;
        }

        private int mostBalancedPartition(Vertex current) {
            int result = Integer.MAX_VALUE;
            for (Vertex child : current.edges) {
                result = Math.min(result, mostBalancedPartition(child));
                result = (int) Math.min(result, Math.abs(diskSize - 2 * child.totalMemoryRequired));
            }
            return result;
        }
    }
}

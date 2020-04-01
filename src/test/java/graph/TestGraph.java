package graph;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class TestGraph {
  @Test public void testToString() {
    Graph g = new SimpleGraph(5, new int[][] {{0, 3}, {0, 1}, {3, 1},});
    assertThat(g.toString()).isEqualTo(
        "Vertex 0, outgoing edges:\n"
        + "\t0 -> 3\n"
        + "\t0 -> 1\n"
        + "Vertex 1\n"
        + "Vertex 2\n"
        + "Vertex 3, outgoing edges:\n"
        + "\t3 -> 1\n"
        + "Vertex 4\n");
  }

  @Test public void testNeighbours() {
    Graph g = new SimpleGraph(5, new int[][] {{0, 3}, {0, 1}, {3, 1},});
    assertThat(g.neighbours(0)).containsExactly(1, 3);
    assertThat(g.neighbours(1)).containsExactly();
    assertThat(g.neighbours(3)).containsExactly(1);
  }
}

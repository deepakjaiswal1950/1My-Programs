import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BuildHeap {
    private int[] data;
    private List<Swap> swaps;

    private FastScanner in;
    private PrintWriter out;

    public static void main(String[] args) throws IOException {
        new BuildHeap().solve();
    }

    private void readData() throws IOException {
        int n = in.nextInt();
        data = new int[n];
        for (int i = 0; i < n; ++i) {
          data[i] = in.nextInt();
        }
    }

    private void writeResponse() {
        out.println(swaps.size());
        for (Swap swap : swaps) {
          out.println(swap.index1 + " " + swap.index2);
        }
    }

    private void generateSwaps() {
      swaps = new ArrayList<Swap>();
      // The following naive implementation just sorts 
      // the given sequence using selection sort algorithm
      // and saves the resulting sequence of swaps.
      // This turns the given array into a heap, 
      // but in the worst case gives a quadratic number of swaps.
      for (int i = 0; i < data.length; ++i) {
        for (int j = i + 1; j < data.length; ++j) {
          if (data[i] > data[j]) {
            swaps.add(new Swap(i, j));
            int tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
          }
        }
      }
    }
	
	private void fastGenerateSwaps() {
		swaps = new ArrayList<Swap>();
		for (int i = data.length/2; i >= 0; i--) {
			SiftDown(i);
		}
	}
	
	private void SiftDown(int i) {
		int minIndex = i;
		int l = 2*i + 1;
		if(l < data.length && data[l] < data[minIndex])
			minIndex = l;
		int r = 2*i + 2;
		if(r < data.length && data[r] < data[minIndex])
			minIndex = r;
		if(i != minIndex) {
			swaps.add(new Swap(i, minIndex));
			int tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
			SiftDown(minIndex);
		}
	}

    public void solve() throws IOException {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        readData();
        // generateSwaps();
		fastGenerateSwaps();
        writeResponse();
        out.close();
    }

    static class Swap {
        int index1;
        int index2;

        public Swap(int index1, int index2) {
            this.index1 = index1;
            this.index2 = index2;
        }
    }

    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tokenizer = null;
        }

        public String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
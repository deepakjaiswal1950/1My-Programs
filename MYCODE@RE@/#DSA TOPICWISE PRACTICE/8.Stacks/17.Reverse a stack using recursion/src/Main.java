import java.util.Stack;


public class Main {

    // using Stack class for stack implementation
    static Stack<Character> st = new Stack<>();

    // inserts an element at the bottom of a stack.
    static void insert_at_bottom(char x) {

        if(st.isEmpty())
            st.push(x);

        else {

            // All items are held in Function Call Stack until we reach end
            // of the stack. When the stack becomes empty, the st.size() becomes 0, the
            // above if part is executed and the item is inserted at the bottom
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);

            // push all the items held in Function Call Stack
            // once the item is inserted at the bottom
            st.push(a);
        }

    }

    // Function that reverses the given stack using insert_at_bottom()
    static void reverse() {

        if(st.size() > 0) {

            // Hold all items in Function Call Stack until we
            // reach end of the stack  
            char x = st.peek();
            st.pop();
            reverse();

            // Insert all the items held in Function Call Stack
            // one by one from the bottom to top. Every item is
            // inserted at the bottom  
            insert_at_bottom(x);

        }
    }

    // Driver Code 
    public static void main(String[] args) {

        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");
        System.out.println(st);


        reverse();
        System.out.println("Reversed Stack");
        System.out.println(st);
    }
} 
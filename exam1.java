import java.util.*;

class StackUnderflowException extends Exception {
    public StackUnderflowException(String msg) {
        super(msg);
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String msg) {
        super(msg);
    }
}

public class exam1 {
    public static void main(String args[]) {
        int pos, ch;
        Scanner obj = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        
        do {
            System.out.println("STACK");
            System.out.println("1.ADD ");
            System.out.println("2.REMOVE ");
            System.out.println("3.DISPLAY ");
            System.out.println("0.EXIT");
            System.out.print("Select your Option: ");
            ch = obj.nextInt();
            
            try {
                switch (ch) {
                    case 1:
                        System.out.print("Enter the Element to be inserted (between 5 and 1000): ");
                        int element = obj.nextInt();
                        
                        if (element >= 5 && element <= 1000) {
                            if (stack.size() >= 5) {
                                throw new StackOverflowException("Stack is full. Cannot insert more elements.");
                            }
                            stack.push(element);
                            System.out.println("Inserted to the Stack.");
                        } else {
                            throw new IllegalArgumentException("Element not in the range (5-1000).");
                        }
                        break;
                        
                    case 2:
                        if (stack.isEmpty()) {
                            throw new StackUnderflowException("Stack is empty. Nothing to remove.");
                        }
                        
                        System.out.print("Enter the position of the element to remove (0 for top): ");
                        pos = obj.nextInt();
                        
                        if (pos == 0) {
                            stack.pop();
                            System.out.println("Element removed from the Stack.");
                        } else {
                            throw new IllegalArgumentException("Invalid position. Element not removed.");
                        }
                        break;
                        
                    case 3:
                        System.out.println("Stack contents: " + stack);
                        break;
                        
                    case 0:
                        System.out.println("Exiting the program.");
                        break;
                        
                    default:
                        throw new IllegalArgumentException("Invalid option.");
                }
            } catch (StackUnderflowException e) {
                System.out.println(e.getMessage());
            } catch (StackOverflowException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (ch != 0);
    }
}

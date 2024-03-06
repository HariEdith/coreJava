package learn06;
public class Builder{
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuilder sb = new StringBuilder();

        // Appending strings to the buffer
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        // Displaying the content of the buffer
        System.out.println("Content of StringBuilder: " + sb);

        // Inserting a string at a specific position
        sb.insert(5, " Java");

        // Displaying the updated content of the buffer
        System.out.println("Updated Content of StringBuilder: " + sb);

        // Reversing the content of the buffer
        sb.reverse();

        // Displaying the reversed content of the buffer
        System.out.println("Reversed Content of StrinBuilder: " + sb);
    }
}

import java.util.Scanner;

public class SimpleLinkedList {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        MyQueue mq=new MyQueue();

        System.out.println("Linked List Operations");
        System.out.println("1. Insertion in beginning");
        System.out.println("2. Insertion at ending");
        System.out.println("3. Inserting on particular position");
        System.out.println("4. Deleting a particular node");
        System.out.println("5. Size of linked List");
        System.out.println("6. Empty or not");
        System.out.println("7. Display the linked list");
        for(int i=1;i<30;i++) {
            System.out.println("enter the choice");
        int choice=scn.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("enter the element to be inserted");
                    mq.insertToStart(scn.nextInt());
                    break;
                }
                case 2: {
                    System.out.println("Enter the element to be inserted");
                    mq.insertToEnd(scn.nextInt());
                    break;
                }
                case 3: {
                    System.out.println("Enter integer element to insert");
                    int num = scn.nextInt();
                    System.out.println("Enter position");
                    int pos = scn.nextInt();
                    if (pos <= 1 || pos > mq.getSize())
                        System.out.println("Invalid position\n");
                    else
                        mq.insertToPos(num, pos);
                    break;
                }
                case 4: {
                    System.out.println("Enter position");
                    int p = scn.nextInt();
                    if (p < 1 || p > mq.getSize())
                        System.out.println("Invalid position\n");
                    else
                        mq.deleteFromPos(p);
                    break;
                }
                case 5: {
                    System.out.println("Linked list is empty status = " + mq.isEmpty());
                    break;
                }
                case 6: {
                    System.out.println("Size of the Linked list = " + mq.getSize());
                    break;
                }
                case 7:
                {
                    mq.display();
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }

            System.out.println();
        }
    }
}

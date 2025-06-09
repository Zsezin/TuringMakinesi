import java.util.Scanner;

public class TuringMachinePINChecker {

    
    private static final String SYSTEM_PIN = "1234"; // Sistem PIN'i sabit olarak tanımlanır

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your 4-digit PIN code: ");
        String userPin = scanner.nextLine();

        // Girilen PIN format doğruluğu kontrolü
        if (!userPin.matches("\\d{4}")) {
            System.out.println("Invalid PIN format. Please enter 4 digits.");
            return;
        }

        
        String tapeInput = "#" + userPin + "#" + SYSTEM_PIN + "#"; // Bant oluşturur: #USERPIN#SYSTEMPIN#
        char[] tape = tapeInput.toCharArray();
        int head = 1; 

        System.out.println("\n--- Turing Machine Simulation Started ---");

        // Kullanıcı PIN'i ile sistem PIN'i karşılaştırılır
        while (tape[head] != '#') {
            int systemIndex = findSystemPINStart(tape);
            int currentSystemIndex = systemIndex + (head - 1); 

            char userDigit = tape[head];
            char systemDigit = tape[currentSystemIndex];

            // Bant durumu göster
            printTape(tape, head);

            if (userDigit != systemDigit) {
                System.out.println("Result: Incorrect PIN!");
                return;
            }

            
            tape[head] = 'X'; // kullanıcı PIN hanesini işaretle
            tape[currentSystemIndex] = 'Y'; // sistem PIN hanesini işaretle

            head++; 
        }

        // Tüm karakterler karşılaştırılıp ve eşleştiğinde verilecek çıktı için
        printTape(tape, head);
        System.out.println("Result: Correct PIN!");
    }

    
    private static int findSystemPINStart(char[] tape) {
        int hashCount = 0;
        for (int i = 0; i < tape.length; i++) {
            if (tape[i] == '#') {
                hashCount++;
                if (hashCount == 2) {
                    return i + 1;
                }
            }
        }
        return -1;
    }

    private static void printTape(char[] tape, int head) {
        for (int i = 0; i < tape.length; i++) {
            System.out.print(tape[i]);
        }
        System.out.println();

        for (int i = 0; i < head; i++) {
            System.out.print(" ");
        }
        System.out.println("^ (head)");
    }
}
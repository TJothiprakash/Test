package tcsnqt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncryptionforEspionage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a message: ");
		String input = sc.nextLine();
		System.out.println("Message without Encryption : " + input);
		String outputEncrypted = encryptedMessage(input);
		System.out.println("Encrypted Message : " + outputEncrypted);
	}

	private static String encryptedMessage(String input) {
		Map<Character, Character> encryptMap = new HashMap<>();
		// Define the character mappings as per the updated cipher information.
		char[] keys = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] values = { 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
				'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e' };

		for (int i = 0; i < keys.length; i++) {
			encryptMap.put(keys[i], values[i]);
		}

		// Encrypt the input message
		StringBuilder encryptedMessage = new StringBuilder();
		for (char inputChar : input.toCharArray()) {
			char encryptedChar = encrypt(inputChar, encryptMap);
			encryptedMessage.append(encryptedChar);
		}

		return encryptedMessage.toString();
	}

	public static Character encrypt(Character character, Map<Character, Character> encryptMap) {
		// Check if the character exists in the encryption map.
		if (encryptMap.containsKey(character)) {
			return encryptMap.get(character);
		}
		// If the character is not in the map, return the character itself.
		return character;
	}
}

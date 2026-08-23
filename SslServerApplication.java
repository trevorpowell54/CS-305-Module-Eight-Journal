package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

	@GetMapping("/hash")
	public String getChecksum() throws NoSuchAlgorithmException {

		// Static data used to generate the checksum
		String data = "Trevor Powell";

		// Create SHA-256 message digest
		MessageDigest digest = MessageDigest.getInstance("SHA-256");

		// Generate the hash using UTF-8 encoding
		byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

		// Convert the hash to hexadecimal
		StringBuilder checksum = new StringBuilder();

		for (byte b : hash) {
			checksum.append(String.format("%02x", b));
		}

		// Return checksum verification information
		return "<html>"
				+ "<body>"
				+ "<h1>Checksum Verification</h1>"
				+ "<p><strong>Data:</strong> " + data + "</p>"
				+ "<p><strong>Algorithm:</strong> SHA-256</p>"
				+ "<p><strong>Checksum:</strong> " + checksum + "</p>"
				+ "</body>"
				+ "</html>";
	}
}
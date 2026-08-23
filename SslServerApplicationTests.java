package com.snhu.sslserver;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SslServerApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
	}

	@Test
	void hashRouteReturnsChecksum() {

		String response = restTemplate.getForObject(
				"http://localhost:" + port + "/hash",
				String.class);

		assertNotNull(response);
		assertTrue(response.contains("Checksum Verification"));
		assertTrue(response.contains("Trevor Powell"));
		assertTrue(response.contains("SHA-256"));
		assertTrue(response.contains("Checksum:"));
	}
}
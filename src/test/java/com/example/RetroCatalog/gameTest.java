package com.example.RetroCatalog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class gameTest {
	
	VideoGame underTest = new VideoGame(1L, "name", "console", 1991, "genre", true);

	@Test
	public void shouldReturnID() {
		Long check = underTest.getId();
		assertEquals(check, 1L);
	}
}

package com.example.RetroCatalog;

public class VideoGame {

	private Long id;

	public VideoGame(Long id, String name, String console, int releaseYear, String genre, boolean inStock) {
		this.id = id;
	}

	public Long getId() {
		
		return id;
	}

}

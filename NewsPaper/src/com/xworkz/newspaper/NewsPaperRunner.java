package com.xworkz.newspaper;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.newspaper.dto.NewsPaperDTO;

public class NewsPaperRunner {

	public static void main(String[] args) {
		NewsPaperDTO newsPaper1 = new NewsPaperDTO("The Hindu", 16, "English", 10D, 30);
		NewsPaperDTO newsPaper2 = new NewsPaperDTO("Hindustan", 10, "Hindi", 4.5, 15);
		NewsPaperDTO newsPaper3 = new NewsPaperDTO("Hosa Digantha", 12, "Kannada", 5.6, 7);
		NewsPaperDTO newsPaper4 = new NewsPaperDTO("Sambad", 8, "Oriya", 3D, 30);
		NewsPaperDTO newsPaper5 = new NewsPaperDTO("Inquilab", 11, "Urdu", 2.5, 30);

		Set<NewsPaperDTO> news = new HashSet<NewsPaperDTO>();
		news.add(newsPaper1);
		news.add(newsPaper2);
		news.add(newsPaper3);
		news.add(newsPaper4);
		news.add(newsPaper5);

		news.forEach(System.out::println);
	}

}

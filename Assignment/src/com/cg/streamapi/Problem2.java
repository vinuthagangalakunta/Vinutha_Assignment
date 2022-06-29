package com.cg.streamapi;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class News {
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
}

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> News_list = new LinkedList<>();

		News_list.add(new News(12, "User1", "This is good", "Time spent well"));
		News_list.add(new News(12, "User2", "Well done budget", "Good Presentation"));
		News_list.add(new News(12, "User3", "Very well done", "This was amazing"));
		News_list.add(new News(13, "User1", "This was informational budget", "Liked the author"));

		// 4. NewsId with maximum comment
		System.out.println("News ID with maximum comment");
		News_list.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);

		// 5. Budget Count
		System.out.println("Counting the word budget in comment");
		int count = (int) News_list.stream().filter(x -> x.getCommentByUser().contains("budget")).count();
		System.out.println("No. of time word Budget Appeared: " + count);

		// 6. User with Maximum comment
		Optional<String> max = News_list.stream().map(News::getCommentByUser).max((i, j) -> i.compareTo(j));
		System.out.println(max.get());

		// 7. print get comment by user
		System.out.println("7.print get comment by user");
		News_list.stream().max(Comparator.comparing(News::getNewsId).reversed()).map(News::getCommentByUser)
				.ifPresent(System.out::println);

	}

}
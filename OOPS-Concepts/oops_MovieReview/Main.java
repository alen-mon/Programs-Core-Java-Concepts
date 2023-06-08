
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

	  Scanner sc = new Scanner(System.in);
	  ArrayList<Movie> movies = new ArrayList<>();
    boolean running = true;
    while (running) {
        System.out.println("Select an action:");
        System.out.println("1. Add a movie");
        System.out.println("2. Add a review for a movie");
        System.out.println("3. Display all reviews for a movie");
        System.out.println("4. Exit");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                System.out.println("Enter movie title:");
                String title = sc.nextLine();
                System.out.println("Enter movie director:");
                String director = sc.nextLine();
                System.out.println("Enter cast members (separated by commas):");
                String castInput = sc.nextLine();
                ArrayList<String> cast = new ArrayList<>(Arrays.asList(castInput.split(",")));

                Movie movie = new Movie(title, director, cast);
                movies.add(movie);
                System.out.println("Movie added successfully.");
                break;
            case 2:
                System.out.println("Enter movie title:");
                String movieTitle = sc.nextLine();
                Movie selectedMovie = null;
                for (Movie m : movies) {
                    if (m.getTitle().equals(movieTitle)) {
                        selectedMovie = m;
                        break;
                    }
                }
                if (selectedMovie != null) {
                    System.out.println("Enter review text:");
                    String reviewText = sc.nextLine();
                    System.out.println("Enter reviewer name:");
                    String reviewerName = sc.nextLine();
                    System.out.println("Enter rating (0.0 - 5.0):");
                    double rating = sc.nextDouble();
                    Review review = new Review(reviewText, reviewerName, rating);
                    selectedMovie.addReview(review);
                    System.out.println("Review added successfully.");
                } else {
                    System.out.println("Movie not found.");
                }
                break;
            case 3:
                System.out.println("Enter movie title:");
                String movieTitleToShow = sc.nextLine();
                Movie movieToShow = null;
                for (Movie m : movies) {
                    if (m.getTitle().equals(movieTitleToShow)) {
                        movieToShow = m;
                        break;
                    }
                }
                if (movieToShow != null) {
                    System.out.println("\nReviews for '" + movieToShow.getTitle() + "':");
                    for (Review review : movieToShow.getReviews()) {
                        System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
                    }
                } else {
                    System.out.println("Movie not found.");
                }
                break;
            case 4:
                running = false;
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    sc.close();
}
}


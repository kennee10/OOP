import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;

public class PageDownloader {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter the URL> ");
            String websiteURL = console.nextLine();

            try {
                URL url = new URL(websiteURL);
                try (Scanner webSc = new Scanner(url.openStream())) {
                    while (webSc.hasNext()) {
                        System.out.println(webSc.next());
                    }
                    running = false;
                } catch (MalformedURLException e) {
                } catch (IOException e) {
                }
            } catch (Exception e) { 
                System.out.println("Invalid URL!\n");
            }
        }
    }
}

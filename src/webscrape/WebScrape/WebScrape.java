package webscrape.WebScrape;

// Jsoup libraries
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Class where all the magic happens
public class WebScrape {
    public static void main(String[] args) {
        final String url = "https://wotlabs.net/na/player/_Nikoli_";
        int count = 0;
        try {
            final Document document = Jsoup.connect(url).get();
            for (Element row : document.select(
                    "table.gridtable.generalStats.hideMobile tr"))
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                    final String line =
                            row.select("td").text();
                    final String title =
                            row.select("td:nth-of-type(1)").text();
                    if(count == 0 || count == 13 )
                        System.out.println(line);
                    count++;
                }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
